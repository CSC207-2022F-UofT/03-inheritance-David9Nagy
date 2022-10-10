
public class HandBag extends Bag{


    public HandBag(String color, int capacity) {

        super(color, capacity);
    }


    @Override
    public void enhance() {
        super.increaseCapacity(1);
    }
}