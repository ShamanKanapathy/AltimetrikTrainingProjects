import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
//        Employee e1= ac.getBean(Employee.class);
//        System.out.println(e1.hashCode());
//        Employee e2= ac.getBean(Employee.class);
//        System.out.println(e2.hashCode());


//        Employee emp2=ac.getBean("emp2",Employee.class);
//        emp2.displayEmployee();
//        System.out.println(emp2.employeeId);
//        System.out.println(emp2.employeeName);
//
      Employee emp1=ac.getBean("emp1",Employee.class);
//        emp1.displayEmployee();
//        System.out.println(emp1.employeeId);
//        System.out.println(emp1.employeeName);
//
//
        Staff d=ac.getBean(Staff.class);
        d.displayStaff();
//        System.out.println(d.staffId);
//        System.out.println(d.staffName);

    }
}
