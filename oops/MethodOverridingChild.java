package wbl.assignment.oops;

class MethodOveridingChild extends MethodOveriding{
	protected int ChildClassVar1;
	
    @Override
	public void a1(){
		System.out.println("a1() method of Child class");
	}
	
    @Override
	public void c1(){
		System.out.println("c1() method of Child class");
	}
    
    public void ChildClassMethod1(){
    	
    }

	public MethodOveridingChild() {
		super();
		// TODO Auto-generated constructor stub
	}
}
