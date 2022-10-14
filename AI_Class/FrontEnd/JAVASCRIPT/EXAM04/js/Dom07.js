window.addEventListener("load", function () {
    let notices = [
        { "id": 5, "title": "가입인사2", "content": "안녕하세요1", "writer": "강우혁" },
        { "id": 6, "title": "가입인사3", "content": "안녕하세요2", "writer": "강주혁" }
    ]

    let section = this.document.querySelector("#section1");
    let cloneButton = section.querySelector(".clone-button");
    let inputButton = section.querySelector(".input-button");
    let noticeList = section.querySelector(".notice-list");
    let tbodyNode = section.querySelector("tbody");

    cloneButton.onclick = function () {
        let trNode = noticeList.querySelector("tbody tr");
        // tbody tr 을 포함하는 자손 모두 가져옴.
        let cloneNode = trNode.cloneNode(true);
        // cloneNode(true)이면 자손 모두 카피(tr 이하 모두 카피). false이면 최상위 노드만 카피.
        // false이면 tr만 카피(td는 생략됨).

        tbodyNode.appendChild(cloneNode);
    }

    inputButton.onclick = function () {
        let trNode = noticeList.querySelector("tbody tr");
        let cloneNode = trNode.cloneNode(true);
        tbodyNode.appendChild(cloneNode);
        // copy해서 붙여넣음.

        let tdsNode = cloneNode.querySelectorAll("td");
        console.log(tdsNode);
        
        tdsNode[0].textContent = notices[0].id;
        tdsNode[1].textContent = notices[0].title;
        tdsNode[2].textContent = notices[0].content;
        tdsNode[3].textContent = notices[0].writer;
    }
})