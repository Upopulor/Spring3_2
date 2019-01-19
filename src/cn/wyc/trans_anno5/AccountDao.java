package cn.wyc.trans_anno5;

public interface AccountDao {
	public void out(String outer,Integer money);
	public void in(String inner,Integer money);
}
