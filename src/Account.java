public class Account {
    int id;
    String name;
    int balance;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    void display(){
        System.out.println("STK:"+ id +", Ten Tk: "+ name + ", so du:"+ balance);
    }
    void deposit(int amount){
        this.balance += amount;
        System.out.println("So du tai khoan hien tai cua " +this.name+" la: "+this.balance);
    }
    void withdraw(int amount){
        if( amount <= this.balance){
            this.balance -= amount;
            System.out.println("So du tai khoan hien tai cua " +this.name+" la: "+this.balance);
        }
        System.out.println("So du trong tai khoan cua "+ this.name+" khong du");
    }
    public static void main(String[]args){
        Account tk1 = new Account(123,"Hoang Thang");
        Account tk2 = new Account( 123,"Trung phong",10000);
        tk1.display();
        tk2.display();
        tk1.deposit(500000);
        tk2.withdraw(2000000);
        tk1.withdraw(10000);
    }
}