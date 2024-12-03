package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count= " + bigData.count);
        System.out.println("bigData.data= " + bigData.data);

        System.out.println("bigData.data.value= " + bigData.data.value);
        // Data data = new Data()로 생성을 하고 참조 값을 넣어주면 된다
    }
}
