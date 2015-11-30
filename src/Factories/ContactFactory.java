package Factories;

import Enums.Units;
import Models.Contact;
import Models.Unit;

import java.util.ArrayList;
import java.util.EnumSet;

/**
 * Created by jonathon on 11/28/15.
 */
public class ContactFactory {
    EnumSet<Units> units;
    String name;
    String pNumber;
    String email;

    public ContactFactory(EnumSet<Units> units, String name, String pNumber, String email) {
        this.units = units;
        this.name = name;
        this.pNumber = pNumber;
        this.email = email;
    }
    public Contact getContact(){

        return  formContact();

    }
    private Contact formContact(){
        Contact c = new Contact(this.name,this.pNumber,this.email);
        ArrayList<Unit> unitsArray = new ArrayList<Unit>();
        for (Units u : units) {
            UnitFactory uFac = new UnitFactory(u);
            unitsArray.add(uFac.getUnit());
        }
        c.setUnits(unitsArray);

        return c;

    }
}
