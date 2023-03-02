import java.util.Calendar;

public class MakeAccountNumber {
    public static String makeAccNum() {
        String accNum = "";
        double value = Math.random();
        Calendar cal = Calendar.getInstance();
        accNum = "" + cal.get(Calendar.YEAR) + (cal.get(Calendar.MONTH) + 1) + cal.get(Calendar.DAY_OF_MONTH) + cal.get(Calendar.MILLISECOND) +  (int)(Math.random()*10 + 1);
        return accNum;
    }
}

