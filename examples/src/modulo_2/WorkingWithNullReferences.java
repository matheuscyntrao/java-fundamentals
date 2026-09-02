package modulo_2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class WorkingWithNullReferences {

    // Null is used to indicate the absence of an object
    LocalDate birthday = null;
    String s = birthday.toString(); // NullPointerException

    // Date class has a mutator method, do not return references to mutable objects.
    Date hireDay;
    public Date getHireDay() {
        //return hireDay; // Bad decision
        return (Date) hireDay.clone(); // Correct one
    }

    // Serious error, similar to an "index out of bounds" exception
    // If your program does not "catch" an exception, it is terminated
    // Variables like name, hireDay it will be not null, but salary for example have no worries (because primitive type of double cannot be null)

    public static class Employee2 {

        String s = null;
        String string = Objects.requireNonNullElse(s, "unknown");
        double salary = 0.00;

        public Employee2(String s, String string, double salary) {
            this.s = s;
            this.string = string;
            this.salary = salary;
        }

        public String getS() {
            return s;
        }

        // Make the fields read-only avoid us to have multiple debug locations if a bug appears
        // A private data field
        // A public field accessor method
        // A public field mutator method
        public String getString() {
            return string;
        }

        public double getSalary() { return this.salary; }

        // Implicit is the target or receiver (Employee)
        // Explicit parameter is the number inside the parameters (byPercent)
        public void raiseSalary(double byPercent)
        {
            double raise = salary * byPercent / 100;
            salary += raise;
        }

    }

    // Permissive approach is to turn a null argument into an appropriate non-null value
    static void main() {
        String n = "";
        String name = Objects.requireNonNullElse(n, "unknown");
        if (n == null) name = "unknown"; else name = n;
    }




}
