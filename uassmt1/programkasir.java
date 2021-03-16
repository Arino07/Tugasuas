 //Import class yang dibutuhkan
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class programkasir{
    public static void main(String args[]){
        login();}

static void login(){    
        String barang[]=new String[3];
         String data[]={"ARINO","202013023"};
         String nama, sandi;
	int pilih,pengurutan;
         Scanner apa=new Scanner(System.in);
        
        System.out.print("Nama Karyawan : ");
        nama=apa.nextLine();
        System.out.print("Sandi Karyawan : ");
        sandi=apa.nextLine();

        if(nama.equals(data[0])&&sandi.equals(data[1])){
            System.out.println("MASUKKAN MENU PILIHAN ANDA");
            pilih();
        }
        else{
            System.out.print("Maaf sandi yang anda masukan salah");
            login();
        }
    }

static void pilih (){
	System.out.println("1.  Menu kasir ");
        System.out.println("2.  Menu pengurutan ");
        System.out.println("3.  go out ");
        Scanner apa=new Scanner(System.in);
        int menu ;
        System.out.print("Silahkan pilih pelayanan yang anda inginkan : ");
        menu=apa.nextInt();
        if(menu==1){
            kasir();
        }
        else if(menu==2){
            Pengurutan();
        }
        else{
            System.exit(0);
        }
    }

static void kasir(){
	System.out.println(" ====================== ");
System.out.println("   SELAMAT DATANG DI  ");
System.out.println("  TOKO BANGUNAN JAYA ");
System.out.println("     ANTI BAPERAN   ");
System.out.println(" ======================");

Scanner scan = new Scanner (System.in);
int a = 0;
int total ,total1 ,bayar;
int price = 0;
int b= 24000 ,c=1500 ,d=28000 ,e=30000 ,f=45000 ,g=30000 ,h=6000 ,i=20000 ,j=28000 ,k=25000 ,l=6000 ,m=11000 ,n=35000, o=15000, p=5000;


System.out.println("*****-------------------------Pilihan Orang Bijak-------------------------*****");//mencetak nilai dari objek
System.out.println("| *-DAFTAR BARANG-* |");//mencetak nilai dari objek
System.out.println("|>Paket Barang Utama |");//mencetak nilai dari objek
System.out.println("| 50.Alat Tukang (Cangkul,Palu,Sekop,dan Cetok)............Rp.150000|");//mencetak nilai dari objek
System.out.println("|>Daftar Barang Primer  |");//mencetak nilai dari objek
System.out.println("|1.Semen...........................................Rp.24000|");//mencetak nilai dari objek
System.out.println("|2.Batako...........................................Rp.1500|");//mencetak nilai dari objek
System.out.println("|3.Besi........... ...................... .........Rp.28000|");//mencetak nilai dari objek
System.out.println("|4.Seng............................................Rp.30000|");//mencetak nilai dari objek
System.out.println("|5.Pasir...........................................Rp.45000|");//mencetak nilai dari objek
System.out.println("|Daftar Sekunder |");//mencetak nilai dari objek
System.out.println("|6.Jendela.........................................Rp.30000|");//mencetak nilai dari objek
System.out.println("|7.Kran Air.........................................RP.6000|");//mencetak nilai dari objek
System.out.println("|8.Chat Tembok dan Kayu............................Rp.20000|");//mencetak nilai dari objek
System.out.println("|>Daftar Tersier |");//mencetak nilai dari objek
System.out.println("|9.Keramik.........................................Rp.28000|");//mencetak nilai dari objek
System.out.println("|10.Semen Putih.....................................Rp.6000|");//mencetak nilai dari objek
System.out.println("|11.Thinner........................................Rp.11000|");//mencetak nilai dari objek
System.out.println("|12.Mesin Air......................................Rp.35000|");//mencetak nilai dari objek
System.out.println("|Daftar Barang Pelengkap |");//mencetak nilai dari objek
System.out.println("|13.Asbes..........................................Rp.15000|");//mencetak nilai dari objek
System.out.println("|14.Sikutan........................................ Rp.5000|");//mencetak nilai dari objek
System.out.println("|15.Talang..........................................Rp.6000|");//mencetak nilai dari objek
System.out.println("Membeli seharga Rp 200000,Anda mendapatkan Kawat Baja Bangunan Gratis! ");//mencetak nilai dari objek
System.out.println("Membeli seharga Rp 100000,Anda mendapatkan Obeng Bunga Gratis! ");//mencetak nilai dari objek
System.out.println("Membeli seharga Rp 50000,Anda mendapatkan Mata Bor Gratis! ");//mencetak nilai dari objek


for(String z = "y" ;z.equals("y")||z.equals("Y");)
{
System.out.print("Silahkan Pilih Nomor Menu  : ");
a = scan.nextInt();

if (a==50){
System.out.println("Barang Yang Anda Pilih Paket Barang Utama Rp."+b);
price = price + b;
}
else if(a==1){
System.out.println("Barang Yang Anda Pilih Semen Rp."+b);
price = price + b;
}
else if(a==2){
System.out.println("Barang Yang Anda Pilih Batako Rp."+c);
price = price + c;
}

else if(a==3){
System.out.println("Barang Yang Anda Pilih Besi Rp."+d);
price = price + d;
}
else if(a==4){
System.out.println("Barang Yang Anda Pilih Seng Rp."+e);
price = price + e;
}
else if(a==5){
System.out.println("Barang Yang Anda Pilih Pasir Rp."+f);
price = price + f;
}

else if(a==6){
System.out.println("Barang Yang Anda Pilih Jendela Rp."+g);
price = price + g;
}

else if(a==7){
System.out.println("Barang Yang Anda Pilih Kran Air Rp."+h);
price = price + h;
}

else if(a==8){
System.out.println("Barang Yang Anda Pilih Chat Tembok dan Kayu Rp."+i);
price = price + i;
}
else if(a==9){
System.out.println("Barang Yang Anda Pilih Keramik (Cold) Rp."+j);
price = price + i;
}
else if(a==10){
System.out.println("Barang Yang Anda Pilih Semen Putih Float Rp."+k);
price = price + k;
}
else if(a==11){
System.out.println("Barang Yang Anda Pilih Thinner Rp."+l);
price = price + l;
}
else if(a==12){
System.out.println("Barang Yang Anda Pilih Mesin Air Rp."+m);
price = price + m;
}

else if(a==13){
System.out.println("Barang Yang Anda Pilih Asbes Rp."+n);
price = price + n;
}
else if(a==14){
System.out.println("barang Yang Anda Pilih Sikutan Rp."+o);
price = price + o;
}
else if(a==15){
System.out.println("barang Yang Anda Pilih Talang Rp."+p);
price = price + p;
}




System.out.println();
total = price; 			// melakukan proses perhitungan dari nilai
System.out.println("Anda harus membayar : Rp. " + total);		//mencetak nilai dari objek total


if (price == 200000) {
System.out.println("Selamat Anda mendapatkan Hadiah Kawat Baja Bangunan Gratis!");
}
if (price == 100000) {
System.out.println("Selamat Anda mendapatkan Hadiah Obeng Bunga Gratis!");
}
if (price == 50000) {
System.out.println("Selamat Anda mendapatkan Hadiah Mata Bor Gratis!");   
}
{
System.out.print("Apakah ingin mencari barang yang lain? Y/T : ");
z = scan.next();
}

System.out.print("Bayar : Rp. ");
bayar = scan.nextInt();
total1 = (int) (bayar - total);
System.out.println("Kembaliannya : Rp. " +total1);//mencetak nilai dari objek total1
System.out.println("TERIMA KASIH TELAH BERKUNJUNG");
System.out.println("SEMOGA HARI ANDA MENYENANGKAN");
System.out.println("===============================================================================");
	}
}

static void Pengurutan(){
	
	int jumlah,i,j, swap;
  Scanner scan = new Scanner(System.in);
	 
  System.out.print("Masukkan Jumlah Bilangan Yang Mau DiInputkan :");
  jumlah = scan.nextInt();
 
  int array[] = new int[jumlah];
  
  System.out.println("\nMasukkan " + jumlah+" Buah Bilangan Integer");
  System.out.println("===========================================");
  for(i=0; i<jumlah;i++)
  {
   System.out.print("Bilangan Ke- " + (i+1)+" =");
   array[i]=scan.nextInt();
  }

  System.out.println("\nBilangan Belum Terurutnya");
  for(int a=0;a<jumlah;a++)
  {
   System.out.print(array[a] +" ");
  }

  for(i=0; i<(jumlah-1);i++)   
  {
   for(j=0;j<jumlah-i-1;j++)
   {
    if (array[j] > array[j+1])
    {
     swap = array[j];
     array[j] = array[j+1];
     array[j+1]=swap;
    }
   }
  }

  System.out.println("\n\nBilangan Terurutnya adalah :");
  for(i=0;i<jumlah; i++)
	   System.out.print(array[i] +" ");		
	}
}
