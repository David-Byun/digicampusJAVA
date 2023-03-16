package com.kbstar.test.account;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountCRUDServiceImpl;


public class AccountSelectAllTest {

	public static void main(String[] args) {
		CRUDService<String, AccountDTO> crudService = new AccountCRUDServiceImpl();
		List<AccountDTO> list = null;
		try {
			list = crudService.getAll();
			if (list.size() == 0) {
				System.out.println("데이터가 없습니다.");
			} else {
				for (AccountDTO obj : list) {
					System.out.println(obj);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
