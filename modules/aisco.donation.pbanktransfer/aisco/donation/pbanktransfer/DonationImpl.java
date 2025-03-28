package aisco.donation.pbanktransfer;
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
    
    public DonationImpl() {
        System.out.println("Donation via Bank Transfer");
        donationList = new ArrayList<>();
    }
    
    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod, String bankName, String accountNumber) {
    	this.name = name;
        this.email = email;
        this.phone = phone;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    	this.bankName = bankName;
    	this.accountNumber = accountNumber;
    	this.donationList = new ArrayList<>();
    }

    public void getDonation(){ 
    	System.out.println(Arrays.asList(donationList));
    }

    public void addDonation(){
    	donationList.add(new DonationImpl("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "BankTransfer", "BCA", "6437423934"));
        donationList.add(new DonationImpl("Dave", "dave@jmail.com", "+62828 2345 3091", 500000, "BankTransfer", "Mandiri", "0987654321"));
        donationList.add(new DonationImpl("Edo", "edo@jmail.com", "+62828 2345 3091", 300000, "BankTransfer", "BNI", "4567891234"));
    }

    public String toString() {
        return "- Donasi " + name + ": " + amount + " Payment Method: " + paymentMethod + "Bank Account: " + bankName + "Account Number: " + accountNumber + "\n";
    }

}
