package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();
        // 임시적 다운캐스팅
        ((Child) poly).childMethod();
    }
}