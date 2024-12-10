package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
        // 부모는 자식 클래스의 메서드를 사용하지 못한다.


        // 다운 캐스팅 필요(부모 타입을 자식 타입으로 변환)
        Child child = (Child) poly;
        child.childMethod();
        ((Child) poly).childMethod();
    }
}
