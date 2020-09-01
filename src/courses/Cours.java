package courses;


import deposit.Deposit;
import student.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cours {
    private String[] coursName = {"CS50","JS Crash Course","Mathematics I","English I" };
    private final int price = 600;
    private ArrayList<Student> studentArray = new ArrayList();

    public String getCourseByNumber(int coursNumber){

          String temp;
          temp = this.coursName[coursNumber];
        return temp;
    }

    public Cours(){}

    public Cours(String[] coursName) {
        this.coursName = coursName;

    }

    private void classEnroll(Deposit deposit,Student student){
        int temp=0;
        if(deposit.getBalance() >= 600) {
            if(student.payTuition()==true){
                temp = deposit.getBalance() - this.price;
                deposit.setBalance(temp);
            }else
            {
                System.out.println("Cancel the request");
            }
        }else{
            System.out.println("You dont have enought money on your account");
        }
    }

    public void enrollCourses(int courseNumber, Deposit deposit,Student student){
        switch (courseNumber){

            case 0:
                    System.out.println(coursName[0]);
                    classEnroll(deposit,student);
                    System.out.println("Student name " + student.getFirstName() +
                            " you are accepted in the class " + coursName[0]);
                    student.setCoursNumber(0);
                    break;
            case 1:

                    System.out.println(coursName[1]);
                    classEnroll(deposit,student);
                    System.out.println("Student name " + student.getFirstName() +
                        " you are accepted in the class " + coursName[1]);
                student.setCoursNumber(1);
                    break;
            case 2:
                    System.out.println(coursName[2]);
                    classEnroll(deposit,student);
                    System.out.println("Student name " + student.getFirstName() +
                        " you are accepted in the class " + coursName[2]);
                student.setCoursNumber(2);
                    break;
            case 3:
                System.out.println(coursName[3]);
                classEnroll(deposit,student);
                System.out.println("Student name " + student.getFirstName() +
                        " you are accepted in the class " + coursName[3]);
                student.setCoursNumber(3);
                break;

            default:
                    System.out.println("You need to choose from 0 to 5");
                    break;
        }

    }

    public void ListOfCourses(){
        for(int i = 0 ; i < coursName.length;i++){
            System.out.println("Courses number : "+ i +" cours name " +coursName[i]);
        }
    }

    public String[] getCoursName() {
        return coursName;
    }

    public int getPrice() {
        return price;
    }

    public ArrayList<Student> getStudentArray() {
        return studentArray;
    }

    public void setStudentArray(ArrayList<Student> studentArray) {
        this.studentArray = studentArray;
    }
}
