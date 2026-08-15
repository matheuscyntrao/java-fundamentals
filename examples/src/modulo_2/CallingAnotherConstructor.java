package modulo_2;

public class CallingAnotherConstructor {

    // The keywords thisrefers to the implicit parameterof a method
    // This keyword has a second meaning.
    String name;
    double something;

    // Ifthe first statement of a constructorhasthe form this(...),
    // then the constructor calls another constructor of the same class.
    public CallingAnotherConstructor(double s) {
       // calls CallingAnotherConstructor(String s, double d)
        this("Test", 10.0);
        System.out.println(letter());
    }

    public CallingAnotherConstructor(String s, double d){
        this.name = s;
        this.something = d;
    }

    public String letter() {
        return this.name + "#";
    }

    // You can reuse and write common code once.

}
