public class P85 {
    public static void main(String[] args) {
        String grade ="";
        String gender = "";
        float sum = 92;

        if ((sum < 100 && sum >= 95) || (sum <= 90 && sum > 85)) {
            grade = "VIP";
        } else if ((sum <= 80 && sum >= 75) || (sum <= 60 && sum >= 65)) {
            grade = "GOLD";
        } else {
            grade = "NORMAL";
        }

        if (gender.equals("M")) {
            System.out.println("Male..");
        } else {
            System.out.println("Femail..");
        }

        System.out.printf("%s, %s, %f", grade, gender, sum);
        System.out.println("End..");

    }
}
