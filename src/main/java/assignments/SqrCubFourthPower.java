package assignments;

import java.util.Scanner;

public class SqrCubFourthPower {
    public static void main(String[] args) {

        SqrCubFourthPower pow = new SqrCubFourthPower();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: " );
       float input_number = sc.nextFloat();

        float squ = pow.square(input_number);
        System.out.println("Square = " + squ );

        float cub =  pow.cube(input_number);
        System.out.println("Cube = " + cub);

        float four = pow.fourth(input_number);
        System.out.println("Fourth Power = " + four);


    }

     float square(float s1){
        float s = s1*s1;
        return s;
    }

    float cube(float c1){
        float c = c1*c1*c1;
        return c;
    }

    float fourth(float f1){
        float f = f1*f1*f1*f1;
        return f;
    }

}

/*
"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=57890:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.SqrCubFourthPower
Enter your number:
10
Square = 100.0
Cube = 1000.0
Fourth Power = 10000.0

Process finished with exit code 0

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=57914:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.SqrCubFourthPower
Enter your number:
2
Square = 4.0
Cube = 8.0
Fourth Power = 16.0

Process finished with exit code 0

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=57929:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.SqrCubFourthPower
Enter your number:
89
Square = 7921.0
Cube = 704969.0
Fourth Power = 6.274224E7

Process finished with exit code 0

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=57986:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.SqrCubFourthPower
Enter your number:
134
Square = 17956.0
Cube = 2406104.0
Fourth Power = 3.2241792E8

Process finished with exit code 0

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=58004:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.SqrCubFourthPower
Enter your number:
34.5
Square = 1190.25
Cube = 41063.625
Fourth Power = 1416695.0

Process finished with exit code 0

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=58018:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.SqrCubFourthPower
Enter your number:
-45
Square = 2025.0
Cube = -91125.0
Fourth Power = 4100625.0

Process finished with exit code 0







*/