package wbl.assignment.oops;

	public class Circle extends AbstractShapes implements ShapeConstants{
		private double radius;   
	    
	    
		public Circle(double r){
			radius=r;		
		}
		@Override
		public void calculateArea() {
			area = PI*radius*radius;
			System.out.println("area of circle is : "+ PI*radius*radius);
			
		}

		@Override
		public void calculatPerimeter() {
			perimeter=2*PI*radius;
			System.out.println("perimeter of circle is : "+perimeter);
			
		}

		@Override
		public void setSides() {
			// TODO Auto-generated method stub
			
		}

	}	

