addEventListener("load", function () {
    let section = this.document.querySelector("#section1");
    let fileButton = section.querySelector(".file-button");
    let fileTrigger = section.querySelector(".file-trigger");

    fileTrigger.onclick = function(e){
        console.log(e);
        let evt = new MouseEvent("click",{
            'view':window,
            'bubbles' : true, // 버블링 처리를 하는 이벤트
            'cancelable': true  // cancl이 가능하냐.
        });
        // evt라는 것은 마우스 이벤트를 담은 객체 (click이므로 클릭했을때만 이벤트 전달)

        fileButton.dispatchEvent(evt);
        // fileButton (숨김처리된 file을 선택하는 input 태그)에 이벤트를 전달.
        // 이런 것을 trigger라고 한다.
    }
});