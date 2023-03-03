import java.util.ArrayList;
import java.util.List;

public class Member {
    private int memberId;
    private String name;

    private List<Content> contentList = new ArrayList<>();
    private List<Friend> friendList = new ArrayList<>();

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public void makeContent(int id, String content) {
        contentList.add(new Content(id, content));
    }

    public void makeFriend(int id, String name) {
        friendList.add(new Friend(id, name));
    }

    public List<Content> allContent() {
        return contentList;
    }

    public int countContents() {
        return contentList.toArray().length;
    }

    public int countFriends() {
        return friendList.toArray().length;
    }

    public void deleteContent(int id) {
        contentList.remove(id - 1);
    }

    public void deleteFriend(int id) {
        friendList.remove(id-1);
    }

    public List<Friend> allFriend() {
        return friendList;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", contentList=" + contentList +
                ", friendList=" + friendList +
                '}';
    }
}
