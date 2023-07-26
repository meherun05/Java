class Employee {
    private int eId;
    private String eName;
    private String eBranch;
    private String eDesignation;

    // create an constructor
    Employee(int eId, String eName, String eBranch, String eDesignation) {
        this.eId = eId;
        this.eName = eName;
        this.eBranch = eBranch;
        this.eDesignation = eDesignation;
    }

    // return the value in get method
    public int geteId() {
        return eId;
    }

    public String geteName() {
        return eName;
    }

    public String geteBranch() {
        return eBranch;
    }

    public String geteDesignation() {
        return eDesignation;
    }

    // override toString
    public String toString() {
        return eId + " " + eName + " " + " " + eBranch + " " + eDesignation;
    }
}