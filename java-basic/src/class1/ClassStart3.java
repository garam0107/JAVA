package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 14;
        student2.grade = 95;

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student2.name);
    }
}