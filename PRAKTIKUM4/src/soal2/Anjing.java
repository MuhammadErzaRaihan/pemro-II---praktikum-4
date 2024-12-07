package soal2;

public class Anjing extends HewanPeliharaan {
         String warnaBulu;
         String kemampuan;
       
         public  Anjing(String nama, String ras, String warnaBulu, String kemampuan) {
        	 super(nama, ras);
        	 this.warnaBulu =  warnaBulu;
        	 this.kemampuan =  kemampuan;
        	 
         }
         
    	   public String getWarnaBulu() {
            return warnaBulu;
        }
    	   
    	   public String getkemampuan() {
    		   return kemampuan;
    	   }
    	   @Override
        public void display() {
        	super.display();
        	System.out.println("Memiliki warna bulu: " + warnaBulu);
        	System.out.println("Memiliki kemampuan: " + kemampuan);
        }

}
