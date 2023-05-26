package models;

public class Contract {
    private String contractCode;
    private String bookingCode;
    private String advanceDeposit;
    private String totalPayment;
    private String customerCode;

    public Contract() {
    }

    public Contract(String contractCode, String bookingCode, String advanceDeposit, String totalPayment, String customerCode) {
        this.contractCode = contractCode;
        this.bookingCode = bookingCode;
        this.advanceDeposit = advanceDeposit;
        this.totalPayment = totalPayment;
        this.customerCode = customerCode;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getAdvanceDeposit() {
        return advanceDeposit;
    }

    public void setAdvanceDeposit(String advanceDeposit) {
        this.advanceDeposit = advanceDeposit;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractCode='" + contractCode + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", advanceDeposit='" + advanceDeposit + '\'' +
                ", totalPayment='" + totalPayment + '\'' +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
}

