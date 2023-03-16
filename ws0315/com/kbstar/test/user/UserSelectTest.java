package com.kbstar.test.user;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserCRUDServiceImpl;

public class UserSelectTest {

	public static void main(String[] args) {
		CRUDService<String, UserDTO> crudService = new UserCRUDServiceImpl();
		UserDTO user = null;
		try {
			user = crudService.get("id02");
			System.out.println(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
