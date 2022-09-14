import platform
import multiprocessing

# print는 화면에 글자를 출력하라는 함수입니다.
print ("운영체제: ", platform.system())
print ("운영체제의 상세정보: ", platform.platform())
print ("운영체제 버전: ", platform.version())
print ("프로세서: ", platform.processor())
print ("CPU 수: ", multiprocessing.cpu_count())