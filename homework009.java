public class homework009{
/*
 * 定义Music类，里面有音乐名name、
 * 音乐时长times属性，
 * 并有播放play功能和返回本身属性信息的功能方法getlnfo.Homework09.java*/
	  public static void main(String[]args) {
		  Music music = new Music("a",60);
		  music.play();
		  System.out.println(music.getInfo());
	  }
}
class Music{
	String name;
	int times;
	public Music(String name,int times) {
		this.name = name;
		this.times = times;
	}
	public void play() {
		System.out.println("音乐 "+name +"正在播放中... 时长为"+times );
		
	}
	public String getInfo() {
		return name+ times;
	}
}