package mywork.encapsulation.ex4;

import mywork.encapsulation.ex2.SimpleDate;
import mywork.encapsulation.ex3.IDGenerator;

public class Employee {
    // instance data
    private String name;
    private String id;
    private SimpleDate hireDate;

    // static data
    private static IDGenerator idg
        = new IDGenerator("emp", 1);

    // constructors
    public Employee (String name, SimpleDate hd){
        this.name = name;
        this.hireDate = hd;
        this.id = idg.issueNext();
    }

    // methods
    public String getName() {
        return this.name;
    }

    public String getID() {
        return this.id;
    }

    public SimpleDate getHireDate() {
        return this.hireDate;
    }

    public String toString() {
        return new StringBuilder(40).append(this.id)
        		.append(": ").append(this.name)
        		.append(", Hired: ").append(this.hireDate)
        		.toString();
    }
}