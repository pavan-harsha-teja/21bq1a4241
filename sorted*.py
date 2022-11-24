def merge(s1,s2):
    l3=l1+l2
    l3.sort()
    return l3
l1=[int(x) for x in input('enter elements in list1:').split()]
l2=[int(x) for x in input('enter elements in list2:').split()]
l3=merge(l1,l2)
print('sorted list',l3)
print (set(list(l3)))            