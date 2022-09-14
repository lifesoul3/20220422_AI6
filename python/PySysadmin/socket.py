import socket
host=socket.gethostbyname_ex("www.google.com")
#print(host)

(hostname,aliaslist,ipaddrlist)=host
print("restart")
print(host)
print("end")
print(ipaddrlist[0])