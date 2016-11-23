package tugas25;
import java.io.*;

public class daftarMember {

   public String nama;
    //String member;
    void inputNama(String nama[], String jk[],
            String lahir[], int umur[], String alamat[], int n)throws IOException{
        BufferedReader daftar = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Jumlah Daftar Member : ");
        n = Integer.parseInt(daftar.readLine());
        for (int i = 1; i <= n; i++) {
            System.out.println("Data ke-"+i);
            System.out.print("Input Nama : ");   
            nama[i] = daftar.readLine();
            System.out.print("Input Jenis Kelamin : ");
            jk[i] = daftar.readLine();
            System.out.print("Input Tanggal Lahir : ");
            lahir[i] = daftar.readLine();
            System.out.print("Inpput Umur : ");
            umur[i] = Integer.parseInt(daftar.readLine());
            System.out.print("Input Alamat : ");
            alamat[i] = daftar.readLine();
        }
    }
    //daftarMember(String nama[]){
      //  this.nama=nama;
    //}
}
