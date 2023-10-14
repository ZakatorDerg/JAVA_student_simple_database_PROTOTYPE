import java.util.*;

public class Main {
    public static List<Student> students = new ArrayList<>();

    public static void removeObject() {
        System.out.println("Type index of student You want to remove");
        int code = new Scanner(System.in).nextInt();
        for(Student x : students){
            if (code == x.getIndex()) {
                students.remove(x);
                break;
            }
        }
    }

    public static Student findObject(int index) {
        for(Student x : students){
            if (index == x.getIndex()) {
                return x;
            }
        }
        return null;
    }

    public static void copyStudentInList() {
        int index = new Scanner(System.in).nextInt();
        for(Student x : students) {
            if (x.getIndex() == index) {
                Student m = new Student(x);
                students.add(m);
                break;
            }
        }
    }

    public static void printList() {
        for(Student x : students) {
            System.out.println(x);
            System.out.println("------------");
        }
    }

    public static void main(String[] args) {
        int a = 0;
        while(a != 7) {
            System.out.println("Student Database options :\n1 - add student\n2 - remove student\n3 - get Student by index\n4 - sort by index\n5 - print all\n6 - copy Student\n7 - finish program");
            a = new Scanner(System.in).nextInt();
            switch(a) {
                case 1:
                    students.add(new Student());
                    break;
                case 2:
                    removeObject();
                    System.out.println("Student has been removed from the list type 5 to view the list");
                    break;
                case 3:
                    System.out.println("Type index of student You want to find");
                    int code = new Scanner(System.in).nextInt();
                    System.out.println(findObject(code));
                    break;
                case 4:
                    Collections.sort(students, Comparator.comparingInt(Student::getIndex));
                    System.out.println("List of students have been sorted type 5 to view the list");
                    break;
                case 5:
                    printList();
                    break;
                case 6:
                    copyStudentInList();
                    break;
                default:
                    break;
            }
        }
    }
}