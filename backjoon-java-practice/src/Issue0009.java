
import java.util.Scanner;
import java.util.TreeSet;

public class Issue0009 {
	
	public static void main(String[]args){
		
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		TreeSet<String> set = new TreeSet<String>();
		for(int i=0; i<T; i++){
			set.add(scanner.next());
		}
		String arr[] = new String[set.size()];
		int index=0;
		for(String str : set){
			arr[index]=str;
			index++;
		}
		for(int i=arr.length-1; i>0; i--){
			for(int j=0; j<i; j++){
				String temp = arr[j];
				if(arr[j].length()>arr[j+1].length()){
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
