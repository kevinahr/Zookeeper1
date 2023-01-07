import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long one = scanner.nextLong();;
        Long two = scanner.nextLong();;

        Long sum = (two / one);

        System.out.println(sum);
    }
}