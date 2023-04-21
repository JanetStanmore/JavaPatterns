# Insertion at the beginning using linked list
# Reverse.

class node:
   def __init__(self, data):
       self.data=data
       self.next=None
       
class llist:
    def __init__(self):
        self.head=None
        
ll=llist()
ll.head = node("o")
n1=node("l")
n2=node("a") 
n3=node("h")

n3.next=n2
n2.next=n1
n1.next=ll.head
ll.head=n3

temp=ll.head
while temp:
    print(temp.data, end=" ")
    temp=temp.next


