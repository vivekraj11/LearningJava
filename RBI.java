package MTsir;

abstract class RBI {
	abstract void accHolderName();
	abstract void money();
}
class SBI extends RBI{
	void accHolderName() {
		System.out.println("Account Number is : 5505 2341 0098");
	}
	void money(){
		System.out.println("Account Balance is : 1,05,409");
	}
}
	class ICICI extends RBI{
		void accHolderName() {
			System.out.println("Account Number is : 5509 2341 0890");
		}
		void money(){
			System.out.println("Account Balance is : 15,409");
		}
	}


