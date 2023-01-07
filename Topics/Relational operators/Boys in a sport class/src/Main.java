import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer aa = scanner.nextInt();
        Integer bb = scanner.nextInt();
        Integer cc = scanner.nextInt();

        boolean descOrdered = (aa >= bb && bb >= cc) || (aa <= bb && bb <= cc);
        System.out.println(descOrdered);
    }
}