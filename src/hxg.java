import java.util.Scanner;

//从键盘输入一个大于0的整数，按照一定格式输出n,2n,4n,8n.
	//lv.1
	//2017年9月23日import java.util.Scanner;
	public class hxg {
		static int n;//从键盘录入的整数
		static int i;//
		static int s;
		static int j;
		static int m;
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("请输入一个大于零的整数：");
			n=in.nextInt();//将输入的数赋值给n
			System.out.println("按照一定规则输出结果如下：");
			hxg.fun();//调用得到i的值
			hxg.display1();//输出前几行
			hxg.display2();//输出对应的后几行
			}
	//得到n*Math.pow(2,i)>5000中i的最小整数值
		 static public int fun(){
				s=(int) (n*Math.pow(2,i));
				i=i+1;
				if(s<5000)fun();
				m=i-1;//最终结果由于i多加了1，所以要减去一，即用全局变量M表示i的实际最小值
				return (m);
			}
		static public void display1(){
			if(j==m)
			{
				s=(int) (n*Math.pow(2,j));
				System.out.println(s);
			}
			else
			{
				s=(int) (n*Math.pow(2,j));
				System.out.println(s);
			    j=j+1;
			    display1();
			}
	}
		static public void display2(){
			if(m==0)
			{
				s=(int) (n*Math.pow(2,m));
				System.out.println(s);	
			}
			else
			{
				s=(int) (n*Math.pow(2,m));
				System.out.println(s);
			    m=m-1;
			    display2();
			}
		}
	}
		
