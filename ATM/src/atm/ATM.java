package atm;
public class ATM {  
    static BankAccount array[] = new BankAccount[3];
    static int x[] = new int[1];
    public static void main(String[] args) {  
        // use these objects for testing
    array[0] = new BankAccount("Iraqy","5428",1000);
    array[1] = new BankAccount("Alaa","1111",2000);
    array[2] = new BankAccount("Ahmed","2222",3000);
    Frame1 frame = new Frame1();
    frame.show();
    } 
    
}
