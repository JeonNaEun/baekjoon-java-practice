
import java.util.Scanner;

class Issue0010 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		str = str.toUpperCase();
		char c[] = str.toCharArray();
		int length = c.length;
		int num[] = new int[length];
		for(int i=0; i<length; i++){
			int cnt=1;
			for(int j=i+1; j<length; j++){
				if(c[i]==(c[j])){
					cnt++;
				}
			}
			num[i] = cnt;
		}
		int max = num[0];
		int max_arr = 0;
		int flag = 0;
		for(int i=1; i<length; i++){
			if(max<num[i]){
				max=num[i];
				max_arr=i;
			}else if(max==num[i]){
				flag=1;
				break;
			}
		}
		if(flag ==0){
			System.out.println(c[max_arr]);
		}else{
			System.out.println("?");
			}
	}
}
