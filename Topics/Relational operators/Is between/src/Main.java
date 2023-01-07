import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Integer aa = scanner.nextInt();
       Integer bb = scanner.nextInt();
       Integer cc = scanner.nextInt();

       boolean a1 = (aa >= bb && aa < cc) || (aa <= bb && aa >= cc);
        System.out.println(a1);
    }
}