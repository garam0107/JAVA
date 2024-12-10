package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        // 업캐스팅
        Parent parent1 = child; // (부모) 생략가능
        Parent parent2 = (Parent) child;

        parent2.parentMethod();
        parent1.parentMethod();


    }
}
