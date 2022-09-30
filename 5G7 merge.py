def merge(a,b):
    r=[]
    r.extend(a)
    r.extend(b)
    r.sort()
    return(r)
a=[10,20,30,40,50]
b=[5,15,25,35]
r=merge(a,b)
print('the sorted merged ist=',r)

