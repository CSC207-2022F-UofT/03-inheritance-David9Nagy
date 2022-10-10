
class BagMain {

    public static void enhanceBags(Bag[] bags, boolean double_enhance_handbags) {
        for (Bag bag: bags){
            bag.enhance();
            if ((bag instanceof HandBag) && double_enhance_handbags){
                bag.enhance();
            }
        }
    }


    public static int countCrossbodyStraps(Bag[] bags) {
        int totalStraps = 0;
        for (Bag bag: bags){
            if (bag instanceof CrossbodyBag) {
                totalStraps += ((CrossbodyBag) bag).getNumberOfStraps();
            }
        }
        return totalStraps;
    }
}