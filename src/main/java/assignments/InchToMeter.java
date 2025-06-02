package assignments;


import java.text.DecimalFormat;
import java.util.Scanner;

public class InchToMeter {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the inches: ");

        while(true)
        {
            if(s.hasNextDouble()) {
                double inches = s.nextDouble();
                DecimalFormat df = new DecimalFormat("0.00");
                double meters = inches * 0.0254;
                System.out.println("Inches to meter conversion is: " + df.format(meters));
                break;
            }else{
                System.out.print("Invalid input. Re-enter the correct input for inch: ");
                s.next();
            }
        }
    }
}

/*

 "C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=63659:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\AutomationLearning\target\classes assignments.InchToMeter
 Enter the inches: 1wq
 Invalid input. Re-enter the correct input for inch: wwq.33
 Invalid input. Re-enter the correct input for inch: 333.55%
 Invalid input. Re-enter the correct input for inch: #S%
 Invalid input. Re-enter the correct input for inch: -1000.467
 Inches to meter conversion is: -25.41

 Process finished with exit code 0


 */