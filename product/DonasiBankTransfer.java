package aisco.product.donasibanktransfer;

import aisco.program.ProgramFactory;
import aisco.program.core.Program;
import aisco.financialreport.FinancialReportFactory;
import aisco.financialreport.core.FinancialReport;

import java.util.ArrayList;
import java.util.List;

import aisco.donation.DonationFactory;
import aisco.donation.core.Donation;

public class DonasiBankTransfer {
	 	private static final int INDEX_SCHOOL = 0;
	    private static final int INDEX_LIBRARY = 1;
	    private static final int INDEX_ELECTRICITY = 2;

	    private static FinancialReport income1;
	    private static FinancialReport expense1;

	    public static List<Program> addProgram()
	    {   
	        System.out.println("\n Programs: ");
	        List<Program> programs = new ArrayList<>();
	        Program schoolconstruction = ProgramFactory.createProgram("aisco.program.activity.ProgramImpl", 101, "School Renovation", "Renovate old school buildings", "200 students", "Local Community", "https://www.edurebuild.org/logo");
	        Program freelibrary = ProgramFactory.createProgram("aisco.program.activity.ProgramImpl", 102, "Mobile Library", "Provide books via mobile units", "rural kids", "ReadEasy Foundation", "https://www.mobilelib.org/logo");
	        Program paymentelectricity = ProgramFactory.createProgram("aisco.program.operational.ProgramImpl", 103, "Water Bill Support", "Assist with school utility costs", "5 Schools");
	        programs.add(INDEX_SCHOOL,schoolconstruction);
	        programs.add(INDEX_LIBRARY, freelibrary);
	        programs.add(INDEX_ELECTRICITY, paymentelectricity);
	        return programs;
	    }

	    public static List<FinancialReport> addIncome(List<Program> programs)
	    {
	        List<FinancialReport> incomes = new ArrayList<>();
	        income1 = FinancialReportFactory.createFinancialReport("aisco.financialreport.income.FinancialReportImpl", 
	        	    FinancialReportFactory.createFinancialReport("aisco.financialreport.core.FinancialReportImpl", "101", "15-03-2025", 250000, "Donation Budi", programs.get(INDEX_SCHOOL), "12000"), 
	        	    "Transfer");
	        	incomes.add(income1);
	        	incomes.add(FinancialReportFactory.createFinancialReport("aisco.financialreport.income.FinancialReportImpl", 
	        	    FinancialReportFactory.createFinancialReport("aisco.financialreport.core.FinancialReportImpl", "102", "20-03-2025", 4500000, "Donation Rina", programs.get(INDEX_LIBRARY), "13000"), 
	        	    "Cash"));
	        	incomes.add(FinancialReportFactory.createFinancialReport("aisco.financialreport.income.FinancialReportImpl", 
	        	    FinancialReportFactory.createFinancialReport("aisco.financialreport.core.FinancialReportImpl", "103", "25-03-2025", 7500000, "CSR PT. Makmur", programs.get(INDEX_SCHOOL), "140"), 
	        	    "Transfer"));
	        	incomes.add(FinancialReportFactory.createFinancialReport("aisco.financialreport.income.FinancialReportImpl", 
	        	    FinancialReportFactory.createFinancialReport("aisco.financialreport.core.FinancialReportImpl", "104", "28-03-2025", 100000, "Donation Tono", programs.get(INDEX_ELECTRICITY), "150"), 
	        	    "Cash"));
	        return incomes;
	    }

	    public static List<FinancialReport> addExpense(List<Program> programs)
	    {
	        List<FinancialReport> expenses = new ArrayList<>();
	        expense1 = FinancialReportFactory.createFinancialReport("aisco.financialreport.expense.FinancialReportImpl", 
	        	    FinancialReportFactory.createFinancialReport("aisco.financialreport.core.FinancialReportImpl", "201", "10-03-2025", 2000000, "Purchase Bricks", programs.get(INDEX_SCHOOL), "42000"));
	        	expenses.add(expense1);
	        	expenses.add(FinancialReportFactory.createFinancialReport("aisco.financialreport.expense.FinancialReportImpl", 
	        	    FinancialReportFactory.createFinancialReport("aisco.financialreport.core.FinancialReportImpl", "202", "15-03-2025", 3000000, "Install Shelves", programs.get(INDEX_LIBRARY), "43000")));
	        	expenses.add(FinancialReportFactory.createFinancialReport("aisco.financialreport.expense.FinancialReportImpl", 
	        	    FinancialReportFactory.createFinancialReport("aisco.financialreport.core.FinancialReportImpl", "203", "20-03-2025", 75000, "Textbook Set", programs.get(INDEX_LIBRARY), "44000")));
	        return expenses;
	    }

	    public static void addDonation()
	    {  
	        Donation donate = DonationFactory.createDonation("aisco.donation.pbanktransfer.DonationImpl");
	        donate.addDonation();
	        donate.getDonation();
	    }

	    public static void main(String[] args) {
	        System.out.println ("Product Bank Transfer");
	        List<Program> programs = addProgram();
	        System.out.println(programs);
	        
	        List<FinancialReport> incomes = addIncome(programs);
	        income1.printHeader();
	        System.out.println(incomes);
	        int totalincome = ((aisco.financialreport.income.FinancialReportImpl)income1).total(incomes);

	        List<FinancialReport> expenses = addExpense(programs);
	        expense1.printHeader();
	        System.out.println(expenses);
	        int totalexpense = ((aisco.financialreport.expense.FinancialReportImpl) expense1).total(expenses);

	        addDonation();
	        int balance = totalincome-totalexpense;
	        System.out.println("Balance: "+balance);
	    }
}