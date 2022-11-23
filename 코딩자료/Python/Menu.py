from order import Order
from sales import Sales
class Menu:
    def __init__(self):
        self.lMenu=[]
        # menu.txt를 찾아서 열고(Readonly)
        # 메뉴정보를 읽어서 저장한다.
        try:
            f=open('D:\AI_Class\menu.txt','r')
        except Exception as e:
            if f is not None :
                print('메뉴 파일을 열 수 없습니다.')
                return
        line=f.readline()
        while line != '' :
            ar=line.split(',')
            lMenu={'name':ar[0],'price':int(ar[1])}
            self.lMenu.append(lMenu)
            line=f.readline()
        f.close()

    def display(self):
        ndx=1
        for menu in self.lMenu:
            print('%2d %-20s %4d원'%(ndx,menu['name'],menu['price']))
            ndx+=1

    def save2file(self):
        f=open('D:\AI_Class\menu.txt','w')
        for menu in self.lMenu:
            f.write(menu['name']+','+str(menu['price'])+'\n')
        f.close()

    def build(self):
        name=input('메뉴명: ')
        while name != '' :
            price=input('가격: ')
            while not price.isnumeric():
                price=input('가격: ')
            price=int(price)
            self.lMenu.append({'name':name,'price':price})
            name=input('메뉴명: ')
        self.save2file()
    
    def update(self):   #메뉴번호, 새이름, 새가격
        menu_num=input('메뉴번호: ')
        while not menu_num.isnumeric():
                menu_num=input('메뉴번호: ')
        menu_num=int(menu_num)
        name=input('새 메뉴명: ')
        price=input('새 가격: ')
        while not price.isnumeric():
                price=input('새 가격: ')
        price=int(price)
        self.lMenu[menu_num-1]['name']=name
        self.lMenu[menu_num-1]['price']=price
        self.save2file()

    def delete(self):
        menu_num=input('삭제할 메뉴번호: ')
        while not menu_num.isnumeric():
                menu_num=input('삭제할 메뉴번호: ')
        menu_num=int(menu_num)
        del self.lMenu[menu_num-1]
        self.save2file()


Food=Menu() #인스턴스, 변수, 지역변수, 메뉴정보를 읽어서 초기화
# 1.주문입력 2.메뉴관리 3.실적보기 0.종료
Food.display()
sales=Sales()
num=input('1.주문입력, 2.메뉴관리, 3.실적보기, 0.프로그램 종료 : ')
while num != '0':
    if num == '1':
        order=Order()
        Food.display()
        order.build(Food.lMenu)
        print('주문입력완료')
        # 매출실적에 추가 with order.lOrder, order.monile
        sales.append(order.lOrder, order.mobile)
    elif num == '2':
        # print('메뉴관리완료')
        job=input('메뉴관리 - 1.추가, 2.조회, 3.수정, 4.삭제, 0.종료 : ')
        while job != '0':
            if job =='1':
                Food.build()
            elif job == '2':
                Food.display()
            elif job == '3':
                Food.update()
            elif job == '4':
                Food.delete()
            else: 
                print('작업입력오류')
            job=input('메뉴관리 - 1.추가, 2.조회, 3.수정, 4.삭제, 0.종료 : ')   
        if job == '0':
            break
    elif num == '3':
        sales.display()
        print('실적보기완료')
    else:
        print('작업입력오류')
    num=input('1.주문입력, 2.메뉴관리, 3.실적보기, 0.프로그램 종료 : ')
print('프로그램 종료')