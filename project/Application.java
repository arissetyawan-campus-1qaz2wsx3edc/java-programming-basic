public class Application {
    
    public static void main(String[] args) {
        System.out.println(Variable.name); // direct call to name as this is static, dont need to build object        
        Variable.printAddress(); //direct call to static method

        Variable vr = new Variable();  
        vr.printAddress1(); //direct call to static method
        //System.out.println(vr.age); //cant call private variable out side class
        System.out.println(vr.weight); // call protected variable
        //System.out.println(vr.getPrivateVariable1());//cant call private method out side class
        System.out.println(vr.getProtectedVariable2());
        System.out.println(vr.getPrivateVariable3());
        vr.printName();

        Constant ct = new Constant();
        System.out.println(ct.NAME);
        //System.out.println(ct.getADDRESS1()); //cant call private method out side class
        System.out.println(ct.getADDRESS2());
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

    void printAddress1()
    {
       System.out.println("Pemalang");
    }
}

class Constant
{
    protected final static String NAME = "Sukijah";
    private final static String ADDRESS = "Tegal";

    private String getADDRESS1(){  
      return ADDRESS; 
    }

    protected String getADDRESS2(){  
      return ADDRESS;//it can read private via this proctected method
    }

}
