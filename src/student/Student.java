package student;

import courses.Cours;

import java.util.Random;
import java.util.Scanner;

public class Student {

    private String firstName,lastName;
    private int year,grade,cash;
    private int[] studentID = new int[5];

    public Student(){

    }

    public void setRandomCash(){
        int randomNumber ;
        int min =600;
        int max =2000;

        randomNumber=(int)(Math.random() * (max-min+1) + min);
        this.cash=randomNumber;
    }

    public boolean  payTuition(){
        System.out.println("Do you want to enroll in this class ? \n Y or N");
        char character ='Y';
        System.out.println("Input ");
        Scanner input = new Scanner(System.in);
        character=input.nextLine().charAt(0);
        if(character=='Y' || character=='y'){
            return true;
        }else
            return false;
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

    private int[] RandomID(){
        Random rand = new Random();
        this.studentID[0] = this.grade;
        for(int i = 1; i <= this.studentID.length-1 ; i ++ ){
            int randomNumbers = rand.nextInt(10);

            this.studentID[i] = randomNumbers;
        }
        return this.studentID;
    }


    public int[] getStudentID() {
        return RandomID();
    }


    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash=cash;
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

}
