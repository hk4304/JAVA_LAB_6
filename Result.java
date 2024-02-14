package ASS_6_part_2;

import java.util.Scanner;

public class Result extends Student implements Exam {
    double percentage;

    public Result() {
        super("", 0, 0, 0); // Initialize with empty/default values
    }

    @Override
    public void Percent_cal() {
        this.percentage = (mark1 + mark2) / 2;
    }

    public void enterStudentDetails(Scanner scanner) {
        System.out.print("Enter student name: ");
        setName(scanner.next());
        System.out.print("Enter roll number: ");
        setRoll_no(scanner.nextInt());
        System.out.print("Enter mark1: ");
        setMark1(scanner.nextDouble());
        System.out.print("Enter mark2: ");
        setMark2(scanner.nextDouble());
    }

    public String displayStudentInfo() {
        return super.toString(); // Using toString from Student class
    }

    public String displayResult() {
        Percent_cal();
        return toString();
    }

    @Override
    public String toString() {
        return "Result [percentage=" + percentage + ", name=" + name + ", roll_no=" + roll_no + ", mark1=" + mark1
                + ", mark2=" + mark2 + "]";
    }
}

