package OOPPart1;
// tinh da hinh, chuyen qua lai

public class TestOOPMain {
	public static void main(String[]args) {
		NhanVat N1 = new TaySung();
		NhanVat N2 = new Zombie();
		System.out.println(" N1 bican");
		N1 = new Zombie();
		N1.display();
		System.out.println("N1 duoc cuu");
		N1 = new TaySung();
		N1.display();
		System.out.println("---------");
		
		
		
		
		
	}

}
