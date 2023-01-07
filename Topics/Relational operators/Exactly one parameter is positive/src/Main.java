import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer aa = scanner.nextInt();
        Integer bb = scanner.nextInt();
        Integer cc = scanner.nextInt();

        boolean a1 = (aa >= 0 && bb <= 0 && cc <= 0) || (aa <= 0 && bb >= 0 && cc <=0) ||(aa <= 0 && bb <= 0 && cc >0);
        System.out.println(a1);
    }
}