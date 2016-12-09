package mywork.arrays.ex3;
public class Assets{
    // instance variables
    private String names[];
    private double values[];
    private int size, capacity;

    // constructor
    public Assets(int maxSize){
        this.names = new String[maxSize];
        this.values = new double[maxSize];
        this.size = 0;
        this.capacity = maxSize;
    }

    // methods

    // add an item and its value to this object
    public void addElement(String item, double itemVal){
    	if (size < capacity) {
    		this.names[size] = item;
        	this.values[size++] = itemVal;
    	} else {
    		System.out.println("Failed to add, at capacity!");
    	}
    }

    // number of items currently stored
    public int size(){
        return this.size;
    }

    // number of items capable of storing
    public int capacity(){
        return this.capacity;
    }

    // total dollar value of all assets being tracked
    public double getTotalValue(){
    	double totValue = 0.0;
    	for (int i=0;i<this.size;i++) {
    		totValue += this.values[i];
    	}
        return totValue;
    }

    // name and value of a particular item
    public String getItem(int whichItem){
    	if (whichItem < this.size)
    		return String.format("%-12s",this.names[whichItem]) + " " 
    			+ String.format("%8s", String.format("%.2f", this.values[whichItem]));
    	else
    		return "Invalid index: " + whichItem + ", current size is: " + this.size;
    }

    // table of item names and values
    public String toString(){
        StringBuilder sb = new StringBuilder(this.size * 32);
        for (int i=0;i<this.size;i++) {
        	sb.append(this.getItem(i)).append('\n');
        }
        return sb.toString();
    }
}