import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        // TO DO
        DAO dao = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input command(q, i, d, u)");
            String cmd = sc.next();
            if (cmd.equals("q")) {
                System.out.println("Bye");
                break;
            } else if(cmd.equals("i")) {
                System.out.println("Input ID...");
                String id = sc.next();
                System.out.println("Input PWD...");
                String pwd = sc.next();
                System.out.println("Input NAME...");
                String name = sc.next();

            //값 입력 받아서 객체를 만들어서 전달
                UserDTO user = new UserDTO(id, pwd, name);
                dao.insert(user);

            } else if(cmd.equals("d")) {


            } else if(cmd.equals("u")) {

            }
        }
        sc.close();
    }
}
