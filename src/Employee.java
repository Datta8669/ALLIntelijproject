import java.util.ArrayList;

public class Employee {
     public String name;
        public String employeeNumber;
        public int hireYear;
        public double weeklyEarning;

        public Employee(String name, String employeeNumber, int hireYear, double weeklyEarning) {
            this.name = name;
            this.employeeNumber = employeeNumber;
            this.hireYear = hireYear;
            this.weeklyEarning = weeklyEarning;
        }

        public static void main(String[] args) {
            // Create an ArrayList to store employees
            ArrayList<Employee> employeeList = new ArrayList<>();

            // Add sample employees
            employeeList.add(new Employee("John Doe", "0001-A", 2010, 1000));
            employeeList.add(new Employee("Jane Smith", "0002-B", 2015, 1200));
            employeeList.add(new Employee("Mike Johnson", "0003-C", 2018, 1500));
            employeeList.add(new Employee("Emily Brown", "0004-D", 2020, 1800));

           /* // Print employee details
            for (Employee emp : employeeList) {
                System.out.println("Name: " + emp.name);
                System.out.println("Employee Number: " + emp.employeeNumber);
                System.out.println("Hire Year: " + emp.hireYear);
                System.out.println("Weekly Earning: $" + emp.weeklyEarning);
                System.out.println();
            }*/
            // Print employee details using lambda expression
            employeeList.forEach(emp -> {
                System.out.println("Name: " + emp.name);
                System.out.println("Employee Number: " + emp.employeeNumber);
                System.out.println("Hire Year: " + emp.hireYear);
                System.out.println("Weekly Earning: $" + emp.weeklyEarning);
                System.out.println();
            });
        }
    }


