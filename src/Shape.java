public abstract class Shape implements Shrinkable{
    private int sides;

    public Shape(int sides){
        this.sides = sides;
    }
    public int getSides(){
        return this.sides;
    }
    public abstract double divineArea();

    public int foobar(){
        return Integer.MAX_VALUE;
    }

    public String toString(){
        return "Shape with " + this.sides + " sides";
    }

    public void shrink(double scale){
        this.sides/=(scale);
    }
}
