package pro;

abstract class Course {

    private String courseName;
    private final double feePerSemester;

    public Course(double feePerSemester) {
        this.feePerSemester = feePerSemester;
    }

    public double getFeePerSemester() {
        return feePerSemester;
    }

    // Abstract method untuk menghitung total pembayaran SPP
    public abstract double calculateTotalPayment();
}
