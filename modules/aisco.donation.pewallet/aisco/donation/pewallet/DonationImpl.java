package aisco.donation.pewallet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import aisco.donation.core.DonationComponent;
import payment.page.core.*;
import payment.page.PaymentPageFactory;

public class DonationImpl extends DonationDecorator {
    PaymentPage payment;
    List <DonationComponent> donationList;
    String walletName;
    String walletNumber;
    
    public DonationImpl(DonationComponent donation, string walletName, string walletNumber) {
    	super(donation);
    	this.walletName = walletName;
    	this.walletNumber = walletNumber;
    	this.donationList = new ArrayList<>();
    }

    public void getDonation(){ 
    	System.out.println(Arrays.asList(donationList));
    }

    public void addDonation(){
    	DonationComponent anisaDonation = new DonationComponent("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "BankTransfer");
        DonationComponent daveDonation = new DonationComponent("Dave", "dave@jmail.com", "+62828 2345 3091", 500000, "BankTransfer");
        DonationComponent edoDonation = new DonationComponent("Edo", "edo@jmail.com", "+62828 2345 3091", 300000, "BankTransfer");
        
    	donationList.add(new DonationImpl(anisaDonation, "gopay", "+62878 6654 3321"));
        donationList.add(new DonationImpl(daveDonation, "ovo", "+62828 2345 3091"));
        donationList.add(new DonationImpl(edoDonation, "dana", "+62828 2345 3091"));
    }

    public String toString() {
        return "- Donasi " + name + ": " + amount + " Payment Method: " + paymentMethod + "Bank Account: " + walletName + "Account Number: " + walletNumber + "\n";
    }

}
