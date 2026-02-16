import java.io.*;
import java.util.*;

public class prog260a {
    public static void main(String [] args) throws Exception {
        File f = new File("data/prog260a.txt");
        Scanner input = new Scanner(f);
        int soph = 0;
        int junior = 0;
        int senior = 0;

        while(input.hasNextInt()){
            int clas = input.nextInt();
            int grade = input.nextInt();
            int gender = input.nextInt();

            if (clas == 0 && grade == 0 && gender == 0){
                break;
            }
            if (clas == 10){
                soph++;
            }
            else if (clas == 11){
                junior++;
            }
            else if (clas == 12){
                senior++;
            }
        }
        System.out.println("Class    Number");
        System.out.println("10       " + soph);
        System.out.println("11.      " + junior);
        System.out.println("12.      " + senior);

    }
}
