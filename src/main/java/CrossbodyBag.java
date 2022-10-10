
public class CrossbodyBag extends Bag{

    private final int  numberOfStraps;

    public CrossbodyBag (String color, int capacity, int numStraps){
        super(color, capacity);
        this.numberOfStraps = numStraps;
    }

    public int getNumberOfStraps(){
        return this.numberOfStraps;
    }

    @Override
    public void enhance() {
        super.increaseCapacity(2);
    }

    @Override
    public String toString() {
        int numStraps = this.numberOfStraps;
        int numContents = this.getNumberOfContents();
        int capacity = this.getCapacity();

        String[] s = super.toString().split(" ");

        return String.format("%s Crossbody Bag with %s straps (%s / %s)", s[0], numStraps, numContents, capacity);
    }
}