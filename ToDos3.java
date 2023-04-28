import java.util.ArrayList;
class ToDos3{
	public static void main(String[] args) {
		ArrayList<String> toDoList = new ArrayList<String>();
		String toDo1 = "Water plants";
		 // Add more to-dos here:
		String toDo2 = "Player";
		String toDo3 = "Dancer";
		
		 // Add to-dos to toDoList
		toDoList.add(toDo1);
		toDoList.add(toDo2);
		toDoList.add(toDo3);
		toDoList.add(1,toDo3);
		
		System.out.println(toDoList);
		
		
	}
}