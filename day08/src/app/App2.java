package app;

import dto.ItemDTO;
import frame.SearchService;
import frame.Service;
import service.ItemService;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Service<Integer, ItemDTO> service = new ItemService();
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
                int id = Integer.parseInt(sc.next());
                System.out.println("Input Name...");
                String name = sc.next();
                System.out.println("Input Price...");
                double price = Double.parseDouble(sc.next());
                System.out.println("Input Quantity...");
                int qt = Integer.parseInt(sc.next());

                //값 입력 받아서 객체를 만들어서 전달
                ItemDTO item = new ItemDTO(id, name, price, qt);
                service.register(item);

            } else if(cmd.equals("s")){
                search.search();
            }
            else if (cmd.equals("d")) {
                System.out.println("Input ID...");
                try {
                    int id = Integer.parseInt(sc.next());
                    service.remove(id);
                } catch (NumberFormatException e) {
                    System.out.println("잘못된 정보로 실패하였습니다 " + e.getMessage());
                }

            } else if (cmd.equals("u")) {
                //수정하면 모든 정보가 다 날라감(수정한 정보만 변경)
                System.out.println("Input ID...");
                int id = Integer.parseInt(sc.next());
                System.out.println("Input Name...");
                String name = sc.next();
                System.out.println("Input Price...");
                double price = Double.parseDouble(sc.next());
                System.out.println("Input Quantity...");
                int qt = Integer.parseInt(sc.next());

                //값 입력 받아서 객체를 만들어서 전달
                ItemDTO item = new ItemDTO(id, name, price, qt);
                service.modify(item);
            }
        }
        sc.close();
    }
}
