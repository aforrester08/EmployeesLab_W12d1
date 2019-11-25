package staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    private double salary;

    public Employee(String name, String NINumber, double salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName){
        if (name != null){
            this.name = newName;
        }
    }

    public String getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double raise){
        if (raise >= 0){
            this.salary += raise;
        }
    }

    public double payBonus(){
        return 0.01 * salary;
    }
}
