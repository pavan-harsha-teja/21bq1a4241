l=[]
n=int(input("how many elements that you want to enter:"))
print("enter the elements in the list:")
for i in range(n):
    x=int(input())
    l.append(x)
print(l)    
flag=0
req=int(input("enter the element that you want to search in the list:"))
for i in range(n):
    if l[i]==req:
        print("element found at index:",i)
        flag=1
        break
    if flag==0:
       print("element is not found in the list") 
