package com.kbstar.test.user;

import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserCRUDServiceImpl;

public class UserSelectAllTest {

	public static void main(String[] args) {
		CRUDService<String, UserDTO> crudService = new UserCRUDServiceImpl();
		List<UserDTO> list = null;
		try {
			list = crudService.getAll();
			if (list.size() == 0) {
				System.out.println("데이터가 없습니다.");
			} else {
				for (UserDTO obj : list) {
					System.out.println(obj);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
