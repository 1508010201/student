/*程序说明：模拟银行定期存款功能。创建银行定期存款账户类DepositAccount，
  其中包括：账号，储户姓名，存款余额，年利率等属性，和开户，存款，查询，
  计算利息等方法。查询余额，计算并显示年利息和月利息*/
//Iv.0
//2017年10月12日
//谭秀芳

class DepositAccount{
	static double fit;            //年利率
	private String name;          //储户姓名
	private String accountNumber; //账号
	private double balance;  //余额
	//构造函数（用于开户）
	public DepositAccount(String x,String y,double z,double k){
		name=x;
		accountNumber=y;
		balance=z;
		fit=k;
	}
	//查询户名
	public String getName(){
		return name;
	}
	//查询账号
	public String getAccount(){
			return accountNumber;
		}
	//存款
	public double save(float m){
		balance+=m;
		return balance;
	}
	//年利息
	public double interestYear(){
		return(balance*fit);
	}
	//月利息
	public double interestMonth(){
		return((balance*fit)/12);
	}
}
public class TestDepositAccount {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		DepositAccount saver=new DepositAccount("ZhangSan","1234567890",5000,0.023);
		System.out.println("户名："+saver.getName());
		System.out.println("账号："+saver.getAccount());
		System.out.println("余额："+saver.save(2000));
		System.out.println("年利息："+saver.interestYear());
		System.out.println("月利息："+saver.interestMonth());
	}
}
		


