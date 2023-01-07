import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int rev = 0;

        while(num != 0){
            rev = rev * 10 + num % 10;
            num = num /10;

        }
        System.out.println(rev);
    }
}