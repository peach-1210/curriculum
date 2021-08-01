package check;


import constants.Constants;



public class Check {

	
	private static String firstName ="岩田";
	private static String lastName ="桃子";
	
	



public static void main(String[] args) {
	
	PrinterName(firstName, lastName);
	
	
	
	Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
	pet.introduce();
	
	RobotPet robotPet =new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
	robotPet.introduce();
	
 
}
	
private static void PrinterName(String firstName, String lastName){ 
     
	
	System.out.println("printNameメソッド → " + firstName + lastName);

}
	
	
}	
	


