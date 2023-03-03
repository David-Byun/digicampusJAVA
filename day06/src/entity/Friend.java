public class Friend {
    private int friendId;
    private String name;

    public Friend(int friendId, String name) {
        this.friendId = friendId;
        this.name = name;
    }

    public int getFriendId() {
        return friendId;
    }

    public int getFriendId(int id) {
        return friendId;
    }

    public void setFriendId(int friendId) {
        this.friendId = friendId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "friendId=" + friendId +
                ", name='" + name + '\'' +
                '}';
    }
}
