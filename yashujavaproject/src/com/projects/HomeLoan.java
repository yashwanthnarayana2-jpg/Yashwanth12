package com.projects;

public class HomeLoan extends Loan {
	@Override 
	double getLoanROI() {
		double ROI=8.5;
	return ROI;}


	public static void main(String[] args) {
		 
		HomeLoan hl = new HomeLoan();
		 String Aadhar=hl.Aadharcard();
		if (hl.getUserSalary() > 800000 && hl.getUserCibilScore() > 750 && hl.getUserAge() > 20
				  && hl.validatePancard() && hl.validatePhoneNumber()) {
			System.out.println("congraluations !! eligible for  Home loan");
			System.out.println("AadharDetails:"+Aadhar);
			System.out.println("Personal Loan interest:" + hl.getLoanROI());
			hl.HLoanDocInfo();
		} else {
			System.out.println(" not eligible for  Home loan!! try again..");
		}
		}
	
	 
	void HLoanDocInfo() {
		System.out.println("Your 📄 Loan approved! we get back you soon...");
	}
	
	

	}


