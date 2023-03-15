package com.kbstar.frame;

import java.util.Calendar;

public class MakeAccountNumber {
    public static int cnt = 100;
    public static int cnt2 = 100;
    public static String makeTrNum() {
        String trNo = "";
        Calendar cal = Calendar.getInstance();
        trNo = "" + cal.get(Calendar.YEAR)
                + (cal.get(Calendar.MONTH)+1)
                + cal.get(Calendar.DAY_OF_MONTH)
                + cal.get(Calendar.MILLISECOND)
                + cnt2;
        cnt2++;
        return trNo;
    }
    public static String makeAccNum() {
        String accNo = "";
        Calendar cal = Calendar.getInstance();
        accNo = "" + cal.get(Calendar.YEAR)
                + (cal.get(Calendar.MONTH)+1)
                + cal.get(Calendar.DAY_OF_MONTH)
                + cal.get(Calendar.MILLISECOND)
                + cnt;
        cnt++;
        return accNo;
    }
}
