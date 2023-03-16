package com.kbstar.test.account;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountCRUDServiceImpl;

public class AccountSelectTest {

	public static void main(String[] args) {
		CRUDService<String, AccountDTO> crudService = new AccountCRUDServiceImpl();
		AccountDTO account = null;
		try {
			account = crudService.get("id01");
			System.out.println(account);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
