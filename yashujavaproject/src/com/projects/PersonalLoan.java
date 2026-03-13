package com.projects;


public class PersonalLoan extends Loan {

	public static void main(String[] args) {
		 
		PersonalLoan pl = new PersonalLoan();
		 int age=pl.getUserAge();
		 Double salary=pl.getUserSalary();
		 int cibil=pl.getUserCibilScore();
		 String Aadharno=pl.Aadharcard();
		 String PanCardno=pl.pan;
		 String phoneno=pl.phone;
		 
		if ( salary > 800000 &&  cibil > 750 &&  age > 20 && pl.validateAadharcard(Aadharno)
				 && pl.validatePancard() && pl.validatePhoneNumber()) {
			System.out.println("congraluations !! eligible for personal loan");
			System.out.println("name:");
			System.out.println("Adhar:"+Aadharno);
			System.out.println("Personal Loan interest:" + pl.getLoanROI());
			pl.PLoanDocInfo();
		} else {
			System.out.println(" not eligible for personal loan!! try again..");
		}
		}

	void PLoanDocInfo() {
		System.out.println("Your 📄 Loan approved! we get you soon...");
	}

 }
