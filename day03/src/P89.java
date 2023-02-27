public class P89 {
    public static void main(String[] args) {
        String grade ="";
        String gender = "F";
        float sum = 79;

        grade = (gender.equals("M")) ? ((sum >= 90) ? "MVIP" : (sum >= 80) ? "MGOLD" : "MNORMAL") : ((sum >= 90) ? "FVIP" : (sum >= 80) ? "FGOLD" : "FNORMAL");

        System.out.printf("%s, %s, %f", grade, gender, sum);
        System.out.println("End..");

    }
}
