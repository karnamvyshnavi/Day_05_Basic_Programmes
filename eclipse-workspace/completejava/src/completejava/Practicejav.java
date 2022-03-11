package completejava;

public class Practicejav {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(paramMethod('g'));
		carDescription("Tesla Roadster",2018,"bad");
		

	}
	static String paramMethod(char energyEfficiencyCategory) {
	switch (energyEfficiencyCategory) {
	case 'A':
	case 'a':
    return  "A very low Energy consumption";
		
	case 'B':
	case 'b':
		return "B low Energy Consumption";
	
	case 'C':
	case 'c':
		return "C normal Energy Consumption";
	
	case 'D':
	case 'd':
	   return	"D above normal Energy Consumption";
		
	case 'E':
	case 'e':
	return	"E high Energy COnsumption";
		
	case 'F':
	case 'f':
		return "F very high  Energy COnsumption";
		
	case 'G':
	case 'g':
		return  "G extremely high Energy COnsumption";
		default:
			return "no valid energy efficiency category is used";
	
	}
	
	
}
	static void carDescription(String model,int ProductionYear, String condition) {
		
		System.out.println("This car is a "+ model);
		System.out.println("Production year:" + ProductionYear);
		if(condition == "good") {
			System.out.println("It's in "+ condition+ " "+ "condition");
		}else if(condition == "bad") {
			System.out.println("It's in "+ condition +" "+"condition");
		}else {
			System.out.println("It's in damaged condition");
		}
		
	}
}