
import java.util.Scanner;

public class Issue0004 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		String T = scanner.next();
		char charArr[] = T.toCharArray();
		int num[] = new int[T.length()];
		for(int i=0; i<T.length(); i++){
			int cnt=0;
			for(int j=0; j<T.length(); j++){
				if(charArr[i]==charArr[j]){
					cnt++;
				}
			}
			num[i]=cnt;
		}
		for(int i=0; i<num.length; i++){
			if(num[i]==1){
				System.out.print(charArr[i]);
			}
		}
	}
}
