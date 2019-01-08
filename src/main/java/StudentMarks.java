/*
 * %W% %E%
Komal Rani
 *
 * Copyright (c) Komal Rani All rights reserved.
 * This code has been solemnly made by Komal Rani
 * Working In Boeing India Pvt. Ltd.
 */

/**
 * This Java program a class called StudentMarks, which prompts user for the
 * number of students, reads it from the keyboard, and saves it in an
 * int variable called numOfStudents. It then prompts user for the grades of
 * each of the students and saves them in an int array called studentGrades.
 * Your program shall check that the grade is between 0 and 100 else has to
 * sthrow an error message..
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentMarks {
    private int[] studentGrade; //array that contains student marks
    private int numberOfStudent; // number of Students

    public static void main( String args[] )
    {
        StudentMarks studentMarks=new StudentMarks();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter No. of Users");
        studentMarks.numberOfStudent =in.nextInt();
        studentMarks.studentGrade=new int[studentMarks.numberOfStudent];
        System.out.println("Enter marks of Student");
        for( int i=0 ;i<studentMarks.numberOfStudent ; i++ )
        {
            try
            {
                int number=in.nextInt();
                if( number > 100 || number < 0 )
                {
                    /* Throwing exception when the number is greater than 100 and less than 0 */
                    i--;
                    throw new IllegalArgumentException();

                }
                else{
                    studentMarks.studentGrade[i]=number;
                }

            }
            catch( IllegalArgumentException e)
            {
                System.out.println("Entered No. should between 0 to 100");
            }

        }
        System.out.println(studentMarks.computeStudentGrade(studentMarks.studentGrade,studentMarks.numberOfStudent));
    }


    /* computeStudentGrade method that is called from testCases*/

    public String computeStudentGrade(int studentGrade[] , int numberOfStudent)
    {
        int flag =0;
        if( numberOfStudent != 0 )
        {
            for( int i=0 ;i < numberOfStudent ; i++ )
            {
                if( studentGrade[i] > 100 )
                {
                    return "Grade is more than 100 at index " + i;
                }
                else if( studentGrade[i] < 0)
                {
                    return "Error! entered negative Value at index " + i;
                }
                else {
                       flag =1;
                }

            }
            if( flag == 1 ) {
                return "Grade is between 1 to 100";
            }
        }
        return "You didn't enter any  Value";
    }
}
