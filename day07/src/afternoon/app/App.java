package app;

import dao.AccountOracleDAO;
import dto.AccountDTO;
import dto.UserDTO;
import frame.DAO;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        DAO dao = new AccountOracleDAO();
        AccountDTO account = new AccountDTO("100", "자유저축", 1000);

        // UserDTO user = new UserDTO("id01", "pwd01", "james");
        // dao.insert(user);

        // DAO 데이터 전달 역할만 함
        // Service 비즈니스 로직을 처리하고 필터링 된 데이터들을 DAO 로 전달
        // DAO -> Oracle 로 전달

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input command(q, i, d, u)");
            String cmd = sc.next();

            if (cmd.equals("q")) {
                System.out.println("Bye");
                break;

            } else if (cmd.equals("i")) {
                System.out.println("Input ID...");
                String id = sc.next();
                System.out.println("Input PWD...");
                String pwd = sc.next();
                System.out.println("Input NAME...");
                String name = sc.next();

                //값 입력 받아서 객체를 만들어서 전달
                UserDTO user = new UserDTO(id, pwd, name);
                dao.insert(user);

            } else if (cmd.equals("d")) {
                System.out.println("Input ID...");
                String id = sc.next();
                dao.delete(id);

            } else if (cmd.equals("u")) {
                //수정하면 모든 정보가 다 날라감(수정한 정보만 변경)
                System.out.println("Input ID...");
                String id = sc.next();
                System.out.println("Input PWD...");
                String pwd = sc.next();
                System.out.println("Input NAME...");
                String name = sc.next();
                UserDTO user = new UserDTO(id, pwd, name);
                dao.update(user);
            }
        }
        sc.close();
    }
}
