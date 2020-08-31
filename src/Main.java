import courses.Cours;
import deposit.Deposit;
import student.Student;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        /*
    • Ask the user how many new students will be added to the database.
    • The user should be prompted to enter a name and year for each student.
    • The student should have a unique 5-digit id, with the first being their grade level.
    • The student should have several course options to choose from.
    • Each course costs $600 to enroll.
    • The student should be able to check their balance and pay tuition.
    • The status of the student should show their name, id, courses, and balance.
         */
        Scanner input = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        int numberOfStudents=0,year;
        String firstName,lastName;

        System.out.println("How many students will attend this School? ");
        //input number of students
        System.out.print("Input : ");
        numberOfStudents = input.nextInt();
        //end
        //Input name and year for every student
        Student  students [] = new Student[numberOfStudents];
        Deposit deposit [] = new Deposit[numberOfStudents];
        Cours cours[] = new Cours[numberOfStudents] ;
        for(int i = 0 ; i < numberOfStudents ;i ++){
            students[i]=new Student();
            deposit[i]=new Deposit();
            cours[i]=new Cours();


            students[i].setCours(cours[i]);
            students[i].setDeposit(deposit[i]);

            //It consumes the /n character
            input.nextLine();
            //
            System.out.print("Insert First name : ");
            firstName=input.nextLine();
            students[i].setFirstName(firstName);

            System.out.print("Insert last name : ");
            lastName=input.nextLine();
            students[i].setLastName(lastName);

            System.out.print("Input year :");
            year=input.nextInt();
            students[i].setYear(year);
            //set cash test
            students[i].setRandomCash();



         }

        for(int j = 0 ; j < numberOfStudents ; j++){
            System.out.println("Student " +"[" + j + "]" + " First name " + students[j].getFirstName() + " has " + deposit[j].getBalance() + "$");

        }
        //end
        //enroll classes
        System.out.println("Choose a cours to enroll \n Every cours costs 600$");
        TimeUnit.SECONDS.sleep(1);
        cours[0].ListOfCourses();

        int chooseACourse;
        int temp=0;
        for (Student student:students) {
                System.out.print("Student " + student.getFirstName() + " choose a course :");
                chooseACourse=input.nextInt();
                student.getCours().enrollCourses(chooseACourse,deposit[temp],student);
                temp++;
        }

        //end
        //test balance after buying

            students[0].getDeposit().checkBalance();
            students[0].setGrade(4);
            students[0].StudentIDAsString();
            //System.out.println(students[0].StudentIDAsString());
        //end
    }
}
