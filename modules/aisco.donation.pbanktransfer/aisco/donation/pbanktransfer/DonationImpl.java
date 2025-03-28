package aisco.donation.pcreditcard;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import aisco.donation.core.DonationDecorator;
import aisco.donation.core.DonationComponent;
import payment.page.core.*;
import payment.page.PaymentPageFactory;

public class DonationImpl extends DonationDecorator {
    PaymentPage payment;
    List <DonationComponent> donationList;
    String bankName;
    String accountNumber;
    
    public DonationImpl(DonationComponent donation, string bankName, string accountNumber) {
    	super(donation);
    	this.bankName = bankName;
    	this.accountNumber = accountNumber;
    	this.donationList = new ArrayList<>();
    }

    public void getDonation(){ 
    	System.out.println(Arrays.asList(donationList));
    }

    public void addDonation(){
    	DonationComponent anisaDonation = new DonationComponent("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "BankTransfer");
        DonationComponent daveDonation = new DonationComponent("Dave", "dave@jmail.com", "+62828 2345 3091", 500000, "BankTransfer");
        DonationComponent edoDonation = new DonationComponent("Edo", "edo@jmail.com", "+62828 2345 3091", 300000, "BankTransfer");
        
    	donationList.add(new DonationImpl(anisaDonation, "BCA", "6437423934"));
        donationList.add(new DonationImpl(daveDonation, "Mandiri", "0987654321"));
        donationList.add(new DonationImpl(edoDonation, "BNI", "4567891234"));
    }

    public String toString() {
        return "- Donasi " + name + ": " + amount + " Payment Method: " + paymentMethod + "Bank Account: " + bankName + "Account Number: " + accountNumber + "\n";
    }

}
