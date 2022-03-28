package package1;

import java.util.Scanner;

public class OtherOptions extends Base {
	//showinfos method
	public static void questions(Base question) {
		question.questions();
	}
	public static void currency(Base currency) {
		currency.currency();
	}
	public static void showinfos(Base infos) {
		infos.showinfos();
	}
	public static void makingque(Base making) {
		making.makingquestions();
	}
	public static void converttousd(Base convert) {
		convert.convert();
	}
	
	//Request method with polymorphism
	
	Scanner scan=new Scanner(System.in);
	public OtherOptions(String name, int age,double currency,double usd) {
		super(name, age);
		this.setName(name);
		this.setAge(age);
		this.setCurrency(currency);
		this.setUsd(usd);
	
	}

	@Override
	 void requests() {
		
	
	
	
	while(true) {
		System.out.println("\nOptions(Press wherever u want go) "
				+ ":\n1-Want to earn Zroucja by solving questions \n2-Show Your Currency"
				+ "\n3-How we have been making questions\n4-Convert your Currency to usds"
			+ "\n5-Show Infos \n6-Exit from App");
		int a=scan.nextInt();
		if(a==1) {
			questions(new Questions(this.getName(),getAge(),this.getEarnings(),this.getCurrency(),this.getUsd()));
			break;
		}
		
	
		else if(a==2) {
			currency(new Currency(this.getName(),this.getAge(),this.getCurrency()));
			break;
		}
		else if(a==3) {
		 makingque(new howwemaking(this.getName(),this.getAge(),this.getCurrency()));
			break;
		}
		else if(a==4) {
			converttousd(new Convert(this.getName(),this.getAge(),this.getCurrency(),getUsd()));
		}
		else if(a==5) {
			showinfos(new Option1(this.getName(),this.getAge()));
			break;
		}
		else if(a==6) {
			System.out.println("You have disconnected");
			break;
		}

		else {
			System.out.println("Wrong Dialing(Must be between 1-6)Try Again Later");
			
		}
		
	}
		
	
		
		
		
		
		
	}
	



	

	@Override
	void showinfos() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void questions() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void currency() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void makingquestions() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void convert() {
		// TODO Auto-generated method stub
		
	}
	


}
