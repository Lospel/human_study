<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카페주문관리 - 실적관리</title>
</head>
<body>
<table style='width:100%;border:1px solid green;'>
	<tr>
	<td style='width:33%;text-align:center'><a href="/menu"><h3>메뉴관리</h3></a></td>
	<td style='width:33%;text-align:center'><a href="/order"><h3>주문관리</h3></a></td>
	<td style='width:33%;text-align:center'><h3>실적관리</h3></td>
	</tr>
</table>
<table style='text-align:center;' align=center>
	<tr>
		<td><input type=date id=start>&nbsp;~&nbsp;<input type=date id=end>
			&nbsp;<input type=button id=btnFind value='찾기'>
		</td>
	</tr>
	<tr>
		<td style='vertical-align:top;'>
		<select size=20 id=selSales style='width:240px;'></select></td>
	</tr>
	<tr>
		<td>매출액:<input type=number id=outgo>원</td>
	</tr>
</table>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click','#btnFind', function(){
	let start=$('#start').val().replace(/-/g,'');
	let end=$('#end').val().replace(/-/g,'');
	$('#selSales').empty();
	
	$.post('http://localhost:8082/getSalesList',{start:start, end:end},function(rcv){
		for(i=0; i<rcv.length; i++){
			let str='<option>'+rcv[i]['mobile']+','+rcv[i]['menu']+','rcv[i]['qty']+','rcv[i]['price']+','rcv[i]['created']+'</option>'
			$('#selSales').append(str);
		}
	},'json');
	
	$.post('http://localhost:8082/getTotal',{start:start, end:end},function(rcv){
		$('#outgo').text(rcv);
	},'text');
	return false;
}
		

</script>
</html>