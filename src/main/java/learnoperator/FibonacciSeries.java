package learnoperator;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        System.out.println("Enter the Number for Fibbonaci Series: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.print(" Fibonacci Series is: " + n1 +" " + n2);

        for (int i = 2; i<=N; i++)
        {
            sum = n1 + n2;
            System.out.print(" "+ sum);
             n1 = n2;
             n2 = sum;

        }

    }
}

/*

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=59431:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes learnoperator.FibonacciSeries
Enter the Number for Fibbonaci Series:
20
 Fibonacci Series is: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
Process finished with exit code 0


 */