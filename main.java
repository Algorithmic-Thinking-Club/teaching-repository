import Inheritance.*;

public class main{
    public static void main(String[] args) {
        ClassName objectName=new ClassName("Return Method Output");
        GrandChildClass otherObjectName= new GrandChildClass();
        System.out.println(objectName.returnMethod());
        otherObjectName.parentMethod();
        otherObjectName.childMethod();
        

}
}
