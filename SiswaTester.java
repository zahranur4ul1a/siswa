//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = new Constructor ();
        Siswa shabrina = new Siswa();
        Siswa rasyid = new Siswa();
        Siswa kiya = new Siswa();
        Siswa grace = new Siswa();
        Siswa cinta = new Siswa();
        Siswa chylla = new Siswa();

        shabrina.id = 32;
        shabrina.nama = "Shabrina";
        shabrina.ipk = 85.7;
        rasyid.id = 30;
        rasyid.nama = "Rasyid";
        rasyid.ipk = 93.4;
        kiya.id = 13;
        kiya.nama = "Kiya";
        kiya.ipk = 76.8; 
        grace.id = 12;
        grace.nama = "grace";
        grace.ipk = 21.5;
        cinta.id = 28;
        cinta.nama = "Cinta";
        cinta.ipk = 96.5;
        chylla.id = 7;
        chylla.nama = "Chylla";
        chylla.ipk = 87.9;


        shabrina.print();
        rasyid.print();
        kiya.print();
        grace.print();
        cinta.print();
        chylla.print();
    }

}
    

