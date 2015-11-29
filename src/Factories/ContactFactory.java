package Factories;

import Enums.Units;
import Models.Contact;

/**
 * Created by jonathon on 11/28/15.
 */
public class ContactFactory {
    Units unit;
    String name;
    String pNumber;
    String email;

    public ContactFactory(Units unit, String name, String pNumber, String email) {
        this.unit = unit;
        this.name = name;
        this.pNumber = pNumber;
        this.email = email;
    }
    public Contact getContact(){
        return  null;

    }
    private Contact formContact(){
        return null;

    }
}
