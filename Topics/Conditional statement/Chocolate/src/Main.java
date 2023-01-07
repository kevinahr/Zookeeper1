import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nn = scanner.nextInt();
        int mm = scanner.nextInt();
        int kk = scanner.nextInt();
        int area = nn * mm;
        int kCalc = area - kk;

        if (kk % mm != 0 && kk % nn != 0 && kk % nn != 0 || kk > area){
            System.out.println("NO");
        }else if (kk % nn == 0 || kk % mm == 0 && area >= kk){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}