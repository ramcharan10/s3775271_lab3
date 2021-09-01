// first question singleton

public class SuperVip extends Customer {

    static SuperVip instance = null;

    public SuperVip(String name, String address, String iD, String phone) {
        super(name, address, iD, phone);
    }

    public static SuperVip getInstance() {
        if (instance == null) {
            instance = new SuperVip("Super VIP User", "asdasda", "1000", "2313132131");
        }
        return instance;
    }
}