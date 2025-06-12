package assignments;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide any 1 input from 1 till 12:  ");
        int number = sc.nextInt();

        while (number > 0)
        {
            System.out.println(number ==1 ? "JAN" :
                    number == 2 ? "FEB" :
                    number == 3 ? "MAR" : number == 4 ? "APR" : number == 5 ? "MAY" :
                            number == 6 ? "JUN" : number == 7 ? "JUL" : number == 8 ? "AUG" :
                                    number == 9 ? "SEP" : number == 10 ? "OCT" :
                                            number ==11 ? "NOV" : number == 12? "DEC": "INVALID MONTH");

            break;
        }

    }
}


/*

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=61131:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.DaysOfMonth
Provide any 1 input from 1 till 12:
1
JAN

Process finished with exit code 0

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=61145:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.DaysOfMonth
Provide any 1 input from 1 till 12:
6
JUN

Process finished with exit code 0

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=61151:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.DaysOfMonth
Provide any 1 input from 1 till 12:
12
DEC

Process finished with exit code 0

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=61164:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.DaysOfMonth
Provide any 1 input from 1 till 12:
13
INVALID MONTH

Process finished with exit code 0



 */