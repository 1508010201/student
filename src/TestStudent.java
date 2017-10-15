//在父类student的基础上定义子类研究生和本科生，并输出他们的信息
//2017年10月15日
//谭秀芳
//Iv.0

class Student{
	public String name;
	public int age;
	public String degree;
	//输出函数
	void ShowStudent()
	{
		System.out.println(name+"  "+age+" "+degree);
	}
}
//子类本科生类
class Undergraduate extends Student{
	private String specialty;
	//构造函数
	public Undergraduate(String name,int age,String degree,String specialty)
	{
		this.name=name;
		this.age=age;
		this.degree=degree;
		this.specialty=specialty;
	}
	//输出函数
	void ShowUndergraduate()
	{
		System.out.println(name+"  "+age+" "+degree+"  "+specialty);
	}
}
//子类研究生类
class Graduate extends Student{
	private String direction;
	//构造函数
	public Graduate(String name,int age,String degree,String direction) 
	{
		 this.name=name;
		 this.age=age;
		 this.degree=degree;
		 this.direction=direction;
	}
    //输出函数
	void ShowGraduate()
	{
		System.out.println(name+"  "+age+" "+degree+"  "+direction);
	}
}
//测试类
public class TestStudent 
{
	public static void main(String[] args)
	{
		Undergraduate 张三=new Undergraduate("张三",20,"本科","通信");
		Undergraduate 李四=new Undergraduate("张三",20,"本科","电子");
		Graduate 王五=new Graduate("王五",25,"硕士","通信");
		Graduate 刘六=new Graduate("刘六",36,"博士","通信");
		张三.ShowUndergraduate();
		李四.ShowUndergraduate();
		王五.ShowGraduate();
		刘六.ShowGraduate();

	}

}

