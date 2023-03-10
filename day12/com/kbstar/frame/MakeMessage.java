package com.kbstar.frame;

public class MakeMessage extends RuntimeException {
    public static String makeMessage(String code) {
        String result = "";
        switch (code) {
            case "EX0004" :
                result = "입력한 내용이 올바르지 않습니다.";
                break;
            case "EX0002" :
                result = "에러가 발생했습니다. 내용을 확인해보세요.";
                break;
            case "EX0001" :
                result = "확인된 에러를 조치하시고 다시 이용해주세요.";
                break;
            default:
                result = "에러가 발생하였습니다. 고객센터로 문의해주세요";
                break;
        }
        return result;
    }
}
