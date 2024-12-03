package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 80);
        Student student2 = createStudent("학생2", 16, 85);
        printStudent(student1);
        printStudent(student2);

    }
    static Student createStudent(String name, int age, int grage){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grage = grage;
        return student;
    }

    static void printStudent(Student student){
        System.out.println(student.name + "," + student.age + ','+ student.grage );
    }

}

