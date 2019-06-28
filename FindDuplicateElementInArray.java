import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nitish
 */ 
public class FindDuplicateElementInArray {
    public static void main(String arg[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Take Array Size: ");
     int arrayinputsize=sc.nextInt();
     int arraysize[]=new int[arrayinputsize];
        for (int i = 0; i < arraysize.length; i++) {
            System.out.print("Add index "+i+" Element: ");
            arraysize[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arraysize));
        
        for (int i = 0; i < arraysize.length-1; i++) {
            for (int j = i+1; j < arraysize.length; j++) {
                if(arraysize[i] == arraysize[j]){
                    System.out.println("Matched Element: "+arraysize[i]);
                }                
            }
        }
    }
}
