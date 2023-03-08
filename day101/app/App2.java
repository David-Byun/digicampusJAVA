import dao.ItemDAO;
import dto.ItemDTO;
import frame.DAO;

import java.util.List;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        DAO<String, ItemDTO> itemDAO = new ItemDAO();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input command(q, i, d, u, s, sa)");
            String cmd = sc.next();

            if (cmd.equals("q")) {
                System.out.println("Bye");
                break;
            } else if (cmd.equals("i")) {
                System.out.println("Input ID...");
                String id = sc.next();
                System.out.println("Input Name...");
                String name = sc.next();
                System.out.println("Input Price...");
                double price = Double.parseDouble(sc.next());
                System.out.println("Input Quantity...");
                int qt = Integer.parseInt(sc.next());
                ItemDTO item = new ItemDTO(id, name, price, qt);
                try {
                    itemDAO.insert(item);
                } catch (Exception e) {
                    System.out.println("이미 아이템이 존재합니다.");
                }

            } else if (cmd.equals("d")) {
                System.out.println("Input ID...");
                String id = sc.next();
                try {
                    itemDAO.delete(id);
                } catch (Exception e) {
                    System.out.println("아이템이 존재하지 않습니다.");
                }

            } else if (cmd.equals("s")) {
                System.out.println("Input ID...");
                String id = sc.next();
                ItemDTO item = null;
                try {
                    item = itemDAO.select(id);
                    System.out.println(item);
                } catch (Exception e) {
                    System.out.println("아이템이 존재하지 않습니다.");
                }

            } else if (cmd.equals("sa")) {
                List<ItemDTO> list = null;
                try {
                    list = itemDAO.selectAll();
                    for (ItemDTO a : list) {
                        System.out.println(a);
                    }
                } catch (Exception e) {
                    System.out.println("아이템이 존재하지 않습니다.");

                }

            } else if (cmd.equals("u")) {
                //수정하면 모든 정보가 다 날라감(수정한 정보만 변경)
                System.out.println("Input ID...");
                String id = sc.next();
                System.out.println("Input Name...");
                String name = sc.next();
                System.out.println("Input Price...");
                double price = Double.parseDouble(sc.next());
                System.out.println("Input Quantity...");
                int qt = Integer.parseInt(sc.next());

                //값 입력 받아서 객체를 만들어서 전달
                ItemDTO item = new ItemDTO(id, name, price, qt);
                try {
                    itemDAO.update(item);
                } catch (Exception e) {
                    System.out.println("아이템이 존재하지 않습니다.");
                }
            }
        }
        sc.close();
    }
}
