package mywork.encapsulation.ex3;
public class TestIDGenerator{
    public static void main(String args[]){
        IDGenerator id = new IDGenerator("Emp", 100);
        for(int i=0; i < 10; i++)
            System.out.println(id.issueNext());
    }
}