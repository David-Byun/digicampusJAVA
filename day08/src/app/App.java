package app;

import dto.UserDTO;
import frame.Service;
import service.UserService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Service<String, UserDTO> service = new UserService();
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
                service.register(user);

            } else if (cmd.equals("d")) {
                System.out.println("Input ID...");
                String id = sc.next();
                service.remove(id);

            } else if (cmd.equals("u")) {
                //수정하면 모든 정보가 다 날라감(수정한 정보만 변경)
                System.out.println("Input ID...");
                String id = sc.next();
                System.out.println("Input PWD...");
                String pwd = sc.next();
                System.out.println("Input NAME...");
                String name = sc.next();
                UserDTO user = new UserDTO(id, pwd, name);
                service.modify(user);
            }
        }
        sc.close();
    }
}
