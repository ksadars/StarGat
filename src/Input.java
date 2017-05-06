/**
 * Created by ksada on 27.04.2017.
 */
import java.util.Scanner;
public class Input {
    public String ask;
    public String inpt(){
       Scanner sc = new Scanner(System.in);
       String ask = sc.nextLine();
       System.out.print("| ");
       return ask;
    }
}
