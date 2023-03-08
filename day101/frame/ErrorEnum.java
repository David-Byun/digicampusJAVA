package frame;

public enum ErrorEnum {

    NO_ITEM("A001", "아이템이 존재하지 않습니다."),
    NO_ITEM_LIST("A002", "아이템 리스트가 존재하지 않습니다.");

    String code;
    String message;

    ErrorEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
