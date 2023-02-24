package grades;

import java.util.Scanner;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] arguments) {
        var studentA = new Student("Brittney");
        studentA.addGrade(98);
        studentA.addGrade(98);
        studentA.addGrade(75);

        var studentB = new Student("Frankie");
        studentB.addGrade(76);
        studentB.addGrade(80);
        studentB.addGrade(87);

        var studentC = new Student("Jake");
        studentC.addGrade(97);
        studentC.addGrade(89);
        studentC.addGrade(87);

        var studentD = new Student("Nikki");
        studentD.addGrade(88);
        studentD.addGrade(100);
        studentD.addGrade(84);

        HashMap<String, Student> students = new HashMap<>();
        students.put("BlueSky45", studentA);
        students.put("GreenPlatypus8", studentB);
        students.put("VeggieTales9", studentC);
        students.put("NeonStars1", studentD);

        System.out.println("Here are the Github usernames of the students");
        System.out.print(" BlueSky45  |");
        System.out.print(" GreenPlatypus8  |");
        System.out.print(" VeggieTales9  |");
        System.out.println(" NeonStars1");
        while (true) {
            System.out.println("Which student would you like to see more information about?");
            Scanner scanner = new Scanner(System.in);
            String teacherSelection = scanner.nextLine();
            if (teacherSelection.equalsIgnoreCase("BlueSky45")) {
                System.out.println("Name: " + studentA.getName());
                System.out.println("Grades: " + studentA.getGrades());
                System.out.println("Current Average: " + studentA.getGradeAverage());
                System.out.println("Would you like to see another student?");
                String keepGoing = scanner.nextLine();
                if (keepGoing.equals("yes")) {
                    continue;
                } else {
                    System.out.println("Goodbye! Have a nice day!");
                    break;
                }
            } else if (teacherSelection.equalsIgnoreCase("GreenPlatypus8")) {
                System.out.println("Name: " + studentB.getName());
                System.out.println("Grades: " + studentB.getGrades());
                System.out.println("Current Average: " + studentB.getGradeAverage());
                System.out.println("Would you like to see another student?");
                String keepGoing = scanner.nextLine();
                if (keepGoing.equals("yes")) {
                    continue;
                } else {
                    System.out.println("Goodbye! Have a nice day!");
                    break;
                }
            } else if (teacherSelection.equalsIgnoreCase("VeggieTales9")) {
                System.out.println("Name: " + studentC.getName());
                System.out.println("Grades: " + studentC.getGrades());
                System.out.println("Current Average: " + studentC.getGradeAverage());
                System.out.println("Would you like to see another student?");
                String keepGoing = scanner.nextLine();
                if (keepGoing.equals("yes")) {
                    continue;
                } else {
                    System.out.println("Goodbye! Have a nice day!");
                    break;
                }
            } else if (teacherSelection.equalsIgnoreCase("NeonStars1")) {
                System.out.println("Name: " + studentD.getName());
                System.out.println("Grades: " + studentD.getGrades());
                System.out.println("Current Average: " + studentD.getGradeAverage());
                System.out.println("Would you like to see another student?");
                String keepGoing = scanner.nextLine();
                if (keepGoing.equals("yes")) {
                    continue;
                } else {
                    System.out.println("Goodbye! Have a nice day!");
                    break;
                }
            } else {
                System.out.println("Sorry, no student found with the Github username of " + teacherSelection);
                continue;
            }
        }
    }
}
