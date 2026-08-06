package modulo_2;

public class EmployeeTest {

    static void main() {
        DefiningYourOwnClasses.Employee[] staff = new DefiningYourOwnClasses.Employee[3];
        staff[0] = new DefiningYourOwnClasses.Employee();
        staff[1] = new DefiningYourOwnClasses.Employee();
        staff[2] = new DefiningYourOwnClasses.Employee();

        for(DefiningYourOwnClasses.Employee e : staff) {
            e.method3();
            e.method2();
            e.method1();
            System.out.println(e.field1);
            System.out.println(e.field2);
            System.out.println(e.field3);
        }

    }

}
