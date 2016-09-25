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
	
	public Node addElementAtFirst(int data)
	{
		if(head!=null)
		{
			Node frontNode = new Node(data);
			frontNode.next=head;
			head = frontNode;
		}
		else
		{
			head = new Node(data);
		}
		return head;
	}
	
	public Node reverseLinkedList() //using temporary nodes
	{
		
		Node current=head;
		Node prev = null;
		Node nextProcess;
		last = head;
		while(current !=null)
		{
			nextProcess = current.next;
			current.next= prev;
			prev= current;
			current = nextProcess;
		}
		head = prev;
		return head;
	}
	
	public Node reverseLinkedListRecursive()
	{
		return null;
	}
	

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addElement(1);
		list.addElement(2);
		list.addElement(3);
		list.addElement(4);
		list.addElement(5);
		list.addElementAtFirst(22);
		list.reverseLinkedList();
		LinkedList list2 = new LinkedList();
		
		list2.addElement(11);
		list2.addElement(12);
		list2.addElement(13);
		list2.addElement(14);
		list2.addElement(15);
		list2.addElementAtFirst(33);

		System.out.println();


	}

}
