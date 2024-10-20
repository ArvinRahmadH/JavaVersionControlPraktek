import java.util.Scanner;

public class addBuku {

    private String iDbuku;
    private String Jbuku;
    private String Author;


    public void Tambahbuku(){
        Scanner input = new Scanner (System.in);
        System.out.println("masukkan id buku = ");
        String iDbuku = input.next();
        setiDbuku(iDbuku);
        System.out.println("masukkan judul buku = ");
        String Jbuku = input.next();
        setJbuku(Jbuku);
        System.out.println("masukkan author = ");
        String Author = input.next();
        setAuthor(Author);


    }

    public void setiDbuku(String iDbuku) {
        this.iDbuku = iDbuku;
    }

    public void setJbuku(String jbuku) {
        Jbuku = jbuku;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getiDbuku() {
        return iDbuku;
    }

    public String getJbuku() {
        return Jbuku;
    }

    public String getAuthor() {
        return Author;
    }
}
