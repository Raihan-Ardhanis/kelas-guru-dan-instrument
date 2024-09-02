import java.util.Scanner;

public class TesGuru {
    //1.NIP
    //2.NAMA
    //3.MAPEL
    //4.STATUS
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = input.nextLine();
        System.out.println("Mapel :");
        String mapel = input.nextLine();
        System.out.println("Status :");
        String status = input.nextLine();
        System.out.println("NIP :");
        int nip = input.nextInt();

        input.close();

        // Guru BuPasha = new Guru(nip, nama, mapel,status);
        // BuPasha.print();

        // Guru pakAbidin =  new Guru(1111, "Pak Abidin", "Matematika", "Tetap");

        // Guru pakMunif =  new Guru(1122, "Pak Munif", "Agama", "Part Time");

        // Guru buPasha =  new Guru(1133, "Bu Pasha", "Produktif RPL", "Tetap");

        // Guru pakFalah =  new Guru(1144, "Pak Falah", "Seni Budaya", "Full Time");
        
        // Guru buAsry =  new Guru(1155, "Bu Asry", "Bahasa Indonesia", "TETAP");


        Guru BuPasha = new Guru(3456, "Pasha", "RPL", "Tetap");

        BuPasha.setNama("Bu Pasha");
        BuPasha.setMapel("RPL");
        BuPasha.setStatus("Tetap");
        BuPasha.setNip(3456);

        BuPasha.print();





    }

    


        
    
    
}
