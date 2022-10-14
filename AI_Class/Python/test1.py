from bs4 import BeautifulSoup as bs
import urllib.request

try:
    base_url = 'https://beomi.github.io/beomi.github.io_old'
    source_code=urllib.request.urlopen(base_url)
    plain_text=source_code.read()
    convert_data=bs(plain_text, 'html.parser')
    print(convert_data)

    for atag in convert_data.findAll('a'):  # <a href=''> string </a>
        print(atag.string)
except Exception as e:
    print('error 발생')