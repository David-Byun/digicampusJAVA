import dao.UserDAO;
import dto.UserDTO;
import frame.DAO;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        DAO<String, UserDTO> userDao = new UserDAO();
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
                System.out.println("Input Password...");
                String pwd = sc.next();
                UserDTO user = new UserDTO(id, pwd, name);
                try {
                    userDao.insert(user);
                } catch (Exception e) {
                    System.out.println("이미 id가 존재합니다.");
                }

            } else if (cmd.equals("d")) {
                System.out.println("Input ID...");
                String id = sc.next();
                try {
                    userDao.delete(id);
                } catch (Exception e) {
                    System.out.println("id가 존재하지 않습니다.");
                }

            } else if (cmd.equals("s")) {
                System.out.println("Input ID...");
                String id = sc.next();
                UserDTO user = null;
                try {
                    user = userDao.select(id);
                    System.out.println(user);
                } catch (Exception e) {
                    System.out.println("id가 존재하지 않습니다");
                }

            } else if (cmd.equals("sa")) {
                List<UserDTO> list = null;
                try {
                    list = userDao.selectAll();
                    for (UserDTO a : list) {
                        System.out.println(a);
                    }
                } catch (Exception e) {
                    System.out.println("유저가 존재하지 않습니다.");

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
                    userDao.update(user);
                } catch (Exception e) {
                    System.out.println("아이디가 존재하지 않습니다");
                }
            }
        }
        sc.close();
    }
}
