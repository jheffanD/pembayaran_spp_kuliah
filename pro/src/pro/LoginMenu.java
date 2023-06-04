/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.util.Scanner;


class LoginMenu {

    private static User[] users = {
        new Student("informatika", "paingan", "0856-1234-5678", "perempuan", "Jakarta, 12 Januari 2003", "Melisa Lim", "225314001", "111"),
        new Student("informatika", "paingan", "0812-9876-5432", "perempuan", "Surabaya, 25 Maret 2002", "Angelica Aurelia S.P ", "225314002", "222"),
        new Student("informatika", "paingan", "0877-4567-8901", "perempuan", "Bandung, 7 September 2001", "Fimelia Anadiba Br Karo", "225314003", "333")};

    static String nim, password;
    static Scanner scanner = new Scanner(System.in);

    public static void login() {

        // Membuat objek user
        User user = null;

        // Meminta input username dan password
        System.out.println("-----Login-----");
        System.out.print("Username: ");
        nim = scanner.nextLine();
        System.out.print("Password: ");
        password = scanner.nextLine();
        System.out.println("----------------");

        // Melakukan proses autentikasi
        for (User u : users) {
            if (u.getNim().equals(nim) && u.getPassword().equals(password)) {
                user = u;
                break;
            }
        }
        if (user == null) {
            System.out.println("Username atau password salah.");
            return;
        }

        // Menampilkan menu setelah login berhasil
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Biodata");
            System.out.println("2. Pembayaran");
            System.out.println("3. Daftar Rencana Studi");
            System.out.println("4. Log Out");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Membaca karakter newline setelah membaca pilihan
            System.out.println("");

            switch (choice) {
                case 1:
                    user.displayProfile();
                    break;
                case 2:
                    performPaymentMenu(user);
                    break;
                case 3:
                    matkul();
                    break;
                case 4:
                    System.out.println("TERIMA KASIH,"
                            + "Anda Telah Logout");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 4);
    }

    private static void performPaymentMenu(User user) {
        Course[] courses = {
            new MatkulCourse(51500.0, 500.0),
            new MatkulCourse(33000.0, 500.0),
            new MatkulCourse(55500.0, 500.0)};

        int courseChoice = 0;
        if ("225314001".equals(nim)) {
            courseChoice = 1;
        } else if ("225314002".equals(nim)) {
            courseChoice = 2;
        } else if ("225314003".equals(nim)) {
            courseChoice = 3;

        }


        Course selectedCourse;
        switch (courseChoice) {
            case 1:
                selectedCourse = courses[0];
                break;
            case 2:
                selectedCourse = courses[1];
                break;
            case 3:
                selectedCourse = courses[2];
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }
        spp sp = new spp();
        System.out.println("");
        sp.setSelectedCourse(selectedCourse);
        sp.spp(nim);

        System.out.print("1.Ya 2.Tidak\n"
                + "Apakah Akan Membayar : ");
        int bayar = scanner.nextInt();
        if (bayar == 1) {
            System.out.print("\nMasukkan jumlah pembayaran: ");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Membaca karakter newline setelah membaca jumlah pembayaran
            user.paySPP(amount);
        } else {

        }
    }

    private static void matkul() {
        matakuliah mk = new matakuliah();
        System.out.println("------------- Kartu Rencana Studi -------------");
        System.out.println("Kode \t MataKuliah \t Kelas \t SKS \t Hari");
        System.out.println("-----------------------------------------------");

        if ("225314001".equals(nim)) {
            mk.mahasiswa1();
        } else if ("225314002".equals(nim)) {
            mk.mahasiswa2();
        } else {
            mk.mahasiswa3();
        }
        System.out.println("-----------------------------------------------");
    }

}
