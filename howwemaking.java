package package1;

public class howwemaking extends Base {
public void returninghome(Base returning) {
	returning.requests();
}
	public howwemaking(String name, int age,double currency) {
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
		
		
	}

	@Override
	void makingquestions() {
		System.out.println("This is a trial application for practice with java so i haven't done "
				+ "many questions. \nThe 5 questions have come from my mind randomly."
				+ "\nIf there will be good reactions maybe i can create an app like this .\n"
				+ "perhaps, may be adds not questions "
				+ "\nReturning to home page...  ");
		returninghome(new OtherOptions(this.getName(),this.getAge(),this.getCurrency(),this.getUsd()));

		
	}
	@Override
	void convert() {
		// TODO Auto-generated method stub
		
	}

}
