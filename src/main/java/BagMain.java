
class BagMain {

    public static void enhanceBags(Bag[] bags, boolean double_enhance_handbags) {
        // TODO: Implement this.
        for (Bag bag : bags) {
            bag.enhance();
            if (double_enhance_handbags && bag instanceof HandBag) {
                bag.enhance();
            }
        }
    }


    public static int countCrossbodyStraps(Bag[] bags) {
        // TODO: Implement this.
        int totalStraps = 0;
        for (Bag bag : bags) {
            if (bag instanceof CrossbodyBag) {
                totalStraps += ((CrossbodyBag) bag).getNumberOfStraps();
            }
        }
        return totalStraps;
    }
}