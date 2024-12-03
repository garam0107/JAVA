// 기본형과 메서드 호출
package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 a: " + a);
        changePrimtive(a);
        System.out.println("메서드 호출 후 a: " + a);
    }
    static void changePrimtive(int x){
        x = 20;
    }
}
