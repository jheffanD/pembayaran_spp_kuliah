/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

class Student extends User {

    private double remainingPayment;
    private String jurusan;
    private String alamat;
    private String no_hp;
    private String gander;
    private String ttl;
    spp total = new spp();
  


    public Student() {

    }

    public Student(String jurusan, String alamat, String no_hp, String gander, String ttl, String username, String nim, String password) {
        super(username, nim, password);
        this.jurusan = jurusan;
        this.alamat = alamat;
        this.no_hp = no_hp;
        this.gander = gander;
        this.ttl = ttl;
    }

    @Override
    public void displayProfile() {
        System.out.println("------------------ BIODATA ------------------");
        System.out.println("Nomer Induk Mahasiswa   : " + getNim());
        System.out.println("Nama                    : " + getUsername());
        System.out.println("Jenis Kelamin           : " + getGander());
        System.out.println("Tempat / Tanggal Lahir  : " + getTtl());
        System.out.println("Alamat                  : " + getAlamat());
        System.out.println("Jurusan                 : " + getJurusan());
        System.out.println("No.HP                   : " + getNo_hp());
        System.out.println("---------------------------------------------");
    }

    @Override
    public void paySPP(double amount) {
        if (total != null) {
            if (amount <= spp.total) {
                remainingPayment += spp.total;
                remainingPayment -= amount;
                System.out.println("PEMBAYARAN BERHASIL.\nSisa pembayaran: " + remainingPayment);
            } else {
                System.out.println("Jumlah pembayaran melebihi sisa pembayaran.\nharap menginputkan data sesuai total pembayaraan yang tertera ");
            }
        } else {
            System.out.println("Belum ada informasi total pembayaran yang tersedia.");
        }
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public void setTotal(spp total) {
        this.total = total;
    }

}
