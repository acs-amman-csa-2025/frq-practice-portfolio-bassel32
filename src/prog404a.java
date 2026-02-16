import java.io.File;
import java.util.*;

public class prog404a {
    public static void main(String[] args) throws Exception {

        File f = new File("data/prog404a.txt");
        Scanner file = new Scanner(f);

        int[] pos = new int[50];
        int[] neg = new int[50];

        int p = 0;
        int n = 0;

        while (file.hasNextInt()) {
            int x = file.nextInt();
            if (x > 0) {
                pos[p] = x;
                p++;
            }
            if (x < 0) {
                neg[n] = x;
                n++;
            }
        }
        

        int rows = p;
        if (n > rows) rows = n;

        for (int i = 0; i < rows; i++) {
            if (i < p)
                System.out.print(pos[i] + "                  ");

            if (i < n)
                System.out.print(neg[i]);

            System.out.println();
        } 
    }
}
