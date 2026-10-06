public Class Main() {
    public static void Main(String args[]) {
        List<Employee> empList = new ArrayList<Employee>;

        Employee emp1 = new Employee(1, "Aarif", "softwareEngineer", 500000.00);
        empList.add(emp1);
        Employee emp2 = new Employee(2, "Ansari", "architech", 1000000.00);
        empList.add(emp2);
        Employee emp3 = new Employee(3, "abc", "xya", 90000.00);
        empList.add(emp3);
        Employee emp4 = new Employee(4, "efg", "xyz", 50000.00);
        empList.add(emp4);
        Employee emp5 = new Employee(5, "hij", "551sdd", 40000.00);
        empList.add(emp5);
        Employee emp6 = new Employee(6, "sdfasdf", "kljelrwe", 100000.00);
        empList.add(emp6);
        Employee emp7 = new Employee(7, "lsdlkd", "klsddfkd", 65245632.00);
        empList.add(emp7);
        Employee emp8 = new Employee(8, "ksdkd", "dfsd", 441100.00);
        empList.add(emp8);
        Employee emp9 = new Employee(9, "ssdfeget", "dsegge", 965214.00);
        empList.add(emp9);
        Employee emp10 = new Employee(10, "sdldkkk", "pppkdkd", 950000.00);
        empList.add(emp10);


        // find the employee with the highest salary
        double maxSalary = 0;
        Employee highestSalaryEmployee = new Employee();
        for(Employee emp:empList) {
            double salary = emp.getSalary();
            if (maxSalary < salary) {
                maxSalary = salary;
                highestSalaryEmployee = emp;
            }
        }

        System.out.println("Highest salary" + highestSalaryEmployee.toString()); 

        // find the employee with lowest salary
    }
}