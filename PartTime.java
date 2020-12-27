class PartTime extends GameTester{
    public PartTime(String n){
        super(n, false);
    }

    public double Determine_fee(int hours){
        return hours*20.0;
    }
}