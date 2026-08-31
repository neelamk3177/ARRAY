package WEEK3;
import java.util.Scanner;
public class WaterTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        int left = 0;
        int right = n - 1;
        long maxWater = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            long water = (long) h * width;
            maxWater = Math.max(maxWater, water);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxWater);
        sc.close();
    }
}
