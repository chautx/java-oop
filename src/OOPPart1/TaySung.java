package OOPPart1;
// ke thua cac thuoc tinh o file NhanVat 

public class TaySung extends NhanVat{
	
   public String Sung ;
   public TaySung() {
	   this.ten =  "Tay sung";
	   this.Mau = 200;
	   this.satThuong =  200;
	   this.Sung = "AK47";
   }
   @Override // ghi de
   public void display() {
	   super.display();
     
   
   //public void display() {
	 // System.out.println(" ten nhan vat la: " + this.ten);
	  // System.out.println(" mau cua nhan vat: " + this.Mau);
	   //System.out.println(" Do sat thuong la: " + this.satThuong);
	   System.out.println(" Vu khi la: " + this.Sung);
	   System.out.println("----------------------");
   }
 public void tanCong() {
	 System.out.println("nhan vat su dung vu khi la nem bom");
 }
 // tao phuong thuc cho Downscating, ep vao class con
public void quangBom(){
	System.out.println("Quang bom vao Zombie");
	System.out.println("-------------");
     }
  
}
