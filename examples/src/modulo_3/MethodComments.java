package modulo_3;

public class MethodComments {

    // Each method comment must immediately prece the method that it describes.
    // In addition to the general-purpose tags, you can use the following tags:

    /*
    @param variable description
    @return description
    @return description
    @throws class description
     */

    /*
     * Raises the salary of an employee
     * @param byPercent the percentage by which to raise the salary (e.g, 10 means 10%)
     * @return the amount of the raise
     */
    double salary = 0.0;
    public double raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += salary;
        return raise;
    }

}
