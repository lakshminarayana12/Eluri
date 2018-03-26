
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {
	Vector<String> a = new Vector<String>();
	a.add("Eluri");
	a.add("AAAA");
	a.add("aaa");
	a.add("1");
	Enumeration<String> E = a.elements();
	while(E.hasMoreElements()) {
		System.out.println(E.nextElement());
	}
	
	//System.out.println(a);
	//System.out.println(a.get(2));
	}

}
