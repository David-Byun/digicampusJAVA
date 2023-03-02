package bank;

import java.util.Calendar;

public class MakeAccountNumber {
    public static String makeAccNum() {
        String accNum = "";
        Calendar cal = Calendar.getInstance();
        //1월이 0부터 시작함
        accNum = "" + cal.get(Calendar.YEAR) + (cal.get(Calendar.MONTH) + 1) + cal.get(Calendar.DAY_OF_MONTH)
                + cal.get(Calendar.MILLISECOND);
        return accNum;
    }
}
