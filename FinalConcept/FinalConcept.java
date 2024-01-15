package FinalConcept;

public class FinalConcept {
    final int finalVariable=67;
    final void finalVariableMethod()
    {
        System.out.println("The value of final variable in final method is "+finalVariable);
    }
    public static void main(String[] args){
        FinalConcept c=new FinalConcept();
        c.finalVariableMethod();
    }
}
