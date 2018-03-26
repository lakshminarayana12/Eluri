import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Eluri");
		a.add("AAAA");
		a.add("aaa");
		a.add("1");
		//System.out.println(a);
		//System.out.println(a.get(2));
		
		
ListIterator lt = a.listIterator();
while(lt.hasNext()) {
	Object ee = lt.next();
	if(ee.equals("aaa")) {
		lt.add("Lakshminarayana");
		
	}
	}
System.out.println(a);
	}

}
//array list internally uses dynamic array to store elements
//linked list uses double linked list
//arrylist is best choice when user wants to store and retrive objects
//arraylist is worst choice if we want to remove elements be