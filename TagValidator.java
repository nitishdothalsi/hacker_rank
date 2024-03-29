import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagValidator{
	public static void main(String[] args){
		Pattern p=Pattern.compile("<(.+)>([^<]+)</\\1>");
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			Matcher m=p.matcher(line);
			boolean matchfornd=false;
			while(m.find()){
				System.out.println(m.group()+"   "+m.group(1)+"   "+m.group(2));
				matchfornd=true;
			}
			if(matchfornd==false) System.out.println("None");
			
			testCases--;
		}
	}
}

/**************Descriptions***********************/
//<(.+)> :matches HTML start tags. The parentheses save the contents inside the brackets into Group #1.
//([^<]+) :matches all the text in between the HTML start and end tags.
	//We place a special restriction on the text in that it can't have the "<" symbol. 
	//The characters inside the parenthesis are saved into Group #2.
//</\\1> :is to match the HTML end brace that corresponds to our previous start brace. The \1 is here to match all text from Group #1.
