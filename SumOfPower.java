import java.util.Scanner;
public class SumOfPower{

    public static int sumOfPowers(int n) {
        
        if (n == 0) {
            return 1;  
        }
        
        return (int)Math.pow(2, n) + sumOfPowers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(sumOfPowers(n));
    }
}