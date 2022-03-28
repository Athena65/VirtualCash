package package1;

import java.util.Scanner;

public class Questions extends Base{
Scanner scan =new Scanner(System.in);
//earnings

public void returninghome(Base returning) {
	returning.requests();
}

	public Questions(String name, int age,double earnings,double currency,double usd) {
		super(name, age);
	this.setName(name);
	this.setAge(age);
	this.setEarnings(earnings);
	this.setCurrency(currency);
    this.setUsd(usd);

	
	}

	



	@Override
	void requests() {
	
	}

	@Override
	void showinfos() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	void questions() {
		double zroucja=0;
		
		for(;;) {
System.out.println("Q1:What is the Developers Major? \n A)Art\tB)Footballer\tC)Actor\tD)Engineer");

String a=scan.next();

if(a.equals("D")|| a.equals("d")) {
	
	zroucja++; 
	System.out.println("Correct Answer");
	break;
}
else if(a.equals("B")|| a.equals("b")) {
	System.out.println("Right Answer was D");
	break;
}
else if(a.equals("C")|| a.equals("c")) {
	System.out.println("Right Answer was D");
	break;
}
else if(a.equals("A")|| a.equals("a")) {
	System.out.println("Right Answer was D");
	break;
}
else {
	System.out.println("Wrong dialing.");
	continue;
}
		}
		for(;;) {
System.out.println("Q2:Who won Ballon d'Or 2016?\n A}Lionel Messi\tB)Antoine Griezmann\tC)Cristiano Ronaldo\t"
		+ "D)Luis Suárez");
		
String b=scan.next();
if(b.equals("C") || b.equals("c")) {
	zroucja++; 
	System.out.println("Correct Answer");
	break;
	
}
else if(b.equals("A")|| b.equals("a")) {
	System.out.println("Right Answer was C");
	break;
}
else if(b.equals("B") || b.equals("b")) {
	System.out.println("Right Answer was C");
	break;
}
else if(b.equals("D") || b.equals("d")) {
	System.out.println("Right Answer was C");
	break;
}
else {
	System.out.println("Wrong dialing. ");
	continue;
}
	
		}
		for(;;) {
			System.out.println("Q3:Which parameter doesnt exist in Java?\nA)goto\tB)break\tC)continue\tD)"
					+ "return");
			
			String c=scan.next();
			if(c.equals("A") || c.equals("a")) {
				zroucja++; 
				System.out.println("Correct Answer");
				break;
				
			}
			else if(c.equals("B") || c.equals("b")) {
				System.out.println("Right Answer was A");
				break;
			}
			else if(c.equals("D")|| c.equals("d")) {
				System.out.println("Right Answer was A");
				break;
			}
			else if(c.equals("C") || c.equals("c")) {
				System.out.println("Right Answer was A");
				break;
			}
			else {
				System.out.println("Wrong dialing.");
				continue;
			}
		}
		for(;;) {
			System.out.println("Q4:What Does Integral Means?\nA)Slope\tB)Distance\tC)Lenght\tD)Domain");
			String d=scan.next();
			if(d.equals("D") || d.equals("d")) {
				zroucja++; 
				System.out.println("Correct Answer");
				break;
			}
			else if(d.equals("A") || d.equals("a")) {
				System.out.println("Right Answer was D");
				break;
			}
			else if(d.equals("B")  || d.equals("b")) {
				System.out.println("Right Answer was D");
				break;
			}
			else if(d.equals("C")  || d.equals("c")) {
				System.out.println("Right Answer was D");
				break;
			}
			else {
				System.out.println("Wrong dialing. Use UpperCase Letter");
				continue;
			}
		}
		for(;;) {
			System.out.println("LastQ:Which President has made Pyshical Education as Lesson?\nA)Abram Lincoln"
					+ "\tB)Adolf Hitler\tC)Vladimir Putin\tD)Mustafa Kemal Ataturk");
			String e=scan.next();
			if(e.equals("D")  || e.equals("d")) {
				zroucja++; 
				System.out.println("Correct Answer");
				break;
			}
			else if(e.equals("C") || e.equals("c")) {
				System.out.println("Right Answer was D");
				break;
			}
			else if(e.equals("B") || e.equals("b")) {
				System.out.println("Right Answer was D");
				break;
			}
			else if(e.equals("A") || e.equals("a")) {
				System.out.println("Right Answer was D");
				break;
			}
			else {
				System.out.println("Wrong dialing. Use UpperCase Letter");
				continue;
			}
		}
		zroucja=zroucja;
		this.setEarnings(zroucja);
		this.setCurrency(this.getEarnings()+this.getCurrency());
         
		System.out.println("you have gained = "+this.getEarnings());

System.out.println("Returning to home page..");
returninghome(new OtherOptions(this.getName(),this.getAge(),this.getCurrency(),getUsd()));

	
	}
	



	@Override
	void currency() {
	
	System.out.println("Your Total Currency is = " +(this.getCurrency())+ " Zroucja\n" +getUsd()+""
			+ " USD"
			) ;
	
		
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
