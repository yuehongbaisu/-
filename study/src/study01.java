import java.util.Scanner;

public class study01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(fact(number));
    }
    public static long fact(int n){
        if (n == 0) return 1;
        return n * fact(n - 1);
    }
}