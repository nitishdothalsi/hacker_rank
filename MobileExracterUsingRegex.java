import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileExracterUsingRegex {
	public static void main(String[] args) throws Exception {
        PrintWriter pw=null;
            pw = new PrintWriter("output.txt");
            Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
            FileReader fr=new FileReader("input.txt");
            BufferedReader br=new BufferedReader(fr);
            String line=br.readLine();
            while (line!=null) {
                //System.out.println(line);
            	Matcher m=p.matcher(line);
                    //System.out.println(m.start()+">>"+m.end());
            	while (m.find()) {                    
					pw.println(m.group());
				}
				line=br.readLine();				
			}
            pw.flush();
    }
}
