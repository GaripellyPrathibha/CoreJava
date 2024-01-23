package instanceConcept;

public class Main {
    public static void main(String[] args)
    {
        ChildClass child1=new ChildClass(11,12);
        System.out.println(child1.cInstanceVariable +" and "+ child1.pInstanceVariable);
        ChildClass child2=new ChildClass(20);
        System.out.println(child2.cInstanceVariable + " and "+ child2.pInstanceVariable);
    }

}
