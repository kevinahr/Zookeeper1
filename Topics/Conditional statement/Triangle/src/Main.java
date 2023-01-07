import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aa = scanner.nextInt();
        int bb = scanner.nextInt();
        int cc = scanner.nextInt();

        if (aa + bb > cc && aa + cc > bb && bb + cc > aa){
            System.out.println("YES");

        }else System.out.println("NO");
    }
}