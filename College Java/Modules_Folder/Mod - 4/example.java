import java.util.*;

class Student {
    int rollno;
    String name;
    int age;
    Scanner sc = new Scanner(System.in);

    void get() {
        rollno = sc.nextInt();
        name = sc.next();
        age = sc.nextInt();
    }
}

class LListdemo {
    public static void main(String arg[]) {
        LinkedList<Student> list = new LinkedList<Student>();
        Student s = new Student();
        s.get();
        list.add(s);
        Student st[] = new Student[4];
        for (int i = 0; i < 4; i++) {
            st[i] = new Student();
            st[i].get();
            list.add(st[i]);
        }
        // list.add(new Student(12,"hari",19));
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Student std = (Student) itr.next();
            System.out.println(std.rollno);
            System.out.println(std.name);
            System.out.println(std.age);
        }
    }
}