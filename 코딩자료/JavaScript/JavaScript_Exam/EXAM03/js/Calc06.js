window.addEventListener("load", function () {
    let btnPrint = this.document.getElementById("add");
    btnPrint.onclick = function () {
        let section = document.getElementById("section1");
        let input_x = section.querySelector("input[name='txt1']");
        let input_y = section.querySelector("input[name='txt2']");
        // querySelector를 통해서 복수개가 선택이 되어질 때에는 맨앞의 1개만 가져온다.
        // 복수개 선택을 위해서는 querySelectorAll을 사용해서 배열변수로 데이터 처리한다.

        let x, y;
        x = parseInt(input_x.value);
        y = parseInt(input_y.value);
        sum.value = x + y;
    }
}
);