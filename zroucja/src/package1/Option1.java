package package1;

import java.util.Scanner;

public class Option1  extends Base{
	public void requests(Base request) {
		request.requests();
	}
	Scanner scan=new Scanner(System.in);
	public Option1(String name, int age) {
		super(name, age);
		this.setName(name);
		this.setAge(age);
	}


	@Override
	
	void requests() {
	
		System.out.println("Options:\n1-Want to earn Zroucja by solving questions \n2-Show Your Currency"
				+ "\n4-How we have been making questions\n5-Convert your Currency to usds"
				+ "\n6-Show Infos ");
		//add your balance
	}

	@Override
	

	public void showinfos() {
		// TODO Auto-generated method stub
		while(true) {
			
			System.out.println("\nOptions(Press number near informations to go there"
					+ ":\n1-To show your account properties\n2-To Show Virutal Spesifics\n3-To Show Developers"
					+ " Properties"+"\n4-Exit to the Home");
			
			int b=scan.nextInt();
			if(b==1) {
				System.out.println("\n\nUserName= "+this.getName());
				System.out.println("Age= "+this.getAge());
				System.out.println("Free Account");
			}
			else if(b==2){
		//sonradan devam edilecek
				System.out.println("Appname=" +Base.appname);
				System.out.println("ZCashName=" +Base.virutalcashname);
	}
			else if(b==3) {
				System.out.println("Developer=" +Base.developer);
				System.out.println("Devs Age=" +Base.devsage);
				System.out.println("Devs University=" +Base.devsUni);
				System.out.println("Devs Major =" +Base.devsMajor);
				
				
			}
			else if(b==4) {
				requests(new OtherOptions(this.getName(),this.getAge(),this.getCurrency(),this.getUsd()));
				break;
			}
			
			
		}
		
		
		

		
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
