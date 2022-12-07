package java_course;
import java.util.*;

class animals{
	public void dog() {
		System.out.println("Dog bark!");
	}
}
class cat extends animals{
	public void cat() {
		System.out.println("Cat Meow Meow!");
	}
}
public class practice{
	
	public static void main(String[] args) {
		 cat c=new cat();
		 c.dog();
		 c.cat();
	}
}



