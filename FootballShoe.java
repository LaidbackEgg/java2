package ShoeExample;

import java.util.Scanner;

public class FootballShoe extends Shoe {
    String colour;
    String make;

    public FootballShoe(int sizeOfShoe, String makeOfShoe) {
        super(sizeOfShoe);
        make = makeOfShoe;
    } // constructor

    protected void setColour(String colourOfShoe) {
        colour = colourOfShoe;
    }//setcolour

    protected String getColour() {
        return colour;
    }

    public String toString() {
        return super.toString() +
                "\nShoe Colour: " + colour +
                "\nShow Make: " + make;
    }//toString

}//class
