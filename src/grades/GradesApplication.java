package grades;
import java.util.HashMap;
import util.Input;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {


        HashMap<String, Student> students = new HashMap<String, Student>();
        Student one = new Student("herb");
        one.addGrade(80);
        one.addGrade(90);
        one.addGrade(95);

        Student two = new Student("Paul");
        two.addGrade(85);
        two.addGrade(94);
        two.addGrade(93);

        Student three = new Student("Steve");
        three.addGrade(82);
        three.addGrade(93);
        three.addGrade(96);

        Student four = new Student("Rajib");
        four.addGrade(87);
        four.addGrade(97);
        four.addGrade(91);



        students.put("Nikki", one);
        students.put("Jay", two);
        students.put("Jordy", three);
        students.put("Josh", four);


        //System.out.println("GitHub usernames of our Students:\n");




        System.out.println("\n\nWhat student would you like to see more information on?");
        boolean run = true;
        while (run) {
            Input a = new Input();
            String input = a.getString();
//            if (students.containsKey(input)) {
            for (Map.Entry<String, Student> set : students.entrySet()) {
                if (input.equalsIgnoreCase(set.getKey())) {
                    System.out.println("Name: " + set.getValue().getName() + " - "
                            + "Github Username: " + set.getKey() +
                            "\n" + "Current Average: " + set.getValue().getGradeAverage());
//                    }



                } else if (input.equalsIgnoreCase("n")) {
                    System.out.println("Good bye!");
                    break;
                }


            }


        }

    }
}
