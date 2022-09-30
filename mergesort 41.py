def merge(arr,l,m,r):
    n1=m-l+1
    n2=r-m
    l=[0]*(n1)
    R=[0]*(n2)
    for i in range(0,n1):
        l[i]=arr[1+i]
    for j in range(0,n2):
        r[j]=arr[1+j]
    i=0
    j=0
    k=l
    while i<n1 and j<n2:
        if l[i]<=r[j]:
            arr[k]=l[j]
            i+=1
        else:
            arr[k]=r[j]
            j+=1
            k+=1
    while i<n1:
        arr[k]=l[i]
        i+=1
        k+=1
    while j<n2:
        arr[k]=r[j]
        j+=1
        k+=1
def mergesort(arr,l,r):
    if l<r:
        m=l+(r-1)//2
        mergesort(arr,l,m)
        mergesort(arr,m+1,r)
        merge(arr,l,m,r)
arr=[]
n=int(input())
print("enter list elements:")
for i in range(n):
    ele=int(input())
    arr.append(ele)
for i in range(n):
    print("%d"%arr[i],end="")
mergesort(arr,0,n-1)
print("\n\r sorted array is")
for i in range(n):
    print("%d"%arr[i],end="")