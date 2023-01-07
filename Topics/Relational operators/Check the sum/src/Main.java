import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer aa = scanner.nextInt();
        Integer bb = scanner.nextInt();
        Integer cc = scanner.nextInt();

        boolean a1 = (aa + bb) == 20 || (aa + cc) == 20 || (bb + cc) == 20;

        System.out.println(a1);


    }
}