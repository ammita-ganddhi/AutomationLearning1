package assignments;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {

        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();

        if (Num < 0){
            System.out.println("Number is Negative");
        }else{
            System.out.println("Number is Positive");
        }
         }
}

/*

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=58586:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.PositiveNegativeNumber
Enter a Number:
0
Number is Positive

Process finished with exit code 0

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=58597:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.PositiveNegativeNumber
Enter a Number:
-1
Number is Negative

Process finished with exit code 0

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=58605:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.PositiveNegativeNumber
Enter a Number:
1
Number is Positive

Process finished with exit code 0

 */