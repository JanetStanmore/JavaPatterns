# Week days implementation using linked list.

class node:
    def __init__(self, data):
        self.data=data
        self.next=None
        
class llist:
    def __init__(self):
        self.head=None
        
ll=llist()
ll.head=node("Sun")
n1=node("Mon")
ll.head.next=n1
n2=node("Tues")
n1.next=n2
n3=node("Wed")
n2.next=n3
n4=node("Thur")
n3.next=n4
n5=node("Fri")
n4.next=n5
n6=node("Sat")
n5.next=n6

print("Week Days implementation in Linked List.")
temp=ll.head
while(temp):
    if temp.next:
        print(temp.data, end=" ")
        print(hex(id(temp.next)), "-->", end=" ")
    else:
        print(temp.data, end=" ")
        print(hex(id(temp.next)))
    temp=temp.next
    