package car;

/**
 *
 * @author name
 */
import java.util.*;
import javax.swing.JOptionPane;
/**
* Scenario Stage 2.
**/
public class UserInterface {
    
public void begin() {
// create the Person ArrayList to store the data while the program is running
ArrayList<Car> humen = new ArrayList<Car>();
// display the menu and process Employee & Student data
boolean finished = false;
while (!finished) { // a loop to allow the program to continue until the user chooses to exit program
int selection = showMenu ();
switch (selection) {
case 1:// add an Staff
humen.add (addBus());
break;

case 2:// add a Customer
humen.add (addTram ());
break;
case 3:// display the Human data
JOptionPane.showMessageDialog (null, "Displaying the person information ...", "Person List", JOptionPane.PLAIN_MESSAGE);
for (int i = 0; i < humen.size(); i++) {
JOptionPane.showMessageDialog (null, humen.get(i), "Person Details", JOptionPane.PLAIN_MESSAGE);
}
JOptionPane.showMessageDialog (null, "There are "+humen.size()+" record(s) in the list", "Total records", JOptionPane.PLAIN_MESSAGE);
break;
case 4: finished = true; 
break;
default: JOptionPane.showMessageDialog (null, "\n** Invalid Selection **\n", "ERROR", JOptionPane.ERROR_MESSAGE);
} // end switch
} // end while loop
} // end begin()
public int showMenu() {
int selection = 0;
String stringSelection = JOptionPane.showInputDialog (
"\t\t\t Choose option below and click OK button: \n\n" +
"1. Add a new Bus\n" +
"2. Add a new Tram\n" +
"3. Display all Details\n" +
"4. Quit\n\n");
selection = Integer.parseInt (stringSelection.trim());
return selection;
} // end showMenu()

public Tram addTram () {
String gName = JOptionPane.showInputDialog (null, "\nWhat is/are the Tram's name(s)? ").trim();
int age = 0;
String stringValidAge = JOptionPane.showInputDialog (null, "What is " + gName + "'s year? (whole years only) ");
double doubleAge = Double.parseDouble (stringValidAge); // allow for decimal input ...
age = (int) doubleAge; // ... and truncate it!
String ePos = null;
do { // restrict employee type to demonstrate String validation
ePos = JOptionPane.showInputDialog (null, "How tram is " + gName + "'s use for (School, Company, Government)? ".trim());
if (!ePos.equals ("School") && !ePos.equals ("Company") && !ePos.equals ("Government")) {
JOptionPane.showMessageDialog (null, "\n** Invalid Selection **\nOnly must be School, Company, Government",
"ERROR",
JOptionPane.ERROR_MESSAGE);
}
} while (!ePos.equals ("School") && !ePos.equals ("Company") && !ePos.equals ("Government"));

int nYE;
do { // make sure that number of years employed is greater than zero
String stringNYE = JOptionPane.showInputDialog (null, "How many sits has " + gName);
nYE = (int) Double.parseDouble(stringNYE);
if (nYE < 0) {
JOptionPane.showMessageDialog (null, "\n** Value must be zero or more **\n", "ERROR", JOptionPane.ERROR_MESSAGE);
}
} while (nYE < 0);
String or = null;
//System.out.print("Name of organization involved: ");
or = JOptionPane.showInputDialog (null, "Station name: ? ");
String city = JOptionPane.showInputDialog (null, "City where "+or+" is ? ");
//create an object of EducationalInstitution
Station com = new Station(or,city);
//create an object of an Employee
Tram t = new Tram (gName, age, com, ePos, (int) nYE);
//return the employee object
JOptionPane.showMessageDialog (null, "Thank you - tram added to the list", "Tram added", JOptionPane.PLAIN_MESSAGE);
return t;
}

public Bus addBus() {
String gName = JOptionPane.showInputDialog (null, "\nWhat is/are the Bus's name(s)? ").trim();
int age = 0;
String stringValidAge = JOptionPane.showInputDialog (null, "What is " + gName + "'s year? (whole years only) ");
double doubleAge = Double.parseDouble (stringValidAge); // allow for decimal input ...
age = (int) doubleAge; // ... and truncate it!
String ePos = null;
do { // restrict employee type to demonstrate String validation
ePos = JOptionPane.showInputDialog (null, "How bus is " + gName + "'s use for (School, Company, Government)? ".trim());
if (!ePos.equals ("School") && !ePos.equals ("Company") && !ePos.equals ("Government")) {
JOptionPane.showMessageDialog (null, "\n** Invalid Selection **\nOnly must be School, Company, Government",
"ERROR",
JOptionPane.ERROR_MESSAGE);
}
} while (!ePos.equals ("School") && !ePos.equals ("Company") && !ePos.equals ("Government"));

int nYE;
do { // make sure that number of years employed is greater than zero
String stringNYE = JOptionPane.showInputDialog (null, "How many sits has " + gName);
nYE = (int) Double.parseDouble(stringNYE);
if (nYE < 0) {
JOptionPane.showMessageDialog (null, "\n** Value must be zero or more **\n", "ERROR", JOptionPane.ERROR_MESSAGE);
}
} while (nYE < 0);
String or = null;
//System.out.print("Name of organization involved: ");
or = JOptionPane.showInputDialog (null, "Station name: ? ");
String city = JOptionPane.showInputDialog (null, "City where "+or+" is ? ");
//create an object of EducationalInstitution
Station com = new Station(or,city);
//create an object of an Employee
Bus e = new Bus (gName, age, com, ePos, (int) nYE);
//return the employee object
JOptionPane.showMessageDialog (null, "Thank you - tram added to the list", "Bus added", JOptionPane.PLAIN_MESSAGE);
return e;
}
} // end UserInterface class
