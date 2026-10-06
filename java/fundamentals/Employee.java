public Class Employee {
    private Integer id;
    private String name;
    private String department;
    private double salary;

    Employee(Integer id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }
}