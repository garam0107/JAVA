package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
        super(10,20); // 기본 생성자가 없으면 직접 super 생성자 해줘야 한다.
        System.out.println("ClassC 생성자");
    }
}
