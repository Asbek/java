
package car;

/**
 *
 * @author name
 */
public class Station {
private String name;
private String city;
//default constructor
public Station(){
name = null;
city = null;
}
//constructor
public Station(String n, String c) {
name = n;
city = c;
}
//get and set methods
public String getName() {
return name;
}
public void setName(String n) {
name = n;
}
public String getCity() {
return city;
}
public void setCity(String c) {
city = c;
}
//toString method
public String toString() {
return "Station name: " + name +
"\nCity: " + city;
}
}
