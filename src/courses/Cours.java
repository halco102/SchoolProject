package courses;


import deposit.Deposit;
import student.Student;

public class Cours {
    private String[] coursName = {"CS50","JS Crash Course","Mathematics I","English I" };
    private final int price = 600;


    public Cours(){}

    public Cours(String[] coursName) {
        this.coursName = coursName;

    }

    public void enrollCourses(int courseNumber, Deposit deposit,Student student){
        int temp=0;
        switch (courseNumber){

            case 0:
                if(deposit.getBalance() >= 600) {
                    if(student.payTuition()==true){
                    System.out.println(coursName[0]);
                    System.out.println("Student name " + deposit.getStudent().getFirstName());
                    temp = deposit.getBalance() - this.price;
                    deposit.setBalance(temp);
                    }else
                    {
                        System.out.println("Cancel the request");
                    }
                }else{
                    System.out.println("You dont have enought money on your account");
                }
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


}
