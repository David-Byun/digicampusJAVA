public class P86 {
    public static void main(String[] args) {
        String grade ="";
        String gender = "M";
        float sum = 72;

        if (gender.equals("M")) {
            if (sum >= 90) {
                grade = Grade.MGOLD.name();
            } else if (sum >= 80) {
                grade = Grade.MVIP.name();
            } else {
                grade = Grade.MNORMAL.name();
            }
        }

        switch (grade) {
            case "FVIP":
            case "MVIP":
                sum += 100;
                break;
            case "FGOLD":
            case "MGOLD":
                sum += 90;
                break;
            default:
                sum += 10;
                break;
        }


        System.out.printf("%s, %s, %f", grade, gender, sum);
        System.out.println("End..");

    }
}
