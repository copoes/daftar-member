package tugas25;
import java.io.*;
public class jual {
    void data(int po, int sell, int harga)throws IOException{
        BufferedReader gundam = new BufferedReader(new InputStreamReader(System.in));
        int menu=0;
        daftarMember dm = new daftarMember();
        String name= dm.nama;
        
        //Input nama member
        System.out.println("Input nama member");
        name = gundam.readLine();
        for(daftarMember dm:daftarMember(nama)){
        System.out.println("Pre Order Gundam Baru");
            System.out.println("1. Gundam 1 ");
            System.out.println("2. Gundam 2 ");              
                switch(menu){
                    case 1:
                        if (dm.nama.equals(name)) {
                            System.out.println("Anda terdaftar sebagai member");
                            int gundam1= 50000;
                            int hasil = (gundam1 *5) / 100;
                            System.out.println("Harga Gundam 1 : "+hasil);
                            System.out.print("Nominal Pebayaran : ");
                            int bayar = Integer.parseInt(gundam.readLine());
                            if(bayar>=hasil){
                                System.out.println("Pembayaran Lunas");
                            }
                            else{
                                System.out.println("Pembayaran Belum Lunas");
                                int kurang = 50000 - bayar;
                                System.out.println("Kekurangan pembayaran : "+kurang);
                            }
                        } else {
                            System.out.println("Anda belum terdaftar member");
                            int gundam1=50000;
                            System.out.println("Harga Gundam 1 : "+gundam1);
                            System.out.print("Nominal Pembayaran : ");
                            int bayar = Integer.parseInt(gundam.readLine());
                            if (bayar>=50000) {
                                System.out.println("Pemyaran Lunas");
                            }
                            else{
                                System.out.println("Pembayaran Belum Lunas");
                                int kurang = 50000 - bayar;
                                System.out.println("Kekurangan pembayaran : "+kurang);
                            }
                        }
                        break;
                }
    }
    }
}
