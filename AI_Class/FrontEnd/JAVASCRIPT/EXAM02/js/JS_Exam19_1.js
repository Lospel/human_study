// window.onload = function () {
// 2개 이상의 이벤트처리함수는 addEventListener로 처리
window.addEventListener("load", function () {
    let btnPrint = document.getElementById("btnInput");
    // btnPrint는 button 객체를 의미함.
    btnPrint.onclick = function () {
        let x, y;
        x = eval(prompt('x값 입력', 0));
        y = eval(prompt('y값 입력', 0));
        btnInput.value = x + y;
    };
});