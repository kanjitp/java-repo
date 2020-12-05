public class myAccount {
    public static void main(String[] args) {
        Account myAccount = new Account("Kan's account", 100.00);
        Account mySwissAccount = new Account("Kan's account in Switzerland", 1000000.00);

        System.out.println("-- Initial State");
        System.out.println(myAccount.toString());
        System.out.println(mySwissAccount.toString());

        myAccount.withdraw(20);
        System.out.println("The balance of Kan's account is now: " + myAccount.balance());
        mySwissAccount.deposit(100);
        System.out.println("The balance of Kan's Swiss account is now: " + mySwissAccount.balance());

        System.out.println("-- End state");
        System.out.println(myAccount.toString());
        System.out.println(mySwissAccount.toString());
    }

    public static class Account {

        private String accountName;
        private double cash;

        public Account() {
            this.accountName = null;
            this.cash = 0;
        }

        public Account(double amount) {
            this.accountName = null;
            this.cash = amount;
        }

        public Account(String nameInput, double amount) {
            this.accountName = nameInput;
            this.cash = amount;
        }

        public String name() {
            return this.accountName;
        }

        public double balance() {
            return this.cash;
        }

        public void deposit(double amount) {
            this.cash += amount;
        }

        public void withdraw(double amount) {
            this.cash -= amount;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Acc Name : " + this.name()+ ", balance: " + this.balance(); 
        }

    }

}
