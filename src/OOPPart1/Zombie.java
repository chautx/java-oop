package OOPPart1;

public class Zombie extends NhanVat {
	  
	   public String Doc ;
	   public Zombie() {
		   this.ten =  "Zombie";
		   this.Mau = 200;
		   this.satThuong =  200;
		   this.Doc = "Chat cuc doc";
	   }
	   //@override: ghi de,dung khi in them cac thuoc tinh rieng
	   public void display() {
		   super.display();
	   
	  // public void display() {
		  // System.out.println(" ten nhan vat la: " + this.ten);
		  // System.out.println(" mau cua nhan vat: " + this.Mau);
		   //System.out.println(" Do sat thuong la: " + this.satThuong);
		   System.out.println(" Vu khi la: " + this.Doc);
	       System.out.println("----------------------");
	   }
	   public void tanCong() {
			 System.out.println(" nhan vat su dung vu khi la phong doc");
		}
	   public void banDoc() {
			System.out.println(" Ban doc vao tay sung");
			System.out.println(" ---------------");
			} 

}
