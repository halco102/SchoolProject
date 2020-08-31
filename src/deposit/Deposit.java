package deposit;

import student.Student;

public class Deposit {

    private Student student;
    private int balance;

    public Deposit(){

    }

    public Deposit(Student student){
        this.student = student;
        this.balance=student.getCash();
    }

    public void checkBalance(){
        System.out.println("You have " +this.balance + " on this account");
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        this.student.setCash(this.balance);

    }

}
