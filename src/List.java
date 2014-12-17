import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



/**
 * The class describes an item of the Linked List. Add an item to the first
 * position; Add an item to the last position; Delete item from a list; Check if
 * value is in a list; Show all list
 * 
 * @author Nick Veremeichyk
 *
 */
class MyList implements List<Object> {

	Node top = null;

	/**
	 * Describe an item of the list
	 * 
	 * @author Nick Veremeichyk
	 *
	 */
	class Node {
		int value;
		Node next;

		Node(int value) { // Item constructor
			this.value = value;
		}

	}

	/**
	 * Adds value to the first position in the list
	 * 
	 * @param value
	 */
	void addFirst(int value) {
		if (top == null) {
			Node item = new Node(value);
			top = item;
			item.next = null;
		} else {
			Node item = new Node(value);
			item.next = top;
			top = item;
		}
	}

	/**
	 * Adds item to the end of list;
	 * 
	 * @param value
	 * 
	 */

	void addLast(int value) {
		Node item = new Node(value);
		item.next = null;
		Node temp2 = top;
		while (temp2.next != null) {
			temp2 = temp2.next;
		}
		temp2.next = item;

	}

	// /*Add an item between two items*/
	// void addBetween(int value) {
	//
	// Node item = new Node(value);
	// Node temp2 = top;
	// while (temp2 != insItem) {
	// temp2 = temp2.next;
	// }
	// // insItem.next = item;
	//
	// }

	/**
	 * Delete an item from a list
	 * 
	 * @param value
	 * 
	 */
	void delete(int value) {
		Node item1 = top;
		Node prev = null;

		if (item1 == null) {
			System.out.println("A node with that value does not exist.");
		}
		while (item1 != null) {
			if (top == null) {
				return;
			}
			if (top.value == value) {
				top = top.next;
			}

			else if (item1.value != value) {
				prev = item1;
				item1 = item1.next;
			}

			else {
				prev.next = item1.next;
				item1 = item1.next;
			}
		}
	}

	/**
	 * Check if the value is contained in a list;
	 * 
	 * @param value
	 * @return True (if an item is contained in list) of False (if an item isn't
	 *         contained in list);
	 */
	boolean isItem(int value) {
		Node item = top;
		while (item != null) {
			if (item.value == value) {
				return true;
			} else {
				item = item.next;
			}

		}
		return false;
	}

	// /**
	// * Receives the first list's element;
	// */
	// void firstElement() throws NullPointerException {
	// try {
	// System.out.println(top.value);
	// } catch (NullPointerException e) {
	// System.out.println("The list is empty");
	// }
	// }

	/**
	 * Print the list;
	 */
	void showAllValues() {
		Node item = top;
		while (item != null) {
			System.out.println(item.value);
			item = item.next;
		}
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
