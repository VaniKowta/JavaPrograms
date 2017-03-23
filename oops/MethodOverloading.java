package wbl.assignment.oops;

public class MethodOverloading {
	
    public void display(char c)
    {
         System.out.println(c);
    }
    public void display(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
    public void display(char c, int num, float f){
    	System.out.println(c+" "+num+" "+f);
    }
    
    public int Sum(int a, int b){
    	return a+b;
    }
    
    public float Sum(float a, float b){
    	return a + b;
    }
}
