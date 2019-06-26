package javaapplication;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.*; 

public class Solution {
    
        /***********Java Sub string Comparisons******/
    
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        java.util.SortedSet<String> sets=new java.util.TreeSet<String>();
        for(int i=0;i<=s.length()-k;i++){
            sets.add(s.substring(i,i+k));
            System.out.print(s.substring(i, i+k));
        
        smallest=sets.first();
        largest=sets.last();
        }
        return smallest + "\n" + largest;
    }    
        /***********Palindrome Check************/
    public static String checkPalindrome(String s){
		StringBuffer sb=new StringBuffer();
    	for(int i=s.length();i>0;i--){
    		sb.append(s.charAt(i-1));
    	}
    	return sb.toString().equals(s)?"Yes":"No";
}

/***********Check Anagrams**************/
	public static boolean isAnagram(String s1,String s2){
		boolean anagrams=false;
		if(s1.length()==s2.length()){
			char tempArray1[]=s1.toUpperCase().toCharArray();
			java.util.Arrays.sort(tempArray1);
			char tempArray2[]=s2.toUpperCase().toCharArray();
			Arrays.sort(tempArray2);
			s1=new String(tempArray1);
			s2=new String(tempArray2);
			anagrams=s1.equals(s2)?true:false;
		} else anagrams=false;
		return anagrams;
	}
        
      /***********To Camel Case*******************/  
        
public static String toCamelCase(String init) {
    if (init == null)
        return null;

    final StringBuilder ret = new StringBuilder(init.length());

    for (final String word : init.split(" ")) {
        if (!word.isEmpty()) {
            ret.append(Character.toUpperCase(word.charAt(0)));
            ret.append(word.substring(1).toLowerCase());
        
        if (!(ret.length() == init.length()))
            ret.append(" ");    
        }
    } 
    return ret.toString();
}   
    /************split the string into tokens****************/
public static String[] getTokens(String s){
    String[] token=s.split("[ !,?._'@]+");
    StringTokenizer st1=new StringTokenizer(s, "[ !,?._'@]+");
    System.out.println(st1.countTokens());
    while(st1.hasMoreTokens()){
    	System.out.println(st1.nextToken());
    }
    return token;
}

/************Pattern Syntax Checker****************/
public static boolean patternSyntaxChecker(String s){
	boolean pat=false;
	try {
		Pattern pt=Pattern.compile(s);		
		pat=true;
	} catch (Exception e) {
		pat=false;
	}
	return pat;
}

/************Regex****************/
public static boolean MyRegex(String s){	
	boolean result=false;
		String[] ip=s.split("[.]");
				//System.out.println(Arrays.toString(ip));
		if(ip.length<1 && ip.length>4) return false;
		for(int i=0;i<4;i++){
			//System.out.println(ip[i]);
			try {
				if(Integer.parseInt(ip[i])>=0 && Integer.parseInt(ip[i])<=255) result=true; break;
			} catch (Exception e) {
				return false;
			}
			
		}
	return result;
}

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
	public static final String pattern = null;

	public static boolean pattern(String s){	
		boolean result=false;
			String[] ip=s.split("[.]");
					//System.out.println(Arrays.toString(ip));
			if(ip.length<1 && ip.length>4) return false;
			for(int i=0;i<4;i++){
				//System.out.println(ip[i]);
				try {
					if(Integer.parseInt(ip[i])>=0 && Integer.parseInt(ip[i])<=255) result=true; break;
				} catch (Exception e) {
					return false;
				}
				
			}
		return result;
	}
}

