package Models;

/**
 * Created by jonathon on 11/28/15.
 */
public class Person {
    String name;
    String pNumber;
    String email;
    String address;

    public Person(String name, String pNumber, String email, String address) {
        this.name = name;
        this.pNumber = pNumber;
        this.email = email;
        this.address = address;
    }

    public Person(String name, String pNumber, String email) {
        this.name = name;
        this.pNumber = pNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getpNumber() {
        return pNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
