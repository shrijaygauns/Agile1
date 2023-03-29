
public class Money {

	private int moneyValue;
	private String moneyCurrency;
	
	int currentMoney = 100;
	String more="more";
	String less="less";
			
	

	public Money(int moneyValue, String moneyCurrency) {
		// TODO Auto-generated constructor stub
		this.moneyValue = moneyValue;
		this.moneyCurrency = moneyCurrency;
	}
	
	public int getMoneyValue() {
		return this.moneyValue;
	}
	
public String getMoneyCurrency() {
	return moneyCurrency;
}
	

public boolean compareCurrency(Money note) {
	
	return this.moneyCurrency.equals(note.getMoneyCurrency());
}

public String compareMoney(String svalue) {
	// TODO Auto-generated method stub
	if(moneyValue > currentMoney) {
		svalue = "more";
	}
	else if(moneyValue < currentMoney){
		svalue = "less";
	}
	else {
		svalue = "equal";
	}
	return svalue;
}

public float moneytodollar(float dollar) {
	return dollar/80;
}
	
}
