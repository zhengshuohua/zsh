public class homework002{
	/**
	 * 2.编写类A02，定义方法find，实现查找某字符串数组中的元素查找，
	 * 并返回索引如果找不到，返回-1.Homework02.java
	 */
	  public static void main(String[]args) {
		  String [] strs = {"ss","bb"};
		  A02 a02 = new A02();
		  int index = a02.find("bb", strs);
		  System.out.println(index);
	  }
}
class A02{
	public int find (String findstr,String[]strs) {
			for(int i = 0;i<strs.length;i++) {
				if(findstr.equals(strs[i])) {
					return i;
				}
			}
			return -1;
	}
		}
		