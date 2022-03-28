package package1;

public abstract class  Base {

	public static final String appname="Rewolucja";//means revolution in polish
	public static final String virutalcashname="Zroucja";//means revolution in polish
	public static final String developer="Burak Tamince";
	public static final int devsage =19;
	public static final String devsUni="Ýstanbul Gedik University";
	public static final String devsMajor="Computer Engineering";
	

	
	
	private String name;
	private int age;
	private static double earnings;
	private static double currency;
	private static double usd;






	public static double getUsd() {
		return usd;
	}


	public static void setUsd(double usd) {
		Base.usd = usd;
	}


	public double getEarnings() {
		return earnings;

	}


	public void setEarnings(double earnings) {
	this.earnings = earnings;
		
	}
	
	public double getCurrency() {
		return currency;
	}



	public void  setCurrency(double currency) {
		this.currency = currency;
	}



	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
//constructor
	public Base(String name, int age) {
		super();
		this.setName(name);
		this.setAge(age);

		
	
	}
	


	//abstract methods
	abstract  void requests();
	abstract void showinfos();
	abstract void questions();
    abstract void currency();
    abstract void makingquestions();
    abstract void convert();
    






}
