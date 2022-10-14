import urllib.request as req
from bs4 import BeautifulSoup

# f=open('005930.txt','w')
lName=['삼성전자','현대자동차','sk하이닉스','엘지에너지솔루션','엘지화학','네이버','삼성SDI']
lStock=['005930','005380','000660','373220','051910','035420','006400'] #삼성전자,현대자동차,sk하이닉스
i=0
for x in lStock:
    url="https://finance.naver.com/item/sise.naver?code="+x
    res=req.urlopen(url).read().decode('euc-kr') # webpage(html)을 res에 문자열로 저장
    # print(res)
    soup=BeautifulSoup(res,"html.parser")
    selector=f'#middle > dl > dd:nth-child(5)'
    datastr=soup.select_one(selector)
    txtstr=datastr.text.split(' ')
    print(lName[i],",",txtstr[1])
    i+=1
# start=3
# for i in range(10):
#     if i==4:
#         start+=3
#     selector1=f'table.type2 > tbody > tr:nth-child(3) > td:nth-child(1) > span'
#     # print(selector1)
#     stockname=soup.select_one(selector1)
#     selector2=f'table.type2 > tbody > tr:nth-child(3) > td:nth-child(2) > span'
#     price=soup.select_one(selector2)
#     print(stockname,"=",price)
        # f.write(stockname+'='+ price+'\n')
# f.close()       