package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data datab = dataA;

        dataA.value = 20;
        //dataB.value도 20(참조하는 dataA의 value가 20이기 때문에 참조값만 복사해저 전달)
    }
}
