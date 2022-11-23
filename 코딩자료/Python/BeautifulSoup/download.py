import urllib.request as req
from bs4 import BeautifulSoup
import sys
import logging

logging.basicConfig(filename="stock.log",encoding='utf-8',level=logging.DEBUG)
scode=[]
try:
    x=1
    while True:
        url=f"https://finance.naver.com/sise/sise_market_sum.naver?&page={x}"
        print(url)
        logging.info(url)
        res=req.urlopen(url).read().decode('euc-kr') # webpage(html)을 res에 문자열로 저장
        soup=BeautifulSoup(res,"html.parser")
        start=2
        for i in range(50):
            if i>4 and i%5==0:
                start+=3
            selector1=f'div.box_type_l > table.type_2 > tbody > tr:nth-child({i+start}) > td:nth-child(2) > a'
            # <a href='https://finance.naver.com/sise/...code=xxxx'>string</a>
            stock=soup.select_one(selector1)
            str1=stock['href'] # '/item/main_naver?code=005930'
            n=str1.find('code=') # -11
            n+=5
            selector2=f'div.box_type_l > table.type_2 > tbody > tr:nth-child({i+start}) > td:nth-child(3)'
            price=soup.select_one(selector2).string
            scode.append({'code':str1[n:n+6],'name':stock.string,'price':price})
            # { 'code': '005930', 'name':'삼성전자', 'price':'54,400'}
        x+=1       
except KeyboardInterrupt:
    print("Control-Break was pressed.")
    sys.exit()     
except:        
    pass
finally:
    f=open('stock.txt','w')
    for dict in scode:
        f.write(dict['code']+','+dict['name']+','+dict['price']+'\n')
    f.close()       
    print('stock.txt was created.') 
    logging.debug('stock.txt was created.')
    