package design;

public abstract class abstractClass implements Employee {


    int id;
    String name;
    String department;
    int hours;
    int daysOfWeek;
    int Salary = hours * daysOfWeek;
    String benefits;
    int dob;
    int ssn;
    String FtOrPT;
    boolean workspace;
    int employeeYearsOfExperience;
    String nationality;
    int startDate;
    boolean isAlive;


    public abstractClass(int id, String name, String department, int hours, int daysOfWeek, int salary, String benefits, int dob, int ssn, String ftOrPT, boolean workspace, int employeeYearsOfExperience, String nationality, int startDate, boolean isAlive) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.hours = hours;
        this.daysOfWeek = daysOfWeek;
        Salary = salary;
        this.benefits = benefits;
        this.dob = dob;
        this.ssn = ssn;
        FtOrPT = ftOrPT;
        this.workspace = workspace;
        this.employeeYearsOfExperience = employeeYearsOfExperience;
        this.nationality = nationality;
        this.startDate = startDate;
        this.isAlive = isAlive;
    }

    private int LaughForLaughs;
    public abstractClass(int LaughForLaughs) {
        this.LaughForLaughs = LaughForLaughs;

    }

    public int employeeId(int id) {
        return id;
    }

    public void setEmployeeId(int id) {

    }


    public String setEmployeeName(String name) {
        return name;

    }


    public void assignDepartment( String Department) {
    }

    public int calculateSalary( int Salary) {
        return calculateSalary();
    }

    public void benefitLayout() {

    }

    public int employeeDOB( int dob) {
        return dob;
    }

    public int employeeSSN( int ssn) {
        return ssn;
    }

    public void employeePTOrFT( String FTorPT) {

    }

    public boolean employeeIsWorkingFromHome(boolean workspace) {
        return workspace;
    }

    public int employeeExperience(int employeeYearsOfExperience) {
        return employeeYearsOfExperience;
    }


}
