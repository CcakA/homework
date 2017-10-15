package homework;

class DepositAccount {
	static double rate_year = 0.023;    //年利润
	private String accountNum;          //账号
	private String accountName;         //储户姓名
	private double balance;             //余额
	public void  Register(String accountNum,String accountName,double balance) {  //开户
		this.accountNum = accountNum;
		this.accountName = accountName;
		this.balance = balance;
		System.out.println("账号为："+accountNum+"的用户"+accountName+"存款金额为："+balance);
	}
	public void Save(double m) {  //存款
		balance +=m;
		System.out.println("该用户存款金额为："+m);
	}
	public double getBalance() {   //查询
		System.out.println("该用户余额为："+balance);
		return balance;
	}
	public double cal_rate() {     //计算利息
		double rate = balance*rate_year;		
		System.out.println("该用户可以获得的年利息为："+rate+"月利息为："+(float)rate/12);
		return rate;
	}	
}
public class Account {
	public static void main(String args[]) {
		DepositAccount saver = new DepositAccount();    //创建对象saver
		saver.Register("1234567890","ZhangSan",5000);
		saver.Save(500);
		saver.getBalance();
		saver.cal_rate();
	}	
}
