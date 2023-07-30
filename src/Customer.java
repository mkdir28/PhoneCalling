public class Customer {
    private int id;
    private static int currentID = 0;
    private int longestCaller;
    private int longestCallee;
    private int largenum;
    private int recivedcallfromcustomer;
    private int largenumcalls;
    private int largerrecivednumcalls;
    private int smallnumber;
    private int smallrecivednumcalls;

    public Customer() {
        this.id = currentID;
        currentID++;
    }

    public int getLongestCallee() {
        return longestCallee;
    }

    public void setLongestCallee(int longestCallee) {
        this.longestCallee = longestCallee;
    }

    public int getLongestCaller() {
        return longestCaller;
    }

    public void setLongestCaller(int longestCaller) {
        this.longestCaller = longestCaller;
    }
    public int getLargenum() {
        return largenum;
    }

    public void setLargenum(int largenum) {
        this.largenum = largenum;
    }

    public int getLargenumcalls() {
        return largenumcalls;
    }

    public void setLargenumcalls(int largenumcalls) {
        this.largenumcalls = largenumcalls;
    }

    public int getLargerrecivednumcalls() {
        return largerrecivednumcalls;
    }

    public void setLargerrecivednumcalls(int largerrecivednumcalls) {
        this.largerrecivednumcalls = largerrecivednumcalls;
    }

    public int getRecivedcallfromcustomer() {
        return recivedcallfromcustomer;
    }

    public void setRecivedcallfromcustomer(int recivedcallfromcustomer) {
        this.recivedcallfromcustomer = recivedcallfromcustomer;
    }

    public int getSmallrecivednumcalls() {
        return smallrecivednumcalls;
    }

    public void setSmallrecivednumcalls(int smallrecivednumcalls) {
        this.smallrecivednumcalls = smallrecivednumcalls;
    }

    public int getSmallnumber() {
        return smallnumber;
    }

    public void setSmallnumber(int smallnumber) {
        this.smallnumber = smallnumber;
    }

    public int getId() {
        return id;
    }

    public static void ourCustomers() {
        for (int i = 0; i < 500; i++)
            CallingList.getCustomers().add(new Customer());
    }

    @Override
    public String toString() {
        return "id = " + id;
    }
}
