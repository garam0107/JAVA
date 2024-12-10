package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call (){
        publicValue = 1;
        protectedValue = 2;
        //defaultvalue : 다른 패키지 접근 불가
        publicMethod();
        protectedMethod(); // protectd는 같은 패키지 아니어도 상속관계면 접근 가능
        printParent();
    }
}
