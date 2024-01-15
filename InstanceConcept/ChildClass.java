package InstanceConcept;

public class ChildClass extends ParentClass{
    public int cInstanceVariable;
    public ChildClass(int pInstanceVariable,int cInstanceVariable){
       super(pInstanceVariable);
       this.cInstanceVariable=cInstanceVariable;
    }
    public ChildClass(int cInstanceVariable)
    {
        super(10);
        this.cInstanceVariable=cInstanceVariable;
    }
}
