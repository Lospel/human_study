window.addEventListener("load", function () {
    let section = this.document.querySelector("#section1");
    let titleInput = section.querySelector(".title-input");
    let addButton = section.querySelector(".add-button");
    let delButton = section.querySelector(".del-button");
    let menuList = section.querySelector(".menu-list");

    addButton.onclick = function() {
        let txtNode = document.createTextNode(titleInput.value);
        menuList.appendChild(txtNode);

    }
    delButton.onclick = function() {
        let txtNode = menuList.childNodes[0];
        // let txtNode = menuList.children[0];
        // childNodes : 태그를 포함하지 않는 모든 객체
        // children : 태그로 이루어진 모든 객체
        menuList.removeChild(txtNode);
    }

})