import java.util.Scanner;

public class studiKasus2_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        String namaMahasiswa = sc.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA, BAKORMA, MANDIRI, PKM, atau LAINNYA): ");
        String jenis = sc.nextLine().trim();

        System.out.print("Jumlah dokumen: ");
        int jumlahDokumen = sc.nextInt();

        int juara = 0;
        int pkm = 0;

        if (jenis.equalsIgnoreCase("BELMAWA")|| jenis.equalsIgnoreCase("BAKORMA")
        || jenis.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat juara: ");
            juara = sc.nextInt();
        }else if (jenis.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            pkm = sc.nextInt();
        }

        String status;
        int kurang = 4 - jumlahDokumen;

        if(jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
        || jenis.equalsIgnoreCase("MANDIRI")) {
            if (juara >=1 && juara <=3){
                if (jumlahDokumen == 4){
                    status = "Dokumen lengkap. Dana penghargaan diberikan.";
                }else{
                    status = "Dokumen tidak lengkap (kurang " + kurang
                    + " dokumen). Dana penghargaan tidak diberikan.";
                }
            }else{
                status = "Bukan juara 1,2, atau 3. Dana penghargaan tidak diberikan.";
            }
        }else if (jenis.equalsIgnoreCase("PKM")) {
            if (pkm == 1) {
                if(jumlahDokumen == 4){
                    status = "Dokumen lengkap. Dana penghargaan diberikan.";
                }else {
                    status = "Dokumen tidak lengkap (kurang " + kurang
                    + "dokumen). Dana penghargaan tidak diberikan.";
                }
            }else{
                status = "PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.";
            }
        }else if(jenis.equalsIgnoreCase("LAINNYA")){
            status = "Kegiatan lainnya tidak memperoleh dana penghargaan.";
        }else{
            status = "Jenis kegiatan tidak dikenali.";
        }

        System.out.print("Status : " + status);
    }
    
}
