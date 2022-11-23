window.addEventListener("load", function () {
    let btnPrint = this.document.getElementById("add");
    btnPrint.onclick = function () {
        let section = document.getElementById("section1");
        let input = section.getElementsByClassName("txt");
        // input[0] : txt1 / input[1] : txt2
        // console.log(input);
        // console.log(input[0]);

        let x, y;
        x = parseInt(input[0].value);
        y = parseInt(input[1].value);
        sum.value = x + y;
    }
}
);