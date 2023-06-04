package pro;

public class matakuliah extends Student{

    matakuliah[] mk = new matakuliah[3];

    private String kode, matakuliah, kelas, sks, hari;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    void mahasiswa1() {

        mk[0] = new matakuliah();
        mk[0].setKode("B12");
        mk[0].setMatakuliah("Aljabar");
        mk[0].setKelas("A");
        mk[0].setSks("3");
        mk[0].setHari("Senin");

        mk[1] = new matakuliah();
        mk[1].setKode("B13");
        mk[1].setMatakuliah("Kalkulus");
        mk[1].setKelas("C");
        mk[1].setSks("2");
        mk[1].setHari("Selasa");

        mk[2] = new matakuliah();
        mk[2].setKode("B14");
        mk[2].setMatakuliah("B.indonesia");
        mk[2].setKelas("D");
        mk[2].setSks("2");
        mk[2].setHari("Rabu");

        for (int i = 0; i < 3; i++) {
            System.out.print(mk[i].getKode() + "\t " + mk[i].getMatakuliah() + "\t   " + mk[i].getKelas() + "\t  " + mk[i].getSks() + "\t " + mk[i].getHari());
            System.out.println("");
        }
    }

    void mahasiswa2() {

        mk[0] = new matakuliah();
        mk[0].setKode("A11");
        mk[0].setMatakuliah("L.Matematika");
        mk[0].setKelas("A");
        mk[0].setSks("3");
        mk[0].setHari("Rabu");

        mk[1] = new matakuliah();
        mk[1].setKode("A12");
        mk[1].setMatakuliah("S.Data Linear");
        mk[1].setKelas("C");
        mk[1].setSks("2");
        mk[1].setHari("Kamis");

        mk[2] = new matakuliah();
        mk[2].setKode("A13");
        mk[2].setMatakuliah("B.Jepang");
        mk[2].setKelas("D");
        mk[2].setSks("2");
        mk[2].setHari("Jum'at");

        for (int i = 0; i < 3; i++) {
            System.out.print(mk[i].getKode() + "\t " + mk[i].getMatakuliah() + "\t   " + mk[i].getKelas() + "\t  " + mk[i].getSks() + "\t " + mk[i].getHari());
            System.out.println("");
        }
    }

    void mahasiswa3() {

        mk[0] = new matakuliah();
        mk[0].setKode("C11");
        mk[0].setMatakuliah("Napza merah");
        mk[0].setKelas("A");
        mk[0].setSks("3");
        mk[0].setHari("Rabu");

        mk[1] = new matakuliah();
        mk[1].setKode("C12");
        mk[1].setMatakuliah("S.non formal");
        mk[1].setKelas("C");
        mk[1].setSks("2");
        mk[1].setHari("Kamis");

        mk[2] = new matakuliah();
        mk[2].setKode("C13");
        mk[2].setMatakuliah("B.indonesia");
        mk[2].setKelas("D");
        mk[2].setSks("2");
        mk[2].setHari("Jum'at");

        for (int i = 0; i < 3; i++) {
            System.out.print(mk[i].getKode() + "\t " + mk[i].getMatakuliah() + "\t   " + mk[i].getKelas() + "\t  " + mk[i].getSks() + "\t " + mk[i].getHari());
            System.out.println("");
        }
    }
}
