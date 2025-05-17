package learnoperator;

public class Swap2Numbers {
    public static void main(String[] args) {
        int i = 10;
        int j = 7;
        int temp = 0;
        System.out.println("Initial value of i = " + i);
        System.out.println("Initial value of j = "+ j);
        temp = i;   // temp=10, i=10, j=7
        i = j;      //  temp=10, i=7, j=7
        j= temp;    //  temp=10, j=10, i=7
        System.out.println("Value of i after swapping = " + i);
        System.out.println("Value of j after swapping = " + j);

    }
}

/*

"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=54024:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes learnoperator.Swap2Numbers
Initial value of i = 10
Initial value of j = 7
Value of i after swapping = 7
Value of j after swapping = 10

Process finished with exit code 0

 */
