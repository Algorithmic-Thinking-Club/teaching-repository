package Inheritance;

public class ChildClass extends ParentClass{
    String initializeVariable;
    public ChildClass(String childArgument){
        super("Parent Fufillment");
        initializeVariable=childArgument;
    }
    public void childMethod(){
        System.out.println(initializeVariable);
    }
    
}
