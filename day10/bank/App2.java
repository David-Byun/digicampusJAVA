package bank;

import bank.DTO.UserDTO;
import bank.frame.MakeMessage;
import bank.frame.Service;
import bank.service.ItemService;
import bank.service.SearchService;
import bank.service.UserService;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args)  {
        Service<String, UserDTO> service = new UserService();
        SearchService search = new ItemService();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input command(q, i, d, u, s)");
            String cmd = sc.next();

            if (cmd.equals("q")) {
                System.out.println("Bye");
                break;

            } else if (cmd.equals("i")) {
                System.out.println("Input ID...");
                String id = sc.next();
                System.out.println("Input Name...");
                String name = sc.next();
                System.out.println("Input Password...");
                String pwd = sc.next();

                //값 입력 받아서 객체를 만들어서 전달
                UserDTO user = new UserDTO(id, pwd,name);
                try {
                    service.register(user);
                } catch (Exception e) {
                    System.out.println(MakeMessage.makeMessage(e.getMessage()));
                }

            } else if(cmd.equals("s")){
                search.search();

            }
            else if (cmd.equals("d")) {
                System.out.println("Input ID...");
                String id = sc.next();
                try {
                    service.remove(id);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println(MakeMessage.makeMessage(e.getMessage()));
                }

            } else if (cmd.equals("u")) {
                //수정하면 모든 정보가 다 날라감(수정한 정보만 변경)
                System.out.println("Input ID...");
                String id = sc.next();
                System.out.println("Input Name...");
                String name = sc.next();
                System.out.println("Input Password...");
                String pwd = sc.next();

                //값 입력 받아서 객체를 만들어서 전달
                UserDTO user = new UserDTO(id, pwd, name);
                try {
                    service.modify(user);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println(MakeMessage.makeMessage(e.getMessage()));
                }
            }
        }
        sc.close();
    }
}
