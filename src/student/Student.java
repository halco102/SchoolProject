package student;

import courses.Cours;
import deposit.Deposit;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Student {
    private int coursNumber;
    private String firstName,lastName;
    private int year,grade,cash;
    private int[] studentID = new int[5];
    private Cours cours;
    private Deposit deposit;


    public Student(){

    }

    public Student(Cours cours,Deposit deposit){
        this.cours=cours;
        this.deposit=deposit;

    }

    public Student(String firstName, String lastName, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }

    public Student(String firstName, String lastName, int year, int grade, int cash) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.grade = grade;
        this.cash=cash;
    }

    public String StudentIDAsString(){
        String formattedString = Arrays.toString(this.studentID)
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim();
        return formattedString;
    }

    public void setRandomCash(){
        int randomNumber ;
        int min =600;
        int max =2000;

        randomNumber=(int)(Math.random() * (max-min+1) + min);
        this.cash=randomNumber;
        this.deposit.setBalance(this.cash);
    }

    public boolean  payTuition(){
        System.out.println("Do you want to enroll in a course ? \n Y or N");
        char character ='Y';
        System.out.println("Input ");
        Scanner input = new Scanner(System.in);
        character=input.nextLine().charAt(0);
        if(character=='Y' || character=='y'){
            return true;
        }else
            return false;
    }

    private int[] RandomID(int grade){
        Random rand = new Random();
        this.studentID[0] = grade;
        for(int i = 1; i <= this.studentID.length-1 ; i ++ ){
            int randomNumbers = rand.nextInt(10);

            this.studentID[i] = randomNumbers;
        }
        return this.studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", grade=" + grade +
                ", deposit=" + deposit.getBalance() +
                ", studentID=" +  StudentIDAsString() +
                ", cours =" + cours.getCourseByNumber(this.coursNumber)+
                '}';
    }

    //getters and setters


    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public Deposit getDeposit() {
        return deposit;
    }

    public void setDeposit(Deposit deposit) {
        this.deposit = deposit;
    }

    public void setStudentID(int grade){this.RandomID(this.getGrade());}
    public int[] getStudentID() {
        return this.studentID;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash=cash;
        this.deposit.setBalance(this.cash);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getCoursNumber() {
        return coursNumber;
    }

    public void setCoursNumber(int coursNumber) {
        this.coursNumber = coursNumber;
    }

    //end getter and setter
}
