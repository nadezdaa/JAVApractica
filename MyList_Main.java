package listPackage;

public class MyList_Main {
	public static void main(String[] args) {
		MyList list= new MyList();
		list.add(8);
		list.add(3);
		list.add(101);
		list.print();
		System.out.println();
		
		list.remove(3);
		list.print();
		System.out.println();
		
		list.removeAll();
		list.print();
		
	}

}
/*
 * Output:
 * 101
  	3
	8

	101
	8

	Empty list
 */
