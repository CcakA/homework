package homework;

class DepositAccount {
	static double rate_year = 0.023;    //������
	private String accountNum;          //�˺�
	private String accountName;         //��������
	private double balance;             //���
	public void  Register(String accountNum,String accountName,double balance) {  //����
		this.accountNum = accountNum;
		this.accountName = accountName;
		this.balance = balance;
		System.out.println("�˺�Ϊ��"+accountNum+"���û�"+accountName+"�����Ϊ��"+balance);
	}
	public void Save(double m) {  //���
		balance +=m;
		System.out.println("���û������Ϊ��"+m);
	}
	public double getBalance() {   //��ѯ
		System.out.println("���û����Ϊ��"+balance);
		return balance;
	}
	public double cal_rate() {     //������Ϣ
		double rate = balance*rate_year;		
		System.out.println("���û����Ի�õ�����ϢΪ��"+rate+"����ϢΪ��"+(float)rate/12);
		return rate;
	}	
}
public class Account {
	public static void main(String args[]) {
		DepositAccount saver = new DepositAccount();    //��������saver
		saver.Register("1234567890","ZhangSan",5000);
		saver.Save(500);
		saver.getBalance();
		saver.cal_rate();
	}	
}
