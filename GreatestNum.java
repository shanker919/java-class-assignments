package geekster.java;
import java.util.Scanner;
public class GreatestNum {
	public static void main(String[] args) {
		
	int a,b,c;
	
	Scanner s = new Scanner(System.in);
	
	System.out.print("enter the a =");
	a = s.nextInt();
	
	System.out.print("enter the b =");
	b = s.nextInt();
	
	System.out.print("enter the c =");
	c = s.nextInt();
	
	if(a>b){
		if(a>c)
			System.out.println(a);
		else
			System.out.println(c);
		
	}else {
		if(b>c)
			System.out.println(b);
		else
			System.out.println(c);
	}
 }
}