package modulo_4;

import modulo_2.WorkingWithNullReferences;

// The keyword extends indicates that you are making a new class that derives from an existing class.
// Employee2 class is called superclass, base class or parent class.
// The Manager class is called subclass, derived class or child class.
public class Manager extends WorkingWithNullReferences.Employee2 {

    private double bonus;
    public void setBonus(double bonus) {
        this.bonus = bonus;
        this.raiseSalary(100.00); // from the employee2 class
    }

    // Overloading
    public Manager(String s, String name, double salary, boolean isOverloading) {
        super(s, name, salary);
        if(isOverloading) {
            System.out.println("Manager Class");
        }
    }

    public Manager(String s, String name, double salary) {
        super(s, name, salary);
    }

    static void main() {
        Manager boss = new Manager("s", "string", 1.00);
        boss.setBonus(100.00);
    }

    // Overriding
    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

}
