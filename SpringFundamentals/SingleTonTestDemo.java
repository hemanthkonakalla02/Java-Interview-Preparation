public class SingleTonTestDemo
{
    public static void main(String[] args)
    {
        Employee emp1=Employee.getEmployee();
        Employee emp2=Employee.getEmployee();
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
    }
}