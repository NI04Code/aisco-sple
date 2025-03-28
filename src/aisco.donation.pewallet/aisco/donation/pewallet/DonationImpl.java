package aisco.donation.pewallet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import aisco.donation.core.DonationDecorator;
import aisco.donation.core.DonationComponent;
import payment.page.core.*;
import payment.page.PaymentPageFactory;

public class DonationImpl extends DonationDecorator {
    PaymentPage payment;
    List <DonationImpl> donationList;
    String walletName;
    String walletNumber;
    
    
    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod, String walletName, String walletNumber) {
    	this.name = name;
        this.email = email;
        this.phone = phone;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    	this.walletName = walletName;
    	this.walletNumber = walletNumber;
    	this.donationList = new ArrayList<>();
    }

    public void getDonation(){ 
    	System.out.println(Arrays.asList(donationList));
    }

    public void addDonation(){
    	donationList.add(new DonationImpl("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "BankTransfer", "gopay", "+62878 6654 3321"));
        donationList.add(new DonationImpl("Dave", "dave@jmail.com", "+62828 2345 3091", 500000, "BankTransfer", "ovo", "+62828 2345 3091"));
        donationList.add(new DonationImpl("Edo", "edo@jmail.com", "+62828 2345 3091", 300000, "BankTransfer", "dana", "+62828 2345 3091"));
    }

    public String toString() {
        return "- Donasi " + name + ": " + amount + " Payment Method: " + paymentMethod + "Wallet name: " + walletName + "Wallet number: " + walletNumber + "\n";
    }

}
