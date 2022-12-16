
// Chart.js 설정
var ctx = document.getElementById('myChart').getContext('2d');

const chartData = 'https://gist.githubusercontent.com/Jverma/076377dd0125b1a508621441752735fc/raw/b3c1e1bdafd135d6cd01f5a4b53f1bd347dacd03/iris.csv';

d3.csv(chartData).then(makeChart);

function makeChart(players) {

    var irisName = players.map(function(d) {return d.Name});
    var irisSl = players.map(function(d) {return d.SepalLength});
    var irisSw = players.map(function(d) {return d.SepalWidth});
    var irisPl = players.map(function(d) {return d.PetalLength});
    var irisPw = players.map(function(d) {return d.PetalWidth});

    var chart = new Chart(ctx, {

    // 차트 종류를 선택
    type: 'line',

    // 차트를 그릴 데이터
    data: {
        labels: irisName,
        datasets: [{
            label: 'SepalLength',
            backgroundColor: 'transparent',
            borderColor: 'red',
            data: irisSl
            }, 
            {
            label: 'SepalWidth',
            backgroundColor: 'transparent',
            borderColor: 'orange',
            data: irisSw
            },
            {
            label: 'PetalLength',
            backgroundColor: 'transparent',
            borderColor: '#999966',
            data: irisPl
            },
            {
            label: 'PetalWidth',
            backgroundColor: 'transparent',
            borderColor: '#33CC00',
            data: irisPw
            }
        ]
    },
    // 옵션
        options: {
            responsive: true,
            plugins: {
            legend: {
                position: 'top',
            },
            title: {
                display: true,
                text: 'Iris Scatter Chart'
            }
        }
    },             
});
}
