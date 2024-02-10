public class Patient {

    String fname;
    String lname;
    String address;
    double tcost;

    public Patient(String fname, String lname, String address) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
    }

    public Patient(String fname, String lname, String address, double tcost) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.tcost = tcost;
    }

    public void setFname(String f) {
        fname = f;
    }

    public void setLname(String l) {
        lname = l;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setTcost(double c) {
        tcost = c;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getAddress() {
        return address;
    }

    public double getTcost() {
        return tcost;
    }

    public void addProcedureCost(double c) {
        tcost += c;
    }

    public void payProcedureCost (double c) {
        tcost -= c;
    }

    public void displayPatient(Patient p) {
        System.out.printf("Patient name: %s %s\n", p.fname, p.lname);
        System.out.printf("Address: %s\n", p.address);
        System.out.printf("Total Cost: $%,.2f\n", p.tcost);
    }
}