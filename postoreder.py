class Node:
    def __init__(self,key):
        self.right=None
        self.left=None
        self.val=key
def printPostorder(root):
    if(root):
        printPostorder(root.left)
        printPostorder(root.right)
        print(root.val,end=" ")
root=Node(1)
root.left=Node(2)
root.right=Node(3)
root.left.left=Node(4)
root.right.right=Node(5)
print("Postorder tree traversal")
printPostorder(root)