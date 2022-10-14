window.addEventListener("load",function(){
    let section = this.document.querySelector("#section1");
    let srcInput = section.querySelector(".src-input");
    let changeButton = section.querySelector(".change-button");
    let img = section.querySelector(".img");

    changeButton.onclick = function(){
        img.src="./img/"+srcInput.value + ".jpg";
    }

})