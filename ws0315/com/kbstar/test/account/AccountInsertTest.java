package com.kbstar.test.account;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountCRUDServiceImpl;

public class AccountInsertTest {

	public static void main(String[] args) {
		CRUDService<String, AccountDTO> crudService = new AccountCRUDServiceImpl();

		AccountDTO account = new AccountDTO("id07", 31300, "ahsdh");
	
		try {
			crudService.register(account);
			System.out.println("성공");
		} catch (Exception e) { 
			System.out.println(e.getMessage());
		}
	}
}
