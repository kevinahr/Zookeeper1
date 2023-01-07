import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        String three = scanner.nextLine();

        System.out.println("The form for " + one + " is completed. We will contact you if we need a chef who cooks " + three + " dishes and has "+ two + " years of experience.");
    }
}