<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카페주문관리 - 주문관리</title>
</head>
<body>
<table style='width:100%;border:1px solid green;'>
	<tr>
	<td style='width:33%;text-align:center'><a href="/menu"><h3>메뉴관리</h3></a></td>
	<td style='width:33%;text-align:center'><h3>주문관리</h3></td>
	<td style='width:33%;text-align:center'><a href="/sales"><h3>실적관리</h3></a></td>
	</tr>
</table>
<table style='border-collapse:collapse;border:1px solid blue;' align=center>
<tr>
	<td style='border:1px solid blue;'><select id=selMenu size=20 style='width:200px'></select></td>
	<td style='border:1px solid blue;'><select id=selOrder size=20 style='width:200px'></select></td>
</tr>
<tr>
	<td style='border:1px solid blue;vertical-align:top'>
		<input type=hidden id=id>
		<input type=hidden id=totalPrice>
		<table>
		<tr>
			<td>메뉴</td><td><input type=text id=name readonly size=20></td>
		</tr>
		<tr>
			<td>수량</td><td><input type=number id=qty min=1 max=99>잔</td>
		</tr>
		<tr>
			<td>가격</td><td><input type=number id=price min=0 max=9999>원</td>
		</tr>
		<tr>
			<td colspan=2 align=center>
			<input type=button id=btnOrder value='주문'>&nbsp;
			<input type=button id=btnEmpty value='비우기'>
			</td>
		</tr>
		</table>
	</td>
	<td style='vertical-align:top'>
		<table>
		<tr><td>총금액</td><td><input type=text readonly id=total size=5>원</td></tr>
		<tr><td>모바일번호</td><td><input type=text id=mobile size=15></td></tr>
		<tr><td colspan=2><label id=lblCommnent></label></td></tr>
		<tr>
			<td colspan=2 align=center>
				<input type=button id=btnComplete value='주문완료'>&nbsp;
				<input type=button id=btnCancel value='주문취소'>
			</td>
		</tr>
		</table>
	</td>
</tr>
</table>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.ready(function(){
	//select
	getList();
})
.on('click','#btnEmpty', function(){
	$('#id, #totalPrice, #name, #qty, #price').val('');
	return false;
})
.on('click','#selMenu option', function(){ // 익명함수(unnamed function), 콜백(call back) 함수.
	let optstr = $(this).text();
	let ar = optstr.split(',');
	console.log(ar); //['2','Americano','2700']
	$('#id').val(ar[0]);
	$('#name').val($.trim(ar[1]));
	$('#qty').val(1);
	$('#price, #totalPrice').val($.trim(ar[2]));
	return false;
})
//.on('click','#qty',function(){
//	let a = $('#qty').val();
//	let b = $('#totalPrice').val();
//	let c = a*b
//	$('#price').val(c);
//	return false;
//})
.on('change','#qty',function(){
	let qty=parseInt($(this).val());
	let price = qty*parseInt($('#totalPrice').val());
	$('#price').val(price);
	return false;
})
.on('click','#btnOrder', function(){
	// select문
	if(!$('#name').val()){
		alert('주문할 메뉴를 선택하십시오.');
		return false;
	}
	let a ='<option>'+ $('#name').val()+', '+$('#qty').val()+', '+$('#price').val()+'</option>' // select에 넣을 값은 <option> 필수.
	$('#selOrder').append(a);
	let total = 0;
	$('#selOrder option').each(function(){ // <option> 안에 있는 파일만 클릭됨
		let optstr = $(this).text(); // 값만 optstr안에 들어감 ['3, Cafe Mocca, 3400']
		let ar = optstr.split(','); // ['3', ' Cafe Mocca', ' 3400']
		total = total + parseInt(ar[2]);
	})
	$('#btnEmpty').trigger('click');
	$('#total').val(total);
	return false;
})
.on('click','#btnComplete', function(){
	$('#selOrder option').each(function(){
		let optstr = $(this).text();
		let ar = optstr.split(',');
		$.post('http://localhost:8082/addOrder',{mobile:$('#mobile').val(),menu:ar[0],qty:$.trim(ar[1]),price:$.trim(ar[2])},
				function(rcv){
			$('#lblCommnent').text(optstr+" inserted");
			$('#btnCancel').trigger('click');
			setTimeout(function(){
				$('#lblCommnent').text('');
			},5000);
			//$('#selSales').append(str);			
		},'text');
	})
	return false;
})
.on('click','#btnCancel', function(){
	$('#selOrder').empty();
	$('#total, #mobile').val('');
	return false;
})

function getList(){
	$.post('http://localhost:8082/loadMenu',{},function(rcv){
		$('#selMenu').empty();
		for(i=0; i<rcv.length; i++){
			let str = '<option>'+rcv[i]['id']+', '+rcv[i]['name']+', '+rcv[i]['price']+'</option>';
			$('#selMenu').append(str);
		}
		//$('#name, #price').val('');
		$('#btnEmpty').trigger('click');
	},'json');
}
</script>
</html>