package car;

/**
 *
 * @author name
 */
public class Tram extends Car{

private String transportFor;
private int numberSits;

public Tram () { 
super (null,0,null);
transportFor = null;
numberSits = 0;
}
public Tram (String gN, int age, Station ei, String sP, int sC) {
super (gN, age, ei);
transportFor = sP;
numberSits = sC;
}

public String getTransportFor() {
return transportFor;
}

public int getNumberSits() {
return numberSits;
}

public void setTransportFor (String eP) {
transportFor = eP;
}

public void setNumberSits (int eP) {
numberSits = eP;
}

public String toString () {
return super.toString() + "\nTransport is used for: " + getTransportFor() +
"\n Number of sits: " + getNumberSits();
}
} 
