public class App {
    public static void main(String[] args) {
        Member member1 = new Member(1, "peter");
        member1.makeContent(1, "컨텐츠1");
        member1.makeContent(2, "컨텐츠2");
        member1.makeContent(3, "컨텐츠3");

        member1.makeFriend(1, "친구1");
        member1.makeFriend(2, "친구2");
        member1.makeFriend(3, "친구3");

        System.out.println(member1);
        System.out.println(member1.countContents());
        System.out.println(member1.countFriends());
        System.out.println("============================================================");

        member1.deleteContent(1);
        member1.deleteFriend(1);


        System.out.println(member1);
        System.out.println(member1.countContents());
        System.out.println(member1.countFriends());
        System.out.println("============================================================");
    }
}
