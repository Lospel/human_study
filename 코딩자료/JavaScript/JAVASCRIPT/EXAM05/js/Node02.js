addEventListener("load", function () {
    let section = this.document.querySelector("#section1");
    let noticeList = section.querySelector(".notice-list");
    let delButton = section.querySelector(".del-button");
    let swapButton = section.querySelector(".swap-button");
    let tbodyNode = section.querySelector("tbody");
    let allCheckBox = section.querySelector(".overall-checkbox");

    allCheckBox.onchange = function () {
        let inputs = tbodyNode.querySelectorAll("input[type='checkbox']");
        // inputs[0]~[2] ==> 하단의 체크박스
        console.log(inputs);
        for (let i = 0; i < inputs.length; i++) {
            inputs[i].checked = allCheckBox.checked;
        }
    }

    delButton.onclick = function () {
        let inputs = tbodyNode.querySelectorAll("input[type='checkbox']:checked");
        // 체크가 된 input 태그 
        for (let i = 0; i < inputs.length; i++) {
            inputs[i].parentElement.parentElement.remove();
        }
    }

    swapButton.onclick = function () {
        let inputs = tbodyNode.querySelectorAll("input[type='checkbox']:checked");
        if (inputs.length != 2) {
            alert("2개만 선택해주세요");
            return;
        }
        let trs = [];
        for (let i = 0; i < inputs.length; i++) {
            trs.push(inputs[i].parentElement.parentElement);
            // inputs ==> input 태그 
            // inputs[i].parentElement ==> td 태그
            // inputs[i].parentElement.parentElement ==> tr 태그
            // trs.push 함수는 tr 태그를 자손까지 모드 카피해서 trs에 반영.
        }
        let clonNode = trs[0].cloneNode(true);
        // true는 자손까지 모두 선택 후 카피.
        trs[1].replaceWith(clonNode);
        trs[0].replaceWith(trs[1]);
    }

});