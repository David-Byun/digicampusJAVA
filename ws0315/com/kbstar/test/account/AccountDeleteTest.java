package com.kbstar.test.account;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountCRUDServiceImpl;


public class AccountDeleteTest {

	public static void main(String[] args) {
		CRUDService<String, AccountDTO> crudService = new AccountCRUDServiceImpl();

		try {
			crudService.remove("id01");
			System.out.println("성공");
		} catch (Exception e) { // 여기서는 실제로 고객에게 메시지를 노출시켜야 함
			System.out.println(e.getMessage());
		}
	}
}
