
public class ListTester {

	public static void main(String[] args) {
		List list = new List();
		//list.firstElement();
		
		list.addFirst(2);
		list.addLast(3);
		list.addLast(3);
		list.addLast(2);
		list.addFirst(1);
		
//		System.out.println(list.isItem(45));
		
		list.showAllValues();
		System.out.println();
//		list.firstElement();
		System.out.println();
		list.delete(1);
		list.delete(2);
		 
		list.showAllValues();
		
		
		
	}

}
