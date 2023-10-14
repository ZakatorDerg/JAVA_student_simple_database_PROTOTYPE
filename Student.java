import java.util.Scanner;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int index;

    Student() {
        completeData();
    }

    Student(Student other) {
        this.name = other.name;
        this.surname = other.surname;
        this.age = other.age;
        this.index = other.index;
    }
    Student(String name, String surname, int age, int index) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.index = index;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public int getIndex() {
        return this.index;
    }

    public void setName(String otherName) {
        this.name = otherName;
    }

    public void setSurname(String otherSurname) {
        this.surname = otherSurname;
    }

    public void setAge(int otherAge) {
        this.age = otherAge;
    }

    public void setIndex(int otherIndex) {
        this.index = otherIndex;
    }

    public String toString() {
        return "name :" + this.name + "\nsurname: " + this.surname + "\nage: " + this.age + "\nindex: " + this.index;
    }

    public void completeData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name: ");
        this.name = scanner.next();
        System.out.println("Insert surname: ");
        this.surname = scanner.next();
        System.out.println("Insert age: ");
        this.age = scanner.nextInt();
        System.out.println("Insert index: ");
        this.index = scanner.nextInt();
    }
}
