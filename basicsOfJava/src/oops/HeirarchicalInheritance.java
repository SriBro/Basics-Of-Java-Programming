package oops;
class Roman1{
	String name = "Sri";
}
class Roman2 extends Roman1{
	int id = 2;
}
class Roman3 extends Roman1 {
	boolean hasMobile = true;
}
class HeirarchicalInheritance{
	public static void main(String[] args) {
		Roman2 roman2 = new Roman2();
		Roman3 roman3 = new Roman3();
		System.out.println(roman2.name);
		System.out.println(roman2.id);
		System.out.println(roman3.name);
		System.out.println(roman3.hasMobile);
	}
}
