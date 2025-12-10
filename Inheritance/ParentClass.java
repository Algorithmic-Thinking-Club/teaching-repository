package Inheritance;

public class ParentClass {

    String initializeArgument;
    public ParentClass(String parentArgument){
        initializeArgument=parentArgument;
    }
    public void parentMethod(){
        System.out.println(initializeArgument);
    }
    
}
