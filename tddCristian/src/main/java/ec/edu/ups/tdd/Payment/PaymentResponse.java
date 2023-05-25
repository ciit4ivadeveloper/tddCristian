package ec.edu.ups.tdd.Payment;

public class PaymentResponse {
    enum PaymentStatus {
        OK, ERROR;
    }

    private PaymentStatus status;

    public PaymentStatus getStatus() {
        return status;
    }

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }
}
