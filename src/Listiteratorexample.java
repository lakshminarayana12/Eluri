import java.util.LinkedList;
import java.util.ListIterator;

public class Listiteratorexample {
	
	public static void main(String [] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("Amma");
		l.add("nanna");
		l.add("chelli");
		l.add("kuturu");
		l.add("anna");
		ListIterator<String> li = l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
			li.add("eluri");
			
		}
		
	}

}
