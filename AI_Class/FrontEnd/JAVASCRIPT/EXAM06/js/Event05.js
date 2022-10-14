addEventListener("load", function () {
    let section = this.document.querySelector("#section1");
    let container = section.querySelector(".container");
    let box = section.querySelector(".box");
    let dragging = false;
    let boxXY = { x: 0, y: 0 };

    container.onmousedown = function (e) {
        // 선택된 것이 BOX일때만 drag 가능하도록.
        if (e.target == box) {
            dragging = true;
        }
    }
    container.onmousemove = function (e) {
        if (dragging) {
            box.style.left = e.x - boxXY.x + "px";
            box.style.top = e.y - boxXY.y + "px";

        }
    }
    container.onmouseup = function (e) {
        dragging = false;
    }
    box.onmousedown = function (e) {
        boxXY.x = e.offsetX;
        boxXY.y = e.offsetY;
    }
});