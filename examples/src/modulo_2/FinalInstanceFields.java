package modulo_2;

import java.time.LocalDate;

public class FinalInstanceFields {

    // You can define an instance field as final.
    // Such field must be initialized when the object is constructed.
    // That is, you must guarantee that fieldvalue has been set after the end of every constructor.
    // Afterward the field may not be modified again.
    // The field name may be declared as final because it never changes after the object is constructed (without setName)

    private final String name;
    private final StringBuilder evaluation;

    public FinalInstanceFields(String name, StringBuilder evaluation) {
        this.name = name;
        this.evaluation = evaluation;
    }

    public void giveGoldStart() {
        evaluation.append(LocalDate.now() + ": Gold Star!\n");
    }

    // The final modifier is particularly useful for fields whose type is primitive or an immutable class.
    // An immutable class never mutate its objects.


}
