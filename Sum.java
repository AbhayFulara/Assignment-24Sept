import java.util.Scanner;
class Sum{
    static int sumN(int n) {

        if(n == 0) return 0;

        return (n*n) + sumN(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println(sumN(n));
    }
}