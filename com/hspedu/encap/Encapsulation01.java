package com.hspedu.encap;
  /* * 
      * 不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，
      * 否则给默认年龄，
      * 必须在 1-120，年龄， 
      * 工资不能直接查看 ，
      *  name的长度在 2-6字符 之间*/
public class Encapsulation01 {

	public static void main(String[] args) {
		Personp p = new Personp();
	    p.setName("jack");
        p.setAge(30);
        p.setSalary(800);
        System.out.println(p.info());
        
        Personp p2 =new Personp("smith",200,5000);
        System.out.println(p2.info());
	}

}
class Personp{
	public String name;
	private int age;
	private double salary;
	
	public Personp() {
		
	}

	public Personp(String name, int age, double salary) {
	
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
//可以将set方法放在构造器中这样可以验证
		setName(name);
		setAge(age);
		setSalary(salary);
		
	}

	//
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age>=1 && age<=120) {
		this.age = age;}
		else {
			System.out.println("年龄需要在1-120");
			this.age = 18;//默认年龄为18
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String info() {
		return "信息为"+name+age+salary;
	}
	
	
	
	
}
