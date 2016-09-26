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

	public Node reverseLinkedListRecursive(Node head)
	{
		if(head == null || head.next==null)
			return head;
		
		Node reverseNode = reverseLinkedListRecursive(head.next);
		head.next.next=head;
		head.next=null;
		
		return reverseNode;
	}
	
	public void printList()
	{
		Node temp = head;
		//System.out.println(temp.data+"-->");
		while(temp!=null)
		{
			System.out.print(temp.data);
			if(temp.next!=null)
				System.out.print("-->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public Node findNode(int data)
	{

		while(head!=null)
		{
			if(head.data==data)
				return head;

			head= head.next;
		}
		return null;
	}
	
	public Node findNodeRecursive(Node head,int data)
	{
		if(head==null)
			return null;
		if(head.data==data)
			return head;
		
		Node ans = findNodeRecursive(head.next,data);
		return ans;
	}
	
	public int getSize()
	{
		int size = 0;
		while(head!=null)
		{
			head = head.next;
			size++;
		}
		return size;
	}


	

}
