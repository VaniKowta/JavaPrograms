package wbl.assignment.oops;

class MethodOveridingDemo{
	public static void main( String args[]) {
		//Parent class reference to child class object
		
		// obj1 and obj2 are instances of child class method
		MethodOveriding obj1 = new MethodOveridingChild();
		//Only variables and methods defined in the parent class are defined for obj1.
		//But if a method is overridden in the child class, then calling this method executes the functionality in the child class.
		//Variables defined on obj1 are all from parent class because obj1 has been upcast to parent class.
		//eg.obj1.parentClassVar1
		//None of the child class specific variables and methods are not visible to obj1, i.e., obj1.ChildClassMethod1() cannot be called.
		
		// upcasting from child class obj to parent class.
		obj1.a1();
		obj1.b1();
		obj1.c1();
		
		//child class variables and methods are not visible to obj1
		//obj1.ChildClassVar1 = 1;
		//obj1.ChildClassMethod1();
		
		MethodOveridingChild obj2 = new MethodOveridingChild();
		//All variables and methods from parent class with sufficient access provisions to child class (eg., which are not private) and
		// all variables and methods from child class are visible to obj2.
		obj2.a1();
		obj2.b1();
		obj2.c1();
		
		obj2.ChildClassVar1 = 1;
		obj2.ChildClassMethod1();
		// obj3 is instance of parent class method
		MethodOveriding obj3 = new MethodOveriding();
		
		obj3.a1();
		obj3.b1();
		obj3.c1();
		
	}
}