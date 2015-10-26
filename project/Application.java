public class Application {
    
    public static void main(String[] args) {
        System.out.println(Variable.name); // direct call to name as this is static, dont need to build object        
        Variable.printAddress(); //direct call to static method

        Variable vr = new Variable();  //object from Variable class
        vr.printAddress1(); //direct call to static method
        //System.out.println(vr.age); //cant call private variable out side class
        System.out.println(vr.weight); // call protected variable
        //System.out.println(vr.getPrivateVariable1());//cant call private method out side class
        System.out.println(vr.getProtectedVariable2()); // call protected method that returning/call protected variable too
        System.out.println(vr.getPrivateVariable3()); //call protected method that call private variable
        vr.printName(); //call protected mthod
        vr.printAddress1(); //call public method

        Constant ct = new Constant(); //instantiate object from Constant class
        System.out.println(ct.NAME);//call constant via object instead of class since this is also callable protected constant
        System.out.println(Constant.NAME);//call static constant via class instead of object
        //System.out.println(ct.ADDRESS); //cant call private constant
        System.out.println(ct.ADDRESS1); //call public constant
        //System.out.println(ct.getADDRESS1()); //cant call private method out side class
        System.out.println(ct.getADDRESS2());//call protected method that call private constant
    }

}


class Variable
{
    public static String name = "arissan";  //instance static public variable  
    private int age = 20;     //instance private variable  
    protected int weight = 80;     //instance static private variable  

    private int getPrivateVariable1(){  
      return age; //returning private variable
    }

    protected int getProtectedVariable2(){  
      return weight; //returning protected variable
    }

    protected int getPrivateVariable3(){  
      return age; //returning private variable
    }

    protected void printName()
    {
       String name = "siapa saja"; //local variable
       System.out.println(name);
    }

    public static void printAddress()
    {
       System.out.println("Bandung");
    }

    public void printAddress1()
    {
       System.out.println("Pemalang");
    }
}

class Constant
{
    protected final static String NAME = "Sukijah";
    private final static String ADDRESS = "Tegal";
    public final String ADDRESS1 = "Pemalang";

    private String getADDRESS1(){  
      return ADDRESS; 
    }

    protected String getADDRESS2(){  
      return ADDRESS;//it can read private via this proctected method
    }

}
