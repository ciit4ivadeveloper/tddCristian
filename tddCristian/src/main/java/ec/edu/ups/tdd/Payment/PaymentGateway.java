package ec.edu.ups.tdd.Payment;

public interface PaymentGateway {
    public PaymentResponse requestPayment (PaymentRequest paymentRequest);
}
