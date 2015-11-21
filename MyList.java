package listPackage;

public class MyList {
	private ListItem newItem;

	public void add(int item) {
		ListItem last = new ListItem();
		last.item = item;
		if (newItem == null) {
			newItem = last;
		} else {
			last.next = newItem;
			newItem = last;
		}
	}

	public int get(int index) {
		ListItem last = newItem;
		for (int i = 0; i < index; i++) {
			last = last.next;
		}
		return last.item;
	}

	public void print() {
		ListItem last = newItem;
		while (last != null) {
			System.out.println(last.item);
			last = last.next;
		}
	}

	public void remove(int index) {
		if (newItem == null) {
			return;
		}
		ListItem last = newItem;
		while (last.next != null) {
			if (last.next.item == index) {
				last.next = last.next.next;
				return;
			}
			last = last.next;
		}
	}

	public void removeAll() {
			newItem = null;
			System.out.println("Empty list");
	}
}
