
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (Saniyah Bullock)
 * @version (0.2)
 */
public class PowerPill
{
    // static integer field
    public static final int DEFAULT_POWER = 10; // adds a static integer field called DEFAULT_POWER = 10

    // instance variables
    private int power; // creates a variable power with type int
    private String name; // creates a variable name with type String

    // constructors

    /**
     \* Initializes this power pill to a default power value
     \* and sets the name of the pill to name.
     \* @PowerPill name the name of this power pill.
     */
    public PowerPill(String name) // creates a value constructor that takes name as a parameter with type String
    {
        this.name = name;
    }

    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * name the name of this power pill
     * power the power level of this power pill.
     */
    public PowerPill(String name, int power) // creates a value constructor which takes two parameters, one as a name for the string, and the second for the power
    {
        this.name = name ;
        this.power = power;
    }

    // accessor methods
    public int getPower() // creates a method to get/return the power of the pill (int)
    {
        return power;
    }
    public String getName() // creates a method to get/return the name of the pill (string)
    {
        return name;
    }

    // mutator methods
    public int setPower(int power) // creates a method to set/change the value of the power, and then return it (int)
    {
        this.power = power;
        return power;
    }
    public String setName(String name) // creates a method to set/change the name of the pill, and then return it (String)
    {
        this.name = name;
        return name;
    }

    // toString method
    public String toString()
    {
        return "PowerPill " + name + " = " + power; // creates a method to return the values in form "PowerPill name = power"
    }

}