
public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test ref=new Test();
		Banking(ref);
		
		HSBC hsbc = new HSBC();
		Banking(hsbc); 
		
		Barclays barclays = new Barclays();
		Banking(barclays);
				
	}
	
	/* 
	 * send my objects of bank of england
	 * we cannot create the ref as its a abstract
	 */
	static public void Banking(BankOfEngland bankingRef) {
		bankingRef.showBalance();
		bankingRef.openAccount();
		
	}
}
