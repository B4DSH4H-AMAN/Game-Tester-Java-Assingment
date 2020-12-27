abstract class GameTester{
    private String name;
    private boolean status;
    public GameTester(String n, boolean s){
        name = n;
        status = s;
    }
    public abstract double Determine_fee(int hours);
}


