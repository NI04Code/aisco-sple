package aisco.donation.pcreditcard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import aisco.donation.core.DonationComponent;
import payment.page.core.*;
import payment.page.PaymentPageFactory;

public class DonationImpl extends DonationDecorator {
    PaymentPage payment;
    List <DonationComponent> donationList;
    String cardNumber;
    String cvc;
    
    public DonationImpl(DonationComponent donation, string cardNumber, string cvc) {
    	super(donation);
    	this.cardNumber = cardNumber;
    	this.cvc = cvc;
    	this.donationList = new ArrayList<>();
    }

    public void getDonation(){ 
    	System.out.println(Arrays.asList(donationList));
    }

    public void addDonation(){
    	DonationComponent anisaDonation = new DonationComponent("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "BankTransfer");
        DonationComponent daveDonation = new DonationComponent("Dave", "dave@jmail.com", "+62828 2345 3091", 500000, "BankTransfer");
        DonationComponent edoDonation = new DonationComponent("Edo", "edo@jmail.com", "+62828 2345 3091", 300000, "BankTransfer");
        
    	donationList.add(new DonationImpl(anisaDonation, "3092183012983", "123"));
        donationList.add(new DonationImpl(daveDonation, "572357239857", "022"));
        donationList.add(new DonationImpl(edoDonation, "12382198371289", "983"));
    }

    public String toString() {
        return "- Donasi " + name + ": " + amount + " Payment Method: " + paymentMethod + "Bank Account: " + cardNumber + "Account Number: " + cvc + "\n";
    }

}
