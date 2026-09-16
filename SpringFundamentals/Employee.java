public class Employee
{
    private static volatile Employee emp;

    private Employee()
    {

    }

    public static Employee getEmployee()
    {
        if(emp==null)
        {
            synchronized(Employee.class)
            {
                if(emp==null)
                {
                    emp= new Employee();
                }
                
            }
        }

        return emp;
    }
}