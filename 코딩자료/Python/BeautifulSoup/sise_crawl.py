import sys
from os.path import exists
from tkinter import N 
from selenium import webdriver

def save2file(code,daily):
    f=open(code+'.txt','a')
    daily.reverse()
    for d in daily:
        f.write('\n'+d['date']+','+d['price'])
    f.close()        
    print(code+'.txt was generated.')
        
# options=webdriver.ChromeOptions()
# options.add_argument('window-size=1,1')
# print(len(sys.argv))
# sys.exit(0)
stock=[]
try:
    if len(sys.argv)>1:
        for i in range(1,len(sys.argv)):
            print(sys.argv[i])
            stock.append({'code':sys.argv[i],'name':sys.argv[i]})
        # sys.exit(-1)
    else:            
        f=open('stock.txt','r')
        for line in f.readlines():
            ar=line.split(',')
            stock.append({'code':ar[0],'name':ar[1]})
        f.close()    
except:
    print("stock.txt does not exists.")
    sys.exit(0)

stock.reverse()
driver=webdriver.Chrome('chromedriver.exe')
for itm in stock:  
    print('code='+itm['code']+', name='+itm['name'])  
    code=itm['code']    
    daily=[]
    try:
        # print("exist ["+str(exists(code+'.txt'))+"]")
        if exists(code+'.txt'):
            f=open(code+'.txt','r')
            quote=','
            for quote in f.readlines():
                pass
            ar=quote.split(',')
            last=ar[0]
            f.close()
        else:
            last=''
        print("last ["+last+"]")
        x=1
        first=''
        while True:
            url=f'https://finance.naver.com/item/sise_day.naver?code={code}&page={x}'
            if x%100!=0:
                print(".",end="")
            else:
                print(".")
            driver.get(url)
            start=3
            for i in range(10):
                if i==5:
                    start+=3
                datestr=driver.find_element_by_xpath(f'/html/body/table[1]/tbody/tr[{i+start}]/td[1]/span').text.replace('.','')
                if datestr==last:
                    raise Exception("Recent quotes have been scraped.")
                price=driver.find_element_by_xpath(f'/html/body/table[1]/tbody/tr[{i+start}]/td[2]/span').text.replace(',','')
                if first==datestr:
                    raise Exception("reached to the end of sise. ["+first+","+datestr+"]")
                if i==0:
                    first=datestr
                daily.append({'date':datestr,'price':price})
            x+=1   
    except KeyboardInterrupt:
        print("\nControl-Break")
        save2file(code,daily)
        sys.exit()             
    except Exception as e:            
        pass
    save2file(code,daily)
    # if input('continue?')=='n':
    #     break