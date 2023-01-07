import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a1 = scanner.next();
        Integer a2 = scanner.nextInt();
        Integer a3 = scanner.nextInt();;

        System.out.println(a1.substring(a2, ++a3));
    }
}