package assignments;

import java.util.Scanner;

public class MinutesYearsDays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Minutes:  ");

        while (true) {

            if (sc.hasNextLong()) {
                long min = sc.nextLong();
                if (min > 0) {
                    convertMin(min);
                    break;
                } else {

                    System.out.println("Invalid minutes entered. Please enter a non-negative integer.");
                    System.out.println("Enter Valid non-negative Minutes: ");
                }
            } else {
                System.out.println("Invalid input. Please enter minutes in integer format");
                sc.next();
                System.out.println("Enter Valid integer in Minutes ");
            }
        }sc.close();
    }

    public static void convertMin(long min){

        long year = min / (60 * 24 * 365);
        long remaining_mins = min % (60 * 24 * 365);
        long days = remaining_mins / (60 * 24);

        System.out.println(min + " minutes is approximately " + year + " year/'s and " + days + " day/'s. ");

    }
}



/*
"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=59740:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.MinutesYearsDays
Enter Minutes:
525600
525600 minutes is approximately 1 year/'s and 0 day/'s.

Process finished with exit code 0

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=59773:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.MinutesYearsDays
Enter Minutes:
1254875
1254875 minutes is approximately 2 year/'s and 141 day/'s.

Process finished with exit code 0


"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=59821:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.MinutesYearsDays
Enter Minutes:
-1
Invalid minutes entered. Please enter a non-negative integer.
Enter Valid non-negative Minutes:
1234.abc
Invalid input. Please enter minutes in integer format
Enter Valid integer in Minutes
abc.2234
Invalid input. Please enter minutes in integer format
Enter Valid integer in Minutes
1234.6578
Invalid input. Please enter minutes in integer format
Enter Valid integer in Minutes
897656
897656 minutes is approximately 1 year/'s and 258 day/'s.

Process finished with exit code 0



* */