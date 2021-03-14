package Service;

public class PicPay implements OnlinePaymentService{
	
	private static final double PAYMENT_FEE = 0.0474;
	private static final double MONTHIL_INTEREST = 0.01;

	@Override
	public double paymentFee(double amount) {
		return amount * PAYMENT_FEE;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * months * MONTHIL_INTEREST;
	}

}
