package car;

/**
 *
 * @author name
 */
public class Bus extends Car {

private String transportFor;
private int numberSits;

public Bus () { 
super (null,0,null);
transportFor = null;
numberSits = 0;
}
public Bus (String gN, int age, Station si, String sP, int sC) {
super (gN, age, si);
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
