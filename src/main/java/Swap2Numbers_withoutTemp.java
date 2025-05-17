// Swap 2 numbers without using 3'rd variable

public class Swap2Numbers_withoutTemp {
    public static void main(String[] args) {
        int i = 10;
        int j = 7;

        System.out.println("Initial value of i = " + i);
        System.out.println("Initial value of j = "+ j);

        i = i + j;      // i = 17 & j = 7
        j = i - j;      // i = 17 & j = 10
        i = i - j;      // i = 7 & j = 10

        System.out.println("Value of i after swapping = " + i);
        System.out.println("Value of j after swapping = " + j);


    }
}

/*

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=54710:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes Swap2Numbers_withoutTemp
Initial value of i = 10
Initial value of j = 7
Value of i after swapping = 7
Value of j after swapping = 10

Process finished with exit code 0

*/