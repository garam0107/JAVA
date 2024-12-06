package acces.b;

import acces.a.AccessData;
public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();

//        data.defaultField = 2;
//        data.defaultMethod();

        data.innerAccess();
        System.out.println(data.publicField);
    }
}
