package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // Child, Parent가 메모리안에 있으니 참조 가능

        // 아래의 상황은 다운캐스팅 불가
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
        child2.childMethod(); // 메모리 상에 자식 타입이 존재하지 않기 때문에
    }
}
