import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedhashsetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s = new LinkedHashSet<String>();
		s.add("AAA");
		s.add("BBB");
		s.add("DDD");
		s.add("CCC");
		Iterator<String> l =s.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		

	}

}
