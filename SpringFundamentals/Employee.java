public class Employee
{
    private static volatile Employee emp; 

    private Employee()
    {
         // Prevents object creation from outside the Employee class.
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
