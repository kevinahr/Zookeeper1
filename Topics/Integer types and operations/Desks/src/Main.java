import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer one = scanner.nextInt();
        Integer two = scanner.nextInt();
        Integer three = scanner.nextInt();

        Long remainder1 = (long) (one % 2);
        Long remainder2 = (long) (two % 2);
        Long remainder3 = (long) (three % 2);

        long avg1 = (one  / 2 + remainder1);
        long avg2 = (two  / 2 + remainder2);
        long avg3 = (three  / 2 + remainder3);



        long ans = avg1 + avg2 + avg3 ;


        System.out.println(ans);
    }
}