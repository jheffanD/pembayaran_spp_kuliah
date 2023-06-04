package pro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class spp {

    static public double total;
    private double denda;
    private double spp;
    private double sks;
    static String formattedDueDate;
    private Course selectedCourse;

    public double getSks() {
        return sks;
    }

    public void setSks(double sks) {
        this.sks = sks;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }

    public double getSpp() {
        return spp;
    }

    public void setSpp(double spp) {
        this.spp = spp;
    }

    public void setSelectedCourse(Course course) {
        selectedCourse = course;
    }

    private void showPaymentDetails(String nim, int dueDays) {

        LocalDate today = LocalDate.now();
        LocalDate dueDate = today.plusDays(dueDays);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        formattedDueDate = dueDate.format(formatter);

    }

    public void spp(String nim) {
        if ("225314001".equals(nim)) {
            setSks(2000);
            showPaymentDetails("225314001", 30); // Tampilkan detail pembayaran dengan batas 30 hari
        } else if ("225314002".equals(nim)) {
            setSks(3000);
            showPaymentDetails("225314002", 25); // Tampilkan detail pembayaran dengan batas 25 hari
        } else if ("225314003".equals(nim)) {
            setSks(5000);
            showPaymentDetails("225314003", 35); // Tampilkan detail pembayaran dengan batas 35 hari
        }

        System.out.println("--------Kartu Keuangan--------");
        System.out.println("SKS             : " + getSks());
        System.out.println("Denda           : " + selectedCourse.calculateTotalPayment());
        total = getSks() + selectedCourse.calculateTotalPayment();
        System.out.println("Total Bayar     : " + total);
        System.out.println("");
        System.out.println("Tanggal Batas Pembayaran: " + formattedDueDate);

    }

}
