
public class Finance {
	double interestRate;
	double downPayment;
	int terms;
	
   public double calculateMonthlyPayment(int principal ,double interestRate,double downPayment,int terms) {

	   double monthlyInterestRate = interestRate / 12 / 100;
	    int numberOfPayments = terms * 12;

	    double monthlyPayment = (principal - downPayment) * monthlyInterestRate /
	            (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

	    return monthlyPayment;
    }

	
	public double getInteresRate() {
		return interestRate;
	}
	public void setInteresRate(double interesRate) {
		this.interestRate = interesRate;
	}

	public double getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}
	public int getTerms() {
		return terms;
	}
	public void setTerms(int terms) {
		this.terms = terms;
	}
}
