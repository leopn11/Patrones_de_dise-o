package singleton;

public class Singleton {
private static Singleton singleton;

int accountant;

private Singleton() {}
public static Singleton getInstance() {
    if (singleton == null) {
       singleton = new Singleton();
    }
    return singleton;
}
    public int getAccountant() {return accountant;}

    public void setAccountant(int accountant){
    this.accountant = accountant;
    }
}
