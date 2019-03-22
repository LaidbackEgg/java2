package ShoeExample;

public class Shoe {

    public int shoeSize;

    public Shoe() {
    } // default constructor

    public Shoe(int sizeOfShoe) {
        shoeSize = sizeOfShoe;
    } // alternative constructor

    public String toString() {
        return "Shoe Size: " + shoeSize;
    }//toString

}//class
