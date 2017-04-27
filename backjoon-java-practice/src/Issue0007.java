
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Issue0007 {

	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		List<Integer> list =  new ArrayList<Integer>();
		//int N = scanner.nextInt();
		
		while(true){
			int n = scanner.nextInt();
			if(n==0){
				break;
			}else{
				list.add(n);
			}
		}
		
		for(int i=0; i<list.size(); i++){
			int cnt = 0;
			int N = (int)list.get(i);
			for(int j=N+1; j<=2*N; j++){
				if(primeNum(j)==1){
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	}
	
	public static int primeNum(int num){
		if(num!=1){
			for(int i=2; i<=Math.sqrt(num); i++){
				if(num%i==0){
					return 0;
				}
			}
			return 1;
		}
		return 0;
	}
}
