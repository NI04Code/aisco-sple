package aisco.donation.core;

import java.util.ArrayList;
import java.util.List;

public abstract class DonationDecorator extends DonationComponent {
    public DonationComponent donation;

    public DonationDecorator (DonationComponent donation) {
        this.donation = donation;
    }
    
    public DonationDecorator () {
    	System.out.println("Decorator");
    }

    public void addDonation() {
    	
    }
    public  void getDonation() {
    	
    }

    public String toString() {
        return "- Donasi " + name + ": " + amount + " Payment Method: " + paymentMethod + "\n";
    }

   
}
