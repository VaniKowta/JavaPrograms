package wbl.assignment.oops;

	public abstract class AbstractShapes {
		int noOfSides;
		double area;
		double perimeter;

		public AbstractShapes(){
			System.out.println("this is a shape object class");
		}

		public  abstract void calculateArea ();

		public abstract void calculatPerimeter();

		public abstract void setSides();






	}



