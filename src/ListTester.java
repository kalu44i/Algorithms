
public class ListTester {

	public static void main(String[] args) {
		List list = new List();
		
		list.addFirst(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addFirst(1);
		list.addFirst(3);
		list.addLast(2);
		
		System.out.println("The list:");
		list.showAllValues();
		System.out.println("________________");
		
//		System.out.println(list.isItem(45));
		
		list.delete(1);
		list.delete(2);
		System.out.println("The list after deleting:");
		list.showAllValues();
		
		
		
	}

}
