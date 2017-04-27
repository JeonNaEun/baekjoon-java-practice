
import java.util.Scanner;

public class Issue0008 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int cnt = 0;
		while(true){
			if(num%5==0){
				System.out.println(cnt+num/5);
				break;
			}else if(num<=0){
				System.out.println("-1");
				break;
			}else{
				num-=3;
				cnt++;
			}
		}
	}
}
