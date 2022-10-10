import java.util.*;


public abstract class Bag {

    private String color;
    private int numberOfContents;
    private int capacity;
    private ArrayList<String> contents;


    public Bag (String colorOfBag, int capacity){
        this.color = colorOfBag;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new ArrayList<>();
    }


    public String getColor(){
        return this.color;
    }

    public int getNumberOfContents(){
        return this.numberOfContents;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void setColor(String newColour){
        this.color = newColour;
    }




    public boolean addItem(String newItem){
        if (this.numberOfContents < capacity){
            this.contents.add(newItem);
            this.numberOfContents += 1;
            return true;
        }
        return false;
    }


    public String popItem(){
        if (this.numberOfContents != 0){
            this.numberOfContents -= 1;
            String itemRemoved = this.contents.get(numberOfContents);
            this.contents.remove(this.numberOfContents);
            return itemRemoved;
        }
        return null;
    }






    public void increaseCapacity(int n) {
        this.capacity += n;

    }


    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }


    public abstract void enhance();
}