class Staff extends Person {
    String school;
    double pay;

    public Staff(String name, String address, String school, double pay) {
        this.name=name;
        this.address=address;
        this.school=school;
        this.pay=pay;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool() {
        this.school=school;
    }
    public double getPay() {
        return pay;
    }
    public void setPay() {
        this.pay=pay;
    }
    public String toString() {
        return "Staff[Person[name="+name+",address="+address+"],school="+school+" pay="+pay+"]";
    }
}
