package modulo_3;

public class MultiReleasedJARFiles {

    // Strong encapsulation of packages.
    // Java FX 8 is no longer available of internal APIs
    // switch to javafx.css.CssParser Java 9 +
    // META-INF/versions directory:
    /*
        Application.class
        BuildingBlocks.class
        Util.class
        META-INF
            MANIFEST.MF (with line Multi-Release: true)
            versions
            9
                Application.class
                BuildingBlocks.class
            10
                BuildingBlocks.class
     */

    // With this you can -C option and switch trhough different versions and compile with no error of deprecated code.
    // The --release flag is also new with Java 9.
    // -d creates a new directory.

}
