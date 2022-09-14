import os

"어떤 파이썬 서버에 연결하시겠습니까?"

select=input("연결하고자 하는 파이썬 서버를 선택해주세요")

if select==1:
    os.system("ssh 10.10.10.100")
elif select ==2:
    os.system("ssh 10.10.10.200")
else:
    "1또는 2가 아닌 값입니다. 프로그램을 종료합니다"