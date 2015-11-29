package Models;

import java.util.ArrayList;

/**
 * Created by jonathon on 11/28/15.
 */
public class Contact extends Person{
    ArrayList<Unit> units;

    public Contact(String name, String pNumber, String email, String address) {
        super(name, pNumber, email, address);
    }

    public Contact(String name, String pNumber, String email) {
        super(name, pNumber, email);
    }

    public void setUnits(ArrayList<Unit> units) {
        this.units = units;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }
}
