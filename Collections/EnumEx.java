package wbl.com.Collections;
public class EnumEx {
	enum Months{
		JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;
	}
	public static void main(String[] args) {
		Months[] months = Months.values();
		for(Months m:months){
			System.out.println(m+"----"+m.ordinal());
			
		}
		}
	
}