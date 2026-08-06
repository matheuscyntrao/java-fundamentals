package modulo_2;

public class ClassBasedAccessPrivilegies {

    // The private data of the object can be access on wich it is invoked
    // A method can access the private data of all objects of its class

    class ComparingEmployee {

        private String name;

        public boolean equals(ComparingEmployee other) {
            return name.equals(other.name);
        }

    }

}
