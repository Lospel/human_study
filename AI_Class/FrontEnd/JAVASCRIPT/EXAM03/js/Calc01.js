window.addEventListener("load", function () {
    let btnPrint = this.document.getElementById("add");
    btnPrint.onclick = function () {
        let x, y;
        x = parseInt(document.getElementById("txt1").value);
        y = parseInt(document.getElementById("txt2").value);
        sum.value = x + y;
    }
}
);