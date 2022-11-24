class Node:
    def __init__(self,key):
        self.right=None
        self.left=None
        self.val=key
def printPreorder(root):
    if(root):
        print(root.val,end=" ")
        printPreorder(root.left)
        printPreorder(root.right)
root=Node(1)
root.left=Node(2)
root.right=Node(3)
root.left.left=Node(4)
root.right.right=Node(5)
print("Preorder tree traversal")
printPreorder(root)
