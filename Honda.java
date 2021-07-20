package Practice;
abstract class Bike 
{
	abstract void run();
}

public class Honda extends Bike {
void run()
{
	System.out.println("run safly...");
}
	public static void main(String[] args) {
		Honda obj=new Honda();
		obj.run();
   
	}

}
