import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    
	  ArrayList<String> desertIslandPlaylis = new   ArrayList<String>();
	  
	  desertIslandPlaylis.add("love");
	  desertIslandPlaylis.add("peace");
	  desertIslandPlaylis.add("social");
	  desertIslandPlaylis.add("mouse");
	  desertIslandPlaylis.add("angle");
	  desertIslandPlaylis.add("apple");
	  System.out.println(desertIslandPlaylis);
	  
	  int x = desertIslandPlaylis.size();
	  System.out.println(x);
	  
	  desertIslandPlaylis.remove("angle");
	  int a = desertIslandPlaylis.indexOf("social");
	  int b = desertIslandPlaylis.indexOf("apple");
	  desertIslandPlaylis.set(a,"apple");
	  desertIslandPlaylis.set(b,"social");
	  System.out.println(desertIslandPlaylis);
	  
  }
  
}