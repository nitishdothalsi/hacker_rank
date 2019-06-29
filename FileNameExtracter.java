package practice;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameExtracter {
	public static void main(String[] arg) {
		int count=0;
		Pattern p=Pattern.compile("[a-zA-Z0-9]*[.]txt");
		File f=new File("D:/OneDrive/WS_2019/HackerRank/src/practice");
		String[] s=f.list();
		for(String s1:s){
			Matcher m=p.matcher(s1);
			if(m.find() && m.group().equals(s1)){
				count++;
				System.out.println(s1);
			}
		}
		System.out.println(count);
	}
}
