package classesandobjects;

public class AccountHolderObjects {
	public static void main(String[] args) {
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();

		System.out.println("Eligibility for Credit Card:");
		System.out.println();
		
		tom.firstName="Tom";
		tom.lastName="Smith";
		tom.age=21;
		tom.accountBalance=10000;
		tom.testEligibilityForCreditCard();
		System.out.println(tom.firstName+" "+tom.lastName+" "+tom.eligibleForCreditCard);
		
		henry.firstName="Henry";
		henry.lastName="Hill";
		henry.age=31;
		henry.accountBalance=19000;
		henry.testEligibilityForCreditCard();
		System.out.println(henry.firstName+" "+henry.lastName+" "+henry.eligibleForCreditCard);
		
		sarah.firstName="Sarah";
		sarah.lastName="Smile";
		sarah.age=41;
		sarah.accountBalance=30000;
		sarah.testEligibilityForCreditCard();
		System.out.println(sarah.firstName+" "+sarah.lastName+" "+sarah.eligibleForCreditCard);
	}
}
