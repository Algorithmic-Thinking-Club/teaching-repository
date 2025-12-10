public class ClassName {
    String initializingVariable;
    int otherVariable=42;
    //This is the constructor
    public ClassName(String classObjectInput){
        initializingVariable=classObjectInput;
        System.out.println(otherVariable);
    }

    public void ClassMethod(){
        System.out.println("Method Has Been Ran");
    }
    public String returnMethod(){
        return initializingVariable;
    }
    
}
