import java.util.*;

class Solution6 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();  
        
        for (int i = 0; i < q; i++) {
            int a = in.nextInt(); 
            int b = in.nextInt(); 
            int n = in.nextInt(); 

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
       