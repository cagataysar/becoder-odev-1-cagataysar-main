public class Phone extends Product{

    public Integer phoneNumber;

    public Phone (Integer id, String name, Double price, Integer phoneNumber) {
        super(id, name, price);
        this.phoneNumber = phoneNumber;
    }

    public Integer getPhoneNumber () {
        return phoneNumber;
    }
}
