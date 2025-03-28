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
    String cardNumber;
    String cvc;
    
    public DonationImpl() {
        System.out.println("Donation via Credit Card");
        donationList = new ArrayList<>();
    }
    
    public DonationImpl(String name, String email, String phone, int amount, String paymentMethod, String cardNumber, String cvc) {
    	this.name = name;
        this.email = email;
        this.phone = phone;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    	this.cardNumber= cardNumber;
    	this.cvc = cvc;
    	this.donationList = new ArrayList<>();
    }

    public void getDonation(){ 
    	System.out.println(Arrays.asList(donationList));
    }

    public void addDonation(){
    	donationList.add(new DonationImpl("Anisa", "anisa@jmail.com", "+62878 6654 3321", 2500000, "CreditCard", "3092183012983", "123"));
        donationList.add(new DonationImpl("Dave", "dave@jmail.com", "+62828 2345 3091", 500000, "CreditCard", "572357239857", "022"));
        donationList.add(new DonationImpl("Edo", "edo@jmail.com", "+62828 2345 3091", 300000, "CreditCard", "12382198371289", "983"));
    }

    public String toString() {
        return "- Donasi " + name + ": " + amount + " Payment Method: " + paymentMethod + "Card Number: " + cardNumber + "\n";
    }

}
