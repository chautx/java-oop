package OOPPart1;

public class OOPPart5 {
public static void main(String[]args) {
	NhanVat N1 = new TaySung();
	NhanVat N2 = new Zombie();
	//downcasting ep kieu xuong file con
	TaySung t1 = (TaySung)N1;
	Zombie z2 = (Zombie)N2;
	t1.quangBom();
	z2.banDoc();
	
	
}
}
