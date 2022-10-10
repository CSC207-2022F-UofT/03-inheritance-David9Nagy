

public abstract class Bag {

    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;




    public Bag(String bagColor, int bagCapacity) {
        this.color = bagColor;
        this.numberOfContents = 0;
        this.capacity = bagCapacity;
        this.contents = new String[0];
    }





    public String getColor() {
        return this.color;
    }

    public int getNumberOfContents() {
        return this.numberOfContents;
    }

    public int getCapacity() {
        return this.capacity;
    }




    public void setColor(String newColor) {
        this.color = newColor;
    }





    public boolean addItem(String item) {
        if (this.numberOfContents < this.capacity) {
            // Array of old contents + <item>
            String[] newContents = new String[this.contents.length + 1];
            System.arraycopy(this.contents, 0, newContents, 0, this.contents.length);
            newContents[this.contents.length] = item;

            this.contents = newContents;
            this.numberOfContents += 1;
            return true;
        }
        return false;
    }





    public String popItem() {
        if (this.contents.length == 0) {
            return null;
        } else {
            String item = this.contents[this.contents.length - 1];
            String[] newContents = new String[this.contents.length - 1];
            System.arraycopy(this.contents, 0, newContents, 0, this.contents.length - 1);

            this.contents = newContents;
            this.numberOfContents -= 1;
            return item;
        }
    }





    public void increaseCapacity(int n) {
        // TODO: Implement this method.
        this.capacity += n;
    }


    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }


    public abstract void enhance();
}