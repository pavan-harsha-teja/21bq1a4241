class NewNode:
    def __init__(self,data):
        self.data=data
        self.left=self.right=None
def insertLevelorder(arr,i,n):
    root=None
    if i<n:
        root=NewNode(arr[i])
        root.left=insertLevelorder(arr,2*i+1,n)
        root.right=insertLevelorder(arr,2*i+2,n)
    return root
def inorder(root):
    if root!=None:
        inorder(root.left)
        print(root.data,end=" ")
        inorder(root.right)
if __name__=='__main__':
    arr=[1,2,3,4,5,6,6,6,6]
    n=len(arr)
    root=None
    root=insertLevelorder(arr,0,n)
    inorder(root)