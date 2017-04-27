
import java.util.Scanner;

public class Issue0005 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int arr[] = new int[T];
		for (int i = 0; i < T; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; i > j; j++) {
				if (arr[j] >= arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
