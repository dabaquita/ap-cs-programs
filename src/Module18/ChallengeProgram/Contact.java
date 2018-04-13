package Module18.ChallengeProgram;

/**
 * Defines a contact object to hold contact
 * information on people.
 *
 * @author  Denielle Kirk Abaquita
 * @version 10 April 2018
 */

public class Contact {

    // Variables
    String name, relation, birthday, email;
    String phoneNumber;

    public Contact() {}

    /**
     * Constructor that initiliazes all variables
     */
    public Contact(String name, String relation, String birthday, String email,
                        String phoneNumber)
    {
        this.name = name;
        this.relation = relation;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getRelation() {
        return relation;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-10s %-23s %s", name, relation,
                                birthday, email, phoneNumber);
    }
}
