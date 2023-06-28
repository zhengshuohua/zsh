public class object2{
    public static void main(String[]args) {
        Carrr honda = new Carrr();
        honda.name = "Accord"; // 使用"."运算符访问Car类的成员变量name
        System.out.print(honda.name);
    }
}

class Carrr{
    String name;
    double price;
    String color;
    String[] master;
}