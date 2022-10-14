addEventListener("load", function () {
    let section = this.document.querySelector("#section1");
    let imgs = section.querySelectorAll(".imgs");
    let currentImg = section.querySelector(".current-img");

    // 이벤트를 처리하기 위해서는 function 수행시 e라는 이벤트 객체를 가져와야함.
    // imgs[0].onclick = function(e){
    //     // console.log(e.target.src);
    //     currentImg.src = e.target.src;
    // }
    // imgs[1].onclick = function(e){
    //     currentImg.src = e.target.src;
    // }
    // imgs[2].onclick = function(e){
    //     currentImg.src = e.target.src;
    // }
    for (let i = 0; i < imgs.length; i++) {
        imgs[i].onclick = function (e) {
            currentImg.src = e.target.src;
        }
    }
});