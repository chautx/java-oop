package OOPPart1;
//su dung cho ke thua
// use abstract for class NhanVat


public abstract class NhanVat {
	
	public String ten;
    public int Mau;
	public int satThuong;

	 public void display() {
		   System.out.println(" ten nhan vat la: " + this.ten);
		   System.out.println(" Mau cua nhan vat: " + this.Mau);
		   System.out.println(" Do sat thuong la: " + this.satThuong);
          }
	 public abstract void tanCong();
	 
	 
	 }