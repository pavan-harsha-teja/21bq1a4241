class Node:
    def __init__(self,key):
        self.right=None
        self.left=None
        self.val=key
def printInorder(root):
    if(root):
        printInorder(root.left)
        print(root.val,end=" ")
        printInorder(root.right)
root=Node(1)
root.left=Node(2)
root.right=Node(3)
root.left.left=Node(4)
root.right.right=Node(5)
print("Inorder tree traversal")
printInorder(root)

