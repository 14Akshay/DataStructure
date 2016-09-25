package practice.com.linkedlist;

public class LinkedList {
	Node head;
	Node last;
	LinkedList()
	{
		head= null;
	}

	public boolean addElement(int data)
	{
		Node temp = head;
		if(head==null)
		{
			head = new Node(data);
			//head.data=data;
		}
		else{
			while(head.next!=null)
			{
				head= head.next;
			}
			head.next=new Node(data);
			last = head.next;
			head = temp;
		}
		return false;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addElement(1);
		list.addElement(2);
		list.addElement(3);
		list.addElement(4);
		list.addElement(5);
		System.out.println();


	}

}
