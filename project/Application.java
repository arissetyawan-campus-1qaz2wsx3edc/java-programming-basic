public class Application {
    
    public static void main(String[] args) {
        System.out.println(Variable.name);
        Variable vr = new Variable();
        System.out.println(vr.weight);
        //System.out.println(vr.age);
        //System.out.println(vr.salary);
        //System.out.println(vr.getLocalVariable1());
        System.out.println(vr.getLocalVariable2());
        
        Constant ct = new Constant();
        System.out.println(ct.NAME);
        //System.out.println(ct.getADDRESS1());
        System.out.println(ct.getADDRESS2());
    }

}


class Variable
{
    public static String name = "arissan";  //instance static public variable  
    private int age = 20;     //instance static private variable  
    protected int weight = 80;     //instance static private variable  

    private int getLocalVariable1(){  
      return age; //local variable
    }

    protected int getLocalVariable2(){  
      return age; //local variable
    }

}

class Constant
{
    public final static String NAME = "Sukijah";
    private final static String ADDRESS = "Tegal";

    private String getADDRESS1(){  
      return ADDRESS;
    }

    protected String getADDRESS2(){  
      return ADDRESS;
    }

}
