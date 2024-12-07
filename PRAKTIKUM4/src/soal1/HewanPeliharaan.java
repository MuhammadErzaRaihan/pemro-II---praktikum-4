package soal1;

public class HewanPeliharaan {

	public String nama;
	public String ras;
	
	public HewanPeliharaan(String nama, String ras) {
		
		this.nama = nama;
		this.ras = ras;
		
	}
	
	   public String getNama() {
	        return nama;
	    }

	    public String getRas() {
	        return ras;
	    }
	    
	    
	    
	    
	public void display() {
		
	  System.out.println("Detail Hewan Peliharaan:");
	  System.out.println("Nama Hewan Peliharaanku Adalah: " + nama);
	  System.out.println("Dengan Ras: " + ras);
	  
	}
}
