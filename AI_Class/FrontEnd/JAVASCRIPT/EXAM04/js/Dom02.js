window.addEventListener("load",function(){
    let section = this.document.querySelector("#section1");
    let srcInput = section.querySelector(".src-input");
    let imgSelect = section.querySelector(".img-select");
    let changeButton = section.querySelector(".change-button");
    let img = section.querySelector(".img");

    changeButton.onclick = function(){
        srcInput.value = imgSelect.value;
        img.src="./img/"+srcInput.value + ".jpg";
    }

})