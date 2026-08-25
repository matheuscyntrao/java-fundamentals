package modulo_3;

public class TheManifest {

    // In addition to classfiles, images and other resources,each JAR file contains a manifestfile that describes special features of the archive.
    // The manifest file is called MANIFEST.MF and is located in a special META-INF subdirectory of the JAR file.
    // The minimum legal manifestis quite boring.

    // Manifest-Version: 1.0

    // Complex manifests can have many more entries.
    // The manifest entries are grouped into sections.
    // The first section in the manufest is called the main section (it applies to whole JAR file).
    // Subsequent entries can specify properties of named entities such as individual files, packages or URLs.
    // Those entries must begin with a Name entry.

    // Sections are separated by blank lines.

    // Manifest-Version: 1.0
    // lines describing this archive

    // Name: Woozle.class
    // lines describing this file
    // Name: com/mycompany/mypkg/
    // lines describing this package

    // To edit the manifest, place the lines that you want to add to the manifest into a text file. Then run:
    // jar cfm jarFileName manifestFileName -> jar cfm MyArchive.jar  manifest.mf com/mycompany/mypackage/*.class

}
