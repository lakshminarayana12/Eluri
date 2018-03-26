import java.util.Arrays;

public class LargestAndSmallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] a= {1,2,3,10,7,22, 76, 80, 12, 14};
	Arrays.sort(a);
	for(int b: a) {
		System.out.println(b);
	}
	System.out.println(a[0]);
	int length= a.length;
	
	System.out.println(a[length-1]);
	}

}
