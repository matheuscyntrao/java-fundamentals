package modulo_2;

public class ParameterNames {

    String name;
    double salary;
    int year;

    // When you write trivial constructors (and you'll write a lot of them),
    // it can be somewhat frustrating to come up with parameter names.
    public ParameterNames(String n, int y) {

    }

    // The drawback is that you need to read the code to tell what the n and s parameters mean
    public ParameterNames(String nameOfSomeObject, double salaryOfSomeObject) {
        name = nameOfSomeObject;
        salary = salaryOfSomeObject;
    }

    // That is quite neat. Any reader can immediately figure out the meaning of the parameters.
    // Another commonly used trick relies on the fact that parameter variables shadow instance fields with the same name.
    // Use this to refer to instance fields
    public ParameterNames(String name, double salary, boolean isActive) {
        this.name = name;
        this.salary = salary;
    }

}
