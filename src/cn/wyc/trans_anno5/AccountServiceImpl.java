package cn.wyc.trans_anno5;

import org.springframework.transaction.annotation.Transactional;
@Transactional
public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transfer(String outer, String inner, Integer money) {
		accountDao.out(outer, money);
		//int i = 10/0;
		accountDao.in(inner, money);
	}

}
