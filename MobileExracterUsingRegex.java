import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class MobileExracterUsingRegex {
    public static void main(String[] args) {
        PrintWriter pw=null;
        try {
            pw = new PrintWriter("output.txt");
            Pattern p=Pattern.compile("(0|91)");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MobileExracterUsingRegex.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.close();
        }
    }
}
