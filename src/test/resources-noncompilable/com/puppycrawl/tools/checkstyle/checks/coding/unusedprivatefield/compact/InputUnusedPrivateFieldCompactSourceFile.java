/*
UnusedPrivateField
ignoreAnnotationCanonicalNames = (default)java.io.Serial
ignoredFieldPattern = (default)serialVersionUID

*/

// non-compiled with javac: Compilable with Java25

private int unused; // violation 'Unused private field'
private int used = 1;
private int usedThroughThis = 2;
private static int counter;
private int shadowed; // violation 'Unused private field'
private int readByNested = 3;
private static final long serialVersionUID = 1L;

void main() {
    System.out.println(used + this.usedThroughThis);
    counter++;
    int shadowed = 4;
    System.out.println(shadowed);
}

class Nested {
    private int nestedUnused; // violation 'Unused private field'

    int read() {
        return readByNested;
    }
}
