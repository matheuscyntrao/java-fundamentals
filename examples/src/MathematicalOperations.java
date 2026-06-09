void main() {

    // Takes the square root of a number
    System.out.printf(String.valueOf(Math.sqrt(2.0)));

    // Makes an exponential operation 4.0¹
    System.out.println(Math.pow(4.0, 1));

    // Get the remainder of divisions
    System.out.println(Math.floorMod(10, 3));

    // Check if a number is odd
    int number = 2;
    if(Math.floorMod(number, 2) == 1) {
        // odd
    } else if (Math.floorMod(number, 2) == 0 ) {
        // even
    } else {
        // negative -1
    }

    // Circular array
    int[] arr = {10, 20, 30, 40, 50};

    int pos = Math.floorMod(-1, arr.length);

    System.out.println(arr[pos]); // 50

    // Trigonometric
    Math.sin(number);
    Math.cos(number);
    Math.tan(number);
    Math.atan(number);
    Math.atan2(number, 2);

    // Exponential
    Math.exp(number);
    Math.log(number);
    Math.log10(number);

    // Constants
    System.out.println(Math.PI);
    System.out.println(Math.E);

    // More accurate but slowly
    // https://netlib.org/fdlibm
    StrictMath.pow(number, 2);
    StrictMath.atan(number);

    // Overflows integer but not generate an exception
    System.out.println(1000000000 * 3);

    // Generates an exception
    System.out.println(Math.multiplyExact(1000000000, 3));
    Math.addExact(1, 2);
    Math.subtractExact(1, 2);
    Math.incrementExact(1);
    Math.decrementExact(1);
    Math.negateExact(1);

}
