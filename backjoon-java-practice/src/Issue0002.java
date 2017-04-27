
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Issue0002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String T = scanner.next();
		char charArr[] = T.toCharArray();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<T.length(); i++){
			list.add((int)charArr[i]-48);
		}
		Collections.sort(list);
		int max = convert(list);
		Collections.reverse(list);
		int min = convert(list);
		int result = max + min;
		System.out.println(result);
	}
	
	public static int convert(List list){
		int num = 0;
		int mul = 1;
		for(int i=0; i<list.size(); i++){
			num += (int)list.get(i)*mul;
			mul = mul*10;
		}
		return num;
	}
}
