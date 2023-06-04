package pro;

class MatkulCourse extends Course {

    private double labFee;
    

    public MatkulCourse(double feePerSemester, double labFee) {
        super(feePerSemester);
        this.labFee = labFee;
    }

    public double getLabFee() {
        return labFee;
    }

    @Override
    public double calculateTotalPayment() {
        return getFeePerSemester() + labFee;
    }
}
