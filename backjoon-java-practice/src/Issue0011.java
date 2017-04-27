
import java.util.Scanner;
import java.util.Stack;

public class Issue0011 {
	public static void main(String[] args) {
		 Scanner  scanner = new Scanner(System.in);
		 String num1 = scanner.next();
		 String num2 = scanner.next();
		 int r_num1 =reverseNumber(num1);
		 int r_num2 =reverseNumber(num2);
		 if(r_num1<=r_num2){
			 System.out.println(r_num2);
		 }else{
			 System.out.println(r_num1);
		 }
	}
	
	public static int reverseNumber(String str){
		Stack<Character> stack = new Stack<Character>();
		char c[] = str.toCharArray();
		String reverseNum = "";
		for(int i=0; i<c.length; i++){
			stack.push(c[i]);
		}
		for(int i=0; i<c.length; i++){
			reverseNum += stack.pop();
		}
		return Integer.parseInt(reverseNum);
	}
}
