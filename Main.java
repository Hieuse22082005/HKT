// Lớp BankAccount đại diện cho một tài khoản ngân hàng
class BankAccount {
    private String owner;
    private double balance;

    // Constructor để khởi tạo tài khoản
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    // Phương thức gửi tiền
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(owner + " vừa nạp: " + amount + " VND");
        }
    }

    // Phương thức rút tiền
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(owner + " vừa rút: " + amount + " VND");
        } else {
            System.out.println("Giao dịch thất bại: Số dư không đủ hoặc số tiền không hợp lệ.");
        }
    }

    // Hiển thị thông tin tài khoản
    public void displayInfo() {
        System.out.println("Chủ tài khoản: " + owner + " | Số dư hiện tại: " + balance + " VND");
    }
}

// Lớp chính để chạy chương trình
public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng tài khoản mới
        BankAccount myAccount = new BankAccount("Gemini User", 1000000);

        myAccount.displayInfo();
        myAccount.deposit(500000);   // Nạp thêm tiền
        myAccount.withdraw(200000);  // Rút tiền
        myAccount.displayInfo();     // Kiểm tra lại số dư
    }
}

#chao 1 
#chao1
    #chao3
