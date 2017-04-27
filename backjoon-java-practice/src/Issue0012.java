
import java.util.Arrays;
import java.util.Scanner;

public class Issue0012 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String str[] =  new String[n];
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			str[i] = scanner.next();
		}
		for (int i = 0; i < n; i++) {
			if (check(str[i])) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	public static boolean check(String word){
	      char charWord[] = word.toCharArray();
	      char groupWord[] = new char[charWord.length];
	      int index = 0;
	      groupWord[0] = charWord[0];
	      for(int i=1; i<charWord.length; i++){
	         if(charWord[i]!=charWord[i-1]){
	            for(int j=0; j<=index;){
	               if(groupWord[j]==charWord[i]){
	                  return false;
	               }
	            }
	             index++;
	               groupWord[index] = charWord[i];
	         }
	      }
	     return true;
	     }
}
