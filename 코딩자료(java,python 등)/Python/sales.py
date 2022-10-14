from datetime import datetime

class Sales :
    def __init__(self) -> None:
        self.lSales=[]  
        #매출시각, 모바일번호, 메뉴명, 수량, 금액
        
    def append(self,orderList, mobile):
        today=datetime.now().strftime("%Y-%m-%d %H:%M:%S")
        for order in orderList:
            self.lSales.append({'sold_time' : today, 'mobile':mobile, 'menu':order['menu'], 'qty':order['qty'], 'total':order['total'] })
    
    def display(self):
        grandTotal=0
        for sale in self.lSales:
            print('%-20s %11s %10s %2d %6d'%(sale['sold_time'], sale['mobile'], sale['menu'], sale['qty'], sale['total']))
            grandTotal+=sale['total']
        print('-'*50)
        print('총매출액: '+str(grandTotal))