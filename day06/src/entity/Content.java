public class Content {
    private int contentId;
    private String content;
    private int isliked;

    public Content(int contentId, String content) {
        this.contentId = contentId;
        this.content = content;
    }

    public int likeNum(int contentId) {
        return isliked++;
    }

    @Override
    public String toString() {
        return "Content{" +
                "contentId=" + contentId +
                ", content='" + content + '\'' +
                '}';
    }

    public int getContentId() {
        return contentId;
    }

    public String getContent() {
        return content;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
