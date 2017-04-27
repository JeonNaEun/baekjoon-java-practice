
import java.util.*;

public class Issue0013 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		float max = 0;
		List<Float>list = new ArrayList<Float>();
		float avg[] = new float[n];
		
		for(int i=0; i<n; i++){
			list.add(scanner.nextFloat());
		}
		Collections.sort(list);
		max = list.get(n-1);
		for(int i=0; i<n; i++){
			avg[i] = list.get(i)/max*100;
		}
		float result = 0;
		float sum = 0;
		for(int i=0; i<n; i++){
			sum+=avg[i];
		}
		result = sum/n;
		System.out.printf("%.2f",result);
	}
}
