package package1;

import java.util.Scanner;



public class main {

	//polymorphism
	public static void requests(Base devired) {
		devired.requests();
	}
	public static void showinfos(Base infos) {
		infos.showinfos();
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
			
//type your  username and age and 0 for the beginning inside the methods
Base user1=new OtherOptions("Burak",19,0,0);
	//Showing Options 
user1.requests();



}

		
		
		
		
		
	

		
	
}
