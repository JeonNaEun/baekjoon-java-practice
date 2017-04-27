
import java.util.Scanner;
import java.util.Stack;

public class Issue0003 {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int num = scanner.nextInt();
		 int cnt = 0;
		 String str[] = new String[num];
		 for(int i=0; i<num; i++){
			str[i] = scanner.next();
		 }
		 for(int i=0; i<num; i++){
			 if(check(str[i])){
				cnt++; 
			 }
		 }
		 System.out.println(cnt);
	}
	public static boolean check(String str){
		Stack<Character> stack = new Stack<Character>();
		char charArr[] = str.toCharArray();
		stack.push(charArr[0]);
		for(int i=1; i<str.length(); i++){
			if(stack.isEmpty()){
				stack.push(charArr[i]);
			}else{
				if(stack.peek()==charArr[i]){
					stack.pop();
				}else{
					stack.push(charArr[i]);
				}
			}
		}
		if(stack.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
	
}
