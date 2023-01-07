import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a1 = scanner.nextInt();

        boolean b1 = (a1 < 10) && (a1 > 0);

        System.out.println(b1);

    }
}