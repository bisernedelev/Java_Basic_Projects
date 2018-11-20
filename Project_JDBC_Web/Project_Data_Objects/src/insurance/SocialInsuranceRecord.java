package insurance;

public class SocialInsuranceRecord {
    private final int _year;
    private final int _month;
    private final double _amount;

    public SocialInsuranceRecord(int year, int month, double amount) {
        this._year = year;
        this._month = month;
        this._amount = amount;
    }
    
    public double getAmount(){
        return _amount;
    }

    public int getMonth() {
        return _month;
    }

    public int getYear() {
        return _year;
    }
    
}
