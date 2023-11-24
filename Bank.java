class Bank {
    int initialBalance = 1000;

    void debit(int amt) {
        initialBalance = initialBalance - amt;
    }

    void credit(int amt) {
        initialBalance = initialBalance + amt;
    }

    void print() {
        System.out.println("Current Balance: " + initialBalance);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.debit(100);
        bank.credit(200);
        bank.print();
    }
}