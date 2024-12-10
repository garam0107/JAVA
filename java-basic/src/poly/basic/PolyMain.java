package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴츠 참조

        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        // 자식 변수가 부모 인스턴스 참조는 안됨
        // Child의 메서드 호출 x


    }
}