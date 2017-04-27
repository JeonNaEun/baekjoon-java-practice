
import java.util.Scanner;

public class Issue0001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T;
		T = scanner.nextInt();
		int cnt = 0;
		for (int i = 1; i <= T; i++) {
			int num = i;
			if (num % 5 == 0) {
				cnt++;
				while (num / 5 >= 5) {
					num = num / 5;
					if (num % 5 == 0) {
						cnt++;
					} else {
						break;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
