/**
 * 
 */
package practice.com.linkedlist;

/**
 * @author BlackBird
 *
 */
public class LinkedListTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();

		list.addElement(1);
		list.addElement(2);
		list.addElement(3);
		list.addElement(4);
		list.addElement(5);
		list.addElementAtFirst(22);
	//	list.reverseLinkedList();
		LinkedList list2 = new LinkedList();

		list2.addElement(11);
		list2.addElement(12);
		list2.addElement(13);
		list2.addElement(14);
		list2.addElement(15);
		list2.addElementAtFirst(33);
		list2.addElementAtFirst(44);

		System.out.println();
		
		Node reverseNode = list.reverseLinkedListRecursive(list.head);
		list.head = reverseNode;
		System.out.println();

		list.printList();
		list2.printList();

		Node ans = list2.findNodeRecursive(list2.head, 15);
		System.out.println();
		
		int size1 = list.getSize();
		int size2 = list2.getSize();
		System.out.println();

	}

}
