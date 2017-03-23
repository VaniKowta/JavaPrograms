package wbl.assignment.oops;

public class DiffShapes {

		public static void main(String[] args) {
			Circle c=new Circle(5);
			c.calculateArea();
			c.calculatPerimeter();
			
			Square s=new Square(2);
			s.calculateArea();
			
			Rectangle r=new Rectangle(1,6);
			r.calculateArea();
			r.calculatPerimeter();
			
			
	
			
			//Method overloading
			r.perimeter(6);
			r.perimeter(9,6);
			r.perimeter(9,4,5);
		}

	}


