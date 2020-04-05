package Grazioso;

// Noah Pohl
// Monkey.java

public class Monkey extends RescueAnimal {

    // Instance variables specific to the Monkey Class

    private int tailLength;
    private float height;
    private int bodyLength;
    private String species;
    private int torsoMeasurement;
    private int skullMeasurement;
    private int neckMeasurement;

    // Accessor methods for Monkey Class


    public int getTailLength() {
        return tailLength;
    }

    public float getHeight() {
        return height;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public String getSpecies() {
        return species;
    }

    public int getTorsoMeasurement() {
        return torsoMeasurement;
    }

    public int getSkullMeasurement() {
        return skullMeasurement;
    }

    public int getNeckMeasurement() {
        return neckMeasurement;
    }


    // Mutator methods for Monkey Class

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setTorsoMeasurement(int torsoMeasurement) {
        this.torsoMeasurement = torsoMeasurement;
    }

    public void setSkullMeasurement(int skullMeasurement) {
        this.skullMeasurement = skullMeasurement;
    }

    public void setNeckMeasurement(int neckMeasurement) {
        this.neckMeasurement = neckMeasurement;
    }


}
