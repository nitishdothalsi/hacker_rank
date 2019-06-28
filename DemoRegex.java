import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
 /**
 * @param arg
 */
public static void main(String arg[]){
	 Scanner sc=new Scanner(System.in);
		 System.out.print("What to find- ");
		 String whattofind=sc.nextLine();
		 System.out.print("Where to find- ");
		 String wheretofind=sc.nextLine();
		 int count=0;
		 	Pattern p=Pattern.compile(whattofind);
		 	Matcher m=p.matcher(wheretofind);
		 	while (m.find()) {
				count++;
				System.out.println(m.start()+">>"+m.end()+">>"+m.group());
			}
		 	System.out.println("Find "+count+" times");
	 
 }
}
