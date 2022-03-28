package package1;

import java.util.Scanner;

public class Convert extends Base {
	public void returninghome(Base returning) {
		returning.requests();
	}
	
	public Convert(String name, int age,double currency,double usd) {
		super(name, age);
		this.setCurrency(currency);
		this.setUsd(usd);

	}
Scanner scan =new Scanner(System.in);
	@Override
	void requests() {
		
	}

	@Override
	void showinfos() {

		
	}

	@Override
	void questions() {
		
		
	}

	@Override
	void currency() {

		
	}

	@Override
	void makingquestions() {
		
		
	}

	@Override
	void convert() {
		
		while(true) {
			System.out.println("How much Zroucja do you want to Convert to usd?");
			double a = scan.nextDouble();
			setUsd(a+getUsd());
			
			if(a==this.getCurrency()) {
				System.out.println("You will convert your whole Currency!!\n If u sure about this type 1 "
						+ "if not type 2 for return home ");
				int b=scan.nextInt();
				while(true) {
					if(b==1) {
						System.out.println("You have claimed " + a +"USD");
						double x=this.getCurrency()-a;
						this.setCurrency(x);
						System.out.println("Returning to home page...");
						
						returninghome(new OtherOptions(this.getName(),this.getAge(),this.getCurrency(),getUsd()));
						break;
					}
					else if(b==2) {
						System.out.println("Returning to home page...");
						
						returninghome(new OtherOptions(this.getName(),this.getAge(),this.getCurrency(),getUsd()));
						break;
					}
					else {
						System.out.println("Wrong dialing");
						continue;
					}
				}
				break;
			}
			else if(a<this.getCurrency()) {
			System.out.println("You have claimed " + a+"USD");
			double x=this.getCurrency()-a;
			this.setCurrency(x);
			System.out.println("Returning to home page...");
			
			returninghome(new OtherOptions(this.getName(),this.getAge(),this.getCurrency(),getUsd()));
			break;
			}
			
			else {
				System.out.println("Wrong dialing");
				continue;
			}
			
		}
		
	   
		
	}

}
