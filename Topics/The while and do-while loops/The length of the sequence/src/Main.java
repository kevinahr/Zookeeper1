import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var = 0;
        while (scanner.hasNextInt()){
            if (scanner.nextInt() != 0)
                var++;
            else
            System.out.println(var);
        }



    }
}