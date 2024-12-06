package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct2 member1 = new MemberConstruct2("학생1", 15);
        MemberConstruct2 member2 = new MemberConstruct2("학생2", 16, 90);

        MemberConstruct2 [] members = {member1,member2};

        for(MemberConstruct2 m : members){
            System.out.println(m.name + " " + m.age + " " + m.grade);
        }
    }
}


