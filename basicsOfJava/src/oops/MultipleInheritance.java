package oops;
interface Ondu{
	abstract int add(int num1, int num2);
	abstract int sub(int num1, int num2);
}
class Yedu implements Ondu{
	@Override
	public int add(int numm1,int numm2) {
		return numm1+numm2;
	}
	@Override
	public int sub(int num1,int num2) {
		return num1-num2;
	}
}
class MultipleInheritance{
	public static void main(String[] args) {
		Yedu obj = new Yedu();
		System.out.println(obj.add(3,4));
		System.out.println(obj.sub(5, 2));
	}
}