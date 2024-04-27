import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int intArr[] = {10,20,15,22,35};
		
		System.out.println("Unsorted Array:");
		for(int i: intArr) {
			System.out.println(i);
		}

		System.out.println();

		Arrays.sort(intArr);
		System.out.println("Sorted Array:");
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]);
		}

		System.out.println();
		System.out.println("Using for each to iterate elements in array");
		for(int i : intArr) {
			System.out.println(i);
		}
	}
}
