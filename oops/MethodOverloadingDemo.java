package wbl.assignment.oops;

public class MethodOverloadingDemo {

	public static void main(String args[])
	{
		MethodOverloading obj = new MethodOverloading();
		obj.display('a');
		obj.display('a',10);
		obj.display('a',20,40.56f);
        System.out.println(obj.Sum(1.1f, 2.2f));
	}
}