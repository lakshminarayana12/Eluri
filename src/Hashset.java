import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("ccc");
		s.add("bbb");
		s.add("aaa");
		s.add("eluri");
		s.add("lakshminarayana");
		Iterator<String> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
