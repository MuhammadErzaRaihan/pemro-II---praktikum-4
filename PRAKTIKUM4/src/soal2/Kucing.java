package soal2;

public class Kucing extends HewanPeliharaan {
    String warnaBulu;

    public Kucing(String nama, String ras, String warnaBulu) {
        super(nama, ras); 
        this.warnaBulu = warnaBulu; 
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    @Override
    public void display() {
        super.display(); 
        System.out.println("Memiliki warna bulu: " + warnaBulu);
    }
}