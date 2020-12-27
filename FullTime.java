class FullTime extends GameTester{
    public FullTime(String n){
        super(n, true);
    }

    public double Determine_fee(int hours){
        return 3000.0;
    }
}