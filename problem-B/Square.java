class Square extends Rectangle {
    double side;
    public Square() {
        super();
    }

    public Square(double side) {
        this.side =side;
        this.color = "black";
        this.filled = true;
        this.width=6.6;
        this.length=6.6;
    }
    public double getSide() {
        return side;
    }
    public void setWidth(double side) {
    }
    public void setLength(double side) {
    }
    public String toString() {
        return "Square[Rectangle[Shape[color= " + color + ", filled= " + filled + "], width= " + width + ", length= "+length+"]]";
    }
}
