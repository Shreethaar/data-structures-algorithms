import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int numArr[] = {10,20,30,40,50,60,70,80,90,100};
		Arrays.sort(numArr);
		int key = 70;
		System.out.println("Key: 70");
		System.out.println(key+" found at index = " + Arrays.binarySearch(numArr,key));
	}
}

