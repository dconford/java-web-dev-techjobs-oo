package org.launchcode.techjobs_oo;

import java.lang.reflect.Field;

import static org.junit.Assert.assertNotEquals;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    // Code a constructor to initialize the id field with a unique value. This constructor should take no parameters

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location,PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;

        Job job = (Job) o;

        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }




    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


//String message = (str == null) ? "" : str.substring(0, 10);
//System.out.println("My string is: " + ((string == null) ? "" : string));
//    @Override
//    public String toString() {
//
//        StringBuffer sb = new StringBuffer();
//
//        Field[] fields = getClass().getDeclaredFields(); //Get all fields incl. private ones
//
//        for (Field field : fields) {
//
//            try {
//
//                field.setAccessible(true);
//                String key = field.getName();
//                String value;
//
//                try {
//                    value = (String) field.get(this);
//                } catch (ClassCastException e) {
//                    value = "";
//                }
//
//                sb.append(key).append(": ").append(value).append("\n");
//
//            } catch (IllegalArgumentException e) {
//                e.printStackTrace();
//            } catch (SecurityException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//
//        }
//        return sb.toString();
//    }
    @Override
    public String toString() {
        return
                "\nID: " + getId() + "\n" +
                        "Name: " + getName() + "\n" +
                        "Employer: " + (getEmployer().getValue().equals("") || getEmployer().getValue().equals(" ") ? "Data not available" : getEmployer()) + "\n" +
                        "Location: " + getLocation() + "\n" +
                        "Position Type: " + getPositionType() + "\n" +
                        "Core Competency: " + getCoreCompetency() + "\n";
    }

////        ID:  _______
////        Name: _______
////        Employer: _______
////        Location: _______
////        Position Type: _______
////        Core Competency: _______
//
//
//   }
}
