import java.util.ArrayList;
import java.util.TreeSet;

public class treesetexample {

	public static void main(String[] args) {
		TreeSet  t= new TreeSet();
		t.add("aaaa");
		t.add("ddd");
		t.add("ccc");
		t.add("bbb");
		System.out.println(t);
		ArrayList l = new ArrayList(t);
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
	}

}
