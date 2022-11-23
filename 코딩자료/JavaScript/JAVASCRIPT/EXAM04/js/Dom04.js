window.addEventListener("load", function () {
    let section = this.document.querySelector("#section1");
    let imgList = section.querySelector(".src-input");
    let colorInput = section.querySelector(".color-input");
    let imgSelect = section.querySelector(".img-select");
    let changeButton = section.querySelector(".change-button");
    let img = section.querySelector(".img");

    changeButton.onclick = function () {
        img.src = "./img/" + imgList.value + ".jpg";
        img.style['border-color'] = colorInput.value;
        // img.style.borderColor = colorInput.value;
        // 위 2개는 같은 코드.
        console.log(img.className);
    }

})