
public class GenAvg {
    public static void main(String[] args) {
        int[] nums = new int[50];
        int sum = 0;


    for (int i = 0; i < nums.length; i++) {
        nums[i] = (int)(Math.random() * 100) + 1;
        sum += nums[i];
    }

    double average = sum / nums.length;
    System.out.println("Average: " + average);
    }


}
