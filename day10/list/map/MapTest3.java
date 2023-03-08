package list.map;

import bank.DTO.UserDTO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest3 {
    public static void main(String[] args) {
        Map<String, UserDTO> db = new HashMap<>();
        db.put("id01", new UserDTO("id01", "pwd01", "james1"));
        db.put("id02", new UserDTO("id02", "pwd02", "james2"));
        db.put("id03", new UserDTO("id03", "pwd03", "james3"));

        UserDTO uu = new UserDTO("id02", "0000", "james2");

        db.put(uu.getId(), uu);
        System.out.println("==============================================");

        Collection<UserDTO> col = db.values();

        for (UserDTO a : db.values()) {
            System.out.println(a);
        }


    }
}
