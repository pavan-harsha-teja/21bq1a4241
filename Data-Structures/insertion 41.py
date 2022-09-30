l=[]
n=int(input())
print("enter elements into list:")
for i in range(n):
    ele=int(input())
    l.append(ele)
print("list before sorting:")
print(l)
print("list after sorting:")
for i in range(len(l)):
    j=i-1
    ne=l[i]
    while l[j]>ne and j>=0:
        l[j+1]=l[j]
        j=j-1
    l[j+1]=ne
print(l)    