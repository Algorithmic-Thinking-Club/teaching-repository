package folder;
public class ClassName {
   

    //This is the constructor
    public ClassName(){

    

    }
    public static enum enumName{
        Constant1,
        Constant2,
        Constant3,
        None;
    }

    public enum otherEnumName{
        OtherConstant1,
        OtherConstant2,
        OtherConstant3,
        None;
    }
    
    public static final void ClassMethod(enumName objectEnum, otherEnumName otherEnum ){
        String string1;
        String string2;
        switch(objectEnum){
            default:
            case None: string1="none";
            break;
            case Constant1: string1="Constant1";
            break;
            case Constant2: string1="Constant2";
            break;
            case Constant3: string1 = "Constant3";
        }
        switch(otherEnum){
            default:
            case None: string2="none";
            break;
            case OtherConstant1: string2="OtherConstant1";
            break;
            case OtherConstant2: string2="OtherConstant2";
            break;
            case OtherConstant3: string2 = "OtherConstant1";
        }
        System.out.println(string1+string2);

        
        
    }
    
}
