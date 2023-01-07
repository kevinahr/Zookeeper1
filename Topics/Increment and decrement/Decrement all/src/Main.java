import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a1 = scanner.nextInt();
        Integer a2 = scanner.nextInt();
        Integer a3 = scanner.nextInt();
        Integer a4 = scanner.nextInt();

        Integer b1 = --a1;
        Integer b2 = --a2;
        Integer b3 = --a3;
        Integer b4 = --a4;

        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);


    }
}