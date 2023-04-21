# Insertion at any specific location in linked list.

class Node:
    def __init__(self, data):
        self.data=data
        self.next=None
        
class Llist:
    def __init__(self):
        self.head=None
   
if __name__ == "__main__":

    ll=Llist()
    ll.head=Node("a")
    n1=Node("b")
    n2=Node("c")
    n3=Node("d")
    n4=Node("e")

    ll.head.next=n1
    n1.next=n2
    n2.next=n3
    n3.next=n4

    temp=ll.head
    while temp:
        print(temp.data, end=" ")
        temp=temp.next
        
    h=Node("i")
    temp1=ll.head
    while temp1 != None:
        if temp1.data == "d":
            temp1.next = h
            h.next=n4
            break
        temp1=temp1.next
       
    print("\n") 
    l=ll.head
    while l:
        print(l.data, end=" ")
        l=l.next
        
