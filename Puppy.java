public class Puppy{
	int Puppyage;
	public Puppy(String name) {
		System.out.println("小狗狗的名字是"+name);
	}
	
	public void setAge(int age) {
		Puppyage = age;
	}
	public int getAge() {
		System.out.println("小狗狗的年龄是"+Puppyage);
		return Puppyage;
	}
	public static void main(String[] args) {
		Puppy myPuppy=new Puppy("tommy");
		myPuppy.setAge(2);       
		myPuppy.getAge();
		System.out.println("变量值是"+myPuppy.Puppyage);
	}
}