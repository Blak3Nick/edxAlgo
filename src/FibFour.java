
import java.util.Scanner;

public class FibFour {

    int fibs[];

    FibFour(int number) {
        fibs = new int[number+1];
        fibs[0] = 0;
        fibs[1] = 1;

    }

    private int calc(int number) {
        int count =2;

        while (count <= number) {
            fibs[count] = (fibs[count-1] + fibs[count-2]) %10;
            //System.out.println(fibs[count]);
            count ++;
        }
        return fibs[number];

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        FibFour fib = new FibFour(number);
        System.out.println(fib.calc(number));
//        for (int i=0; i<fib.fibs.length; i++){
//            System.out.print(fib.fibs[i]);
//        }

    }
}
