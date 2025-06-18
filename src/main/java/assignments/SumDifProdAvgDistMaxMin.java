package assignments;

import java.util.Scanner;

public class SumDifProdAvgDistMaxMin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Integer Numerator Input:  ");
        float i1 = sc.nextFloat();
        System.out.println("Enter First Integer Denominator Input:  ");
        float den_i1 = sc.nextFloat();

        System.out.println("Enter Second Integer Numerator Input:  ");
        float i2 = sc.nextFloat();
        System.out.println("Enter Second Integer Denominator Input:  ");
        float den_i2 = sc.nextFloat();


      //  System.out.println("Input i1 = " + i1/den_i1 + " and Input i2 = " + i2/den_i2);

        float sum = (i1/den_i1) + (i2/den_i2);
        System.out.println(" Sum of both digits = " + sum );

        float difference = (i1/den_i1) - (i2/den_i2);
        System.out.println(" Difference/Distance = " + difference );

        float product = (i1/den_i1) * (i2/den_i2);
        System.out.println(" Product = " + product );

        float average = ((i1/den_i1) + (i2/den_i2))/2;
        System.out.println(" Average = " + average );

        System.out.println(" Maximum value is " + (i1/den_i1 > i2/den_i2/den_i2 ? i1/den_i1 : i2/den_i2));
        System.out.println(" Minimum value is " + (i1/den_i1 < i2/den_i2 ? i1/den_i1 : i2/den_i2));







    }
}


/*
"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=55232:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.SumDifProdAvgDistMaxMin
Enter First Integer Numerator Input:
3
Enter First Integer Denominator Input:
4
Enter Second Integer Numerator Input:
6
Enter Second Integer Denominator Input:
9
 Sum of both digits = 1.4166667
 Difference/Distance = 0.08333331
 Product = 0.5
 Average = 0.7083334
 Maximum value is 0.75
 Minimum value is 0.6666667

Process finished with exit code 0


"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=55334:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.SumDifProdAvgDistMaxMin
Enter First Integer Numerator Input:
-9
Enter First Integer Denominator Input:
1
Enter Second Integer Numerator Input:
10
Enter Second Integer Denominator Input:
1
 Sum of both digits = 1.0
 Difference/Distance = -19.0
 Product = -90.0
 Average = 0.5
 Maximum value is 10.0
 Minimum value is -9.0

Process finished with exit code 0

* */