/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Асылбек
 */
public abstract class Car{

protected int year;
protected String Name;
protected Station com;

Car () { 
year = 0;
Name = null;
com = null;
}
Car (String gName, int howOld, Station or) {
year = howOld;
Name = gName;
com = or;
}

public void setName (String gName) {
Name = gName;
}
public void setYear (int howOld) {
year = howOld;
}
public void setOrg(Station eI) {
this.com = eI;
}

public String getName () {
return Name;
}
public int getYear () {
return year;
}
public Station getOrg() {
return com;
}

public String toString () {
return "\n Name: " + Name +
"\nYear: " + year+
"\n"+com.toString();
}
}
