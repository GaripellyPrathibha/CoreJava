package abstract_concept;

public class ImpDepartment extends Department{
    int departmentSize;
    public ImpDepartment(int departmentSize)
    {
        this.departmentSize=departmentSize;
    }
    @Override
    public int getDepartmentSize()
    {
        return departmentSize;
    }

}
