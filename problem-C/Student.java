class Student extends Person {
    String program;
    int year;
    double fee;

    public Student(){
        super();
    }

    public Student(String name, String address, String program, int year, double fee) {
        this.name=name;
        this.address=address;
        this.program=program;
        this.year=year;
        this.fee=fee;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram() {
        this.program=program;
    }
    public int getYear() {
        return year;
    }
    public void setYear() {
        this.year=year;
    }
    public double getFee() {
        return fee;
    }
    public void setFee() {
        this.fee=fee;
    }
    public String toString() {
        return "Student[Person[name="+name+",address="+address+ "],program="+program+",year="+year+",fee="+fee+"]";
    }
}
