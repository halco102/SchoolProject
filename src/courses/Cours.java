package courses;


import deposit.Deposit;
import student.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cours {
    private String[] coursName = {"CS50","JS Crash Course","Mathematics I","English I" };
    private final int price = 600;
    private ArrayList<Student> studentArray = new ArrayList();
    private ArrayList<String> courses = new ArrayList<>();
    private boolean close;

    public String getCourseByNumber(int coursNumber){

          String temp;
          temp = this.coursName[coursNumber];
        return temp;
    }

    public Cours(){}

    public Cours(String[] coursName) {
        this.coursName = coursName;

    }

    private boolean classEnroll(Deposit deposit,Student student){
        int temp=0;
        if(deposit.getBalance() >= 600) {
            if(student.payTuition()==true){
                temp = deposit.getBalance() - this.price;
                deposit.setBalance(temp);
                this.close=false;
            }else
            {
                System.out.println("Cancel the request");
                this.close=true;
            }
        }else{
            System.out.println("You dont have enought money on your account");
            this.close=true;
        }
        return this.close;
    }

    public void enrollCourses(int courseNumber, Deposit deposit,Student student){
                switch (courseNumber){

                    case 0:
                        if( classEnroll(deposit,student) !=true){
                            System.out.println(coursName[0]);
                            //test
                            courses.add(coursName[0]);
                            //test
                            System.out.println("Student name " + student.getFirstName() +
                                    " you are accepted in the class " + coursName[0]);
                            student.setCoursNumber(0);
                        }

                        break;
                    case 1:

                        if( classEnroll(deposit,student) !=true){
                            System.out.println(coursName[1]);
                            //test
                            courses.add(coursName[1]);
                            //test
                            System.out.println("Student name " + student.getFirstName() +
                                    " you are accepted in the class " + coursName[1]);
                            student.setCoursNumber(1);
                        }
                        break;
                    case 2:

                        if( classEnroll(deposit,student) !=true){
                            System.out.println(coursName[2]);
                            //test
                            courses.add(coursName[2]);
                            //test
                            System.out.println("Student name " + student.getFirstName() +
                                    " you are accepted in the class " + coursName[2]);
                            student.setCoursNumber(2);
                        }
                        break;
                    case 3:

                        if( classEnroll(deposit,student) !=true){
                            System.out.println(coursName[3]);
                            //test
                            courses.add(coursName[3]);
                            //test
                            System.out.println("Student name " + student.getFirstName() +
                                    " you are accepted in the class " + coursName[3]);
                            student.setCoursNumber(3);
                        }
                        break;

                    default:
                        System.out.println("You need to choose from 0 to 5");
                        break;
                }

    }//end

    public void ListOfCourses(){
        for(int i = 0 ; i < coursName.length;i++){
            System.out.println("Courses number : "+ i +" cours name " +coursName[i]);
        }
    }


    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
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

    public boolean isClose() {
        return close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }
}
