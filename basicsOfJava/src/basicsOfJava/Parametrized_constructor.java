package basicsOfJava;

public class Parametrized_constructor {
	String name;
	int id;
	//this is used to refer current class ka variables and methods
	public Parametrized_constructor(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
	@Override
	public String toString() {
		return "name= "+name+", id= "+id;
		
	}

	public static void main(String[] args) {
		Parametrized_constructor obj = new Parametrized_constructor("Sri", 002);
		System.out.println(obj);
	}
}
