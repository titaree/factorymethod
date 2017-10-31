abstract class plan{
	protected double rate;
	abstract void getrate();
	
	public void calculateBill(int units){
		System.out.print(units*rate);
	}
}//end of plan class.