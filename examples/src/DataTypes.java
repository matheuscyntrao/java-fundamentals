public class DataTypes {

    // Java isstrongly typed, every variable must have a type declared.
    // Java has an arbitraty-precision aritchmetic package, but "Big Numbers" os char sequence are Java Objects and not a primitive Java type.

    // Integer type

    int fourBytes;
    short twoBytes; // Are mainlyintended for specialized applications, such as low-levelfile handling or for large arrays when storage space it at a premium.
    long eightBytes;
    byte oneByte;

    // The ranges of integer type and the main reason for that decision, is to facilitate major pain for developers who want to migrate the system between platforms.
    // Integer types do not depend on the machine witch you be running Java code, here are other difference between Java and C/C++ (they yse the most efficient integer type for each processor, causing overflow if one one 32 bit program runs into 16 bit system.
    // After Java 7, you can write binary integers using prefix 0B or 0b. And also can use underscore (for human eyes) to denote one million, etc

}
