import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aa = scanner.nextInt();

        if (aa < 1){
            System.out.println("no army");
        }else if (aa >= 1 && aa <=19){
            System.out.println("pack");
        }else if (aa >= 20 && aa <= 249){
            System.out.println("throng");
        }else if (aa >= 250 && aa <= 999){
            System.out.println("zounds");
        }else if (aa >= 1000){
            System.out.println("legion");
        }
    }
}