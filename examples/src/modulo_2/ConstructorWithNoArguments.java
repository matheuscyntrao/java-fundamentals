package modulo_2;

import java.time.LocalDate;

public class ConstructorWithNoArguments {

    String name;
    double salary;
    LocalDate hireDay;

    // Many classes contain a constructor with no arguments that creates an object whose state is set
    // to an appropriate default.
    public ConstructorWithNoArguments() {
        name = "";
        salary = 0;
        hireDay = LocalDate.now();
    }

    // If you write a class with no constructor whatsoever, then a no-argument constructor is provided for you.
    // This consctructor sets all the instance fields to theirdefault values.
    // So, all numeric data contained in the instance fields would be 0, all boolean would be false ad object variables would be null.
    // If a class supplies at least one constructorbut does not supply a no-argument constructor, it is illegal to construct objects whitout supplying arguments.

    // pulic Employee(Stringe, double s, int year, int month, int day)
    // With that class, it was not legal to construct default employees.
    // The call e = new Employee have been an error.

}


