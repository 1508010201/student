import java.util.Scanner;

//�Ӽ�������һ������0������������һ����ʽ���n,2n,4n,8n.
	//lv.1
	//2017��9��23��import java.util.Scanner;
	public class hxg {
		static int n;//�Ӽ���¼�������
		static int i;//
		static int s;
		static int j;
		static int m;
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("������һ���������������");
			n=in.nextInt();//�����������ֵ��n
			System.out.println("����һ���������������£�");
			hxg.fun();//���õõ�i��ֵ
			hxg.display1();//���ǰ����
			hxg.display2();//�����Ӧ�ĺ���
			}
	//�õ�n*Math.pow(2,i)>5000��i����С����ֵ
		 static public int fun(){
				s=(int) (n*Math.pow(2,i));
				i=i+1;
				if(s<5000)fun();
				m=i-1;//���ս������i�����1������Ҫ��ȥһ������ȫ�ֱ���M��ʾi��ʵ����Сֵ
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
		
