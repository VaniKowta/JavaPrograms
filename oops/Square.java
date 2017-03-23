package wbl.assignment.oops;


public class Square extends AbstractShapes {
	private double side;
	
	public Square(int side){
		this.side=side;
	}

	@Override
	public void calculateArea() {
	 area=side*side;
	 System.out.println("Area of square is : "+area);
		
	}

	@Override
	public void calculatPerimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSides() {
		// TODO Auto-generated method stub
		
	}
	
}