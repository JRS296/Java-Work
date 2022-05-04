//Question Set - 10
//Name: Jonathan Rufus Samuel (20BCT0332)

import java.util.*;

public class CourseException extends Exception {
    CourseException(String mesg, String Course) {
        System.out.println(mesg);
        System.out.println("Invalid Course ID: " + Course);
    }

    CourseException(String mesg, int num) {
        System.out.println(mesg);
        System.out.println("Invalid Course Number: " + num);
    }

    CourseException(int credits, String mesg) {
        System.out.println(mesg);
        System.out.println("Invalid Credits number: " + credits);

    }
}

class ExceptionExample {
    public static void checkCourse(String name) throws CourseException {
        int len = name.length();
        int flag = 0;
        if (len != 3) {
            flag = 1;
            System.out.println("Error Code 1: Invalid Course Name");
            throw new CourseException("Invalid Name Entered", name);
        }
        if (flag == 0) {
            System.out.println("Course Code Valid");
        }
    }

    public static void checkCourseNum(int num) throws CourseException {
        String x = String.valueOf(num);
        int len = x.length();
        int flag = 0;
        if (len != 4) {
            flag = 1;
            System.out.println("Error Code 2: Invalid Course Number");
            throw new CourseException("Invalid Name Entered", num);
        }
        if (flag == 0) {
            System.out.println("Course Number is Valid");
        }
    }

    public static void checkCreditCount(int credno) throws CourseException {
        int flag = 0;
        if (credno != 1 || credno != 2 || credno != 3 || credno != 4) {
            flag = 1;
            System.out.println("Error Code 3: Invalid Credit Number");
            throw new CourseException(credno, "Invalid Credits for Course Entered");
        }
        if (flag == 0) {
            System.out.println("Course Credits Valid");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter 6 Courses to be Checked: ");
        String CourseCode[] = new String[6];
        int Credits[] = new int[6];
        Boolean status[] = {true, true, true, true, true, true, true};

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            //input.nextLine();
            CourseCode[i] = input.nextLine();
            Credits[i] = input.nextInt();
            System.out.println();
        }

        for (int i = 0; i < 1; i++) {
            int len = CourseCode[i].length();
            String courseID = CourseCode[i].substring(0, 3);
            int courseNum = 0;
            try{
                courseNum = Integer.parseInt(CourseCode[i].substring(3, len));
            }catch(Exception e)
            {
                System.out.println(e);
                System.out.println("Cant Parse Character via ParseInt");
            }
            
            int credits = Credits[i];

            try {
                checkCourse(courseID);
            }catch (CourseException e1) {
                System.out.println("Exception occured: " + e1);
            }

            try {
                checkCourseNum(courseNum);
            }catch (CourseException e2) {
                System.out.println("Exception occured: " + e2);
            }

            try {
                checkCreditCount(credits);
            } catch (CourseException e3) {
                System.out.println("Exception occured: " + e3);
            }
        }
    }
}
