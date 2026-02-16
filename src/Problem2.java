import java.io.*;
import java.util.*;
public class Problem2 {
    public static void main(String[] args) throws Exception {
        File f = new File("data/problem2.txt");
        Scanner in = new Scanner(f);
        int[] ids = new int[21];
        int[] scores = new int[21];
        for (int i = 0; i < 21; i++){
            ids[i] = in.nextInt();
            scores[i] = in.nextInt();
        }
        double sum = 0.0;
        for (int i = 0; i < 21; i++){
            sum += scores[i];
        }
        double avg = sum / 21;
        for (int i = 0; i < 21; i++){
            System.out.println(ids[i] + " " + scores[i] + " " + (scores[i] - avg));
        }
        System.out.println(avg);

    }
    
}
