class BankAccountBase {

    static int autoId = 5000;

    int accNo;
    String name, type;
    double balance;
    int day, month, year;

    BankAccountBase(String name, String type, double balance,
                    int d, int m, int y) {

        this.accNo = ++autoId;
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.day = d;
        this.month = m;
        this.year = y;

        System.out.println("Account Created. Acc No: " + accNo);
    }

    void checkBalance() {
        System.out.println("Current Balance: Rs " + balance);
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited Rs " + amt);
    }

    void withdraw(double amt) {
        System.out.println("Base withdraw method");
    }
}

// Regular Account
class RegularAccount extends BankAccountBase {

    RegularAccount(String name, double bal,
                   int d, int m, int y) {
        super(name, "Regular", bal, d, m, y);
    }

    @Override
    void withdraw(double amt) {

        if (amt <= 100000) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt + " (No penalty)");
        }
        else if (amt <= 500000) {
            double penalty = amt * 0.0005;
            balance -= (amt + penalty);
            System.out.println("Withdrawn Rs " + amt +
                    " with penalty Rs " + penalty);
        }
        else {
            System.out.println("Limit exceeded for Regular Account");
        }
    }
}

// Elite Account
class EliteAccount extends BankAccountBase {

    EliteAccount(String name, double bal,
                 int d, int m, int y) {
        super(name, "Elite", bal, d, m, y);
    }

    @Override
    void withdraw(double amt) {

        if (amt <= 1000000) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt + " (Elite Account)");
        }
        else {
            System.out.println("Limit exceeded for Elite Account");
        }
    }
}

class BankTest {
    public static void main(String[] args) {

        BankAccountBase a1 = new RegularAccount("Arnab", 800000, 24, 2, 2026);
        BankAccountBase a2 = new EliteAccount("Rahul", 1500000, 24, 2, 2026);

        System.out.println("\n--- Regular Account ---");
        a1.withdraw(200000);
        a1.checkBalance();

        System.out.println("\n--- Elite Account ---");
        a2.withdraw(900000);
        a2.checkBalance();
    }
}