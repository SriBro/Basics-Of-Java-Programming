package basicsOfJava;

public class GetterSetter {
	private String name;
	private int id;
	private int balance;
	GetterSetter(String name,int id, int balance){
		this.name=name;
		this.id=id;
		this.balance=balance;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int newBalance) {
		balance = newBalance;
	}
}


