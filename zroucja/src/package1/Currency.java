package package1;

public class Currency extends Base{
	public void returninghome(Base returning) {
		returning.requests();
	}
public void earnings(Base earnings) {

	earnings.currency();
}
	


	public Currency(String name, int age,double currency) {
		super(name, age);
		this.setName(name);
		this.setAge(age);
		this.setCurrency(currency);
	
		

	}

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
		earnings(new Questions(this.getName(),this.getAge(),this.getEarnings(),this.getCurrency(),this.getUsd()));
    System.out.println("Returning to home page..");
    returninghome(new OtherOptions(this.getName(),this.getAge(),this.getCurrency(),this.getUsd()));
    
		
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
	