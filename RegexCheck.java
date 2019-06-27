import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.*; 

public class RegexCheck {
/************Main Methods****************/
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
		 while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));	            
	        }
    
}
        
}

class MyRegex{
	public static final String pattern = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
}


