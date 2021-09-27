package QnA;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    public List<String> questions = new ArrayList<String>() {
        {
            add("Which of the following method signatures is a valid declaration of an entry point in aJava application?\nA. public void main(String[] args)\nB. public static void main()\nC. private static void start(String[] mydata)\nD. public static final void main(String[] mydata)");
            add("The following class diagram demonstrates the relationship between Gold and Silver,which extend the Metal class. Assume the attributes are all declared public. Whichstatement about the diagram is not true?\n" +
                    "                ┌───────────────────┐\n" +
                    "                │      Metal        │\n" +
                    "                ├───────────────────┤\n" +
                    "                │  + weight         │\n" +
                    "                │  + hue            │\n" +
                    "                └─────────▲─────────┘\n" +
                    "                          │\n" +
                    "        ┌─────────────────┴──────────────────┐\n" +
                    "        │                                    │\n" +
                    "        │                                    │\n" +
                    "┌───────┴──────────┐                ┌────────┴─────────┐\n" +
                    "│      Gold        │                │      Silver      │\n" +
                    "├──────────────────┤                ├──────────────────┤\n" +
                    "│   + hue          │                │  + luster        │\n" +
                    "│                  │                │                  │\n" +
                    "└──────────────────┘                └──────────────────┘\nA. The diagram demonstrates platform independence in Java.\nB. The diagram demonstrates object-oriented design in Java.\nC. The Gold and Silver classes inherit weight and color attributes from the Metalclass.\nD. Gold does not inherit the luster attribute.");
            add("What is the proper filename extension for a Java bytecode compiled file?\nA. .java\nB. .bytecode\nC. .class\nD. .dll");
            add("Given that a Date class exists in both the java.util and java.sql packages, what is the result of compiling the following class?\n1: import java.util.*;\n2: import java.sql.*;\n3: public class BirthdayManager {\n4:    private Date rob = new Date();\n5:    private java.util.Date sharon = new java.util.Date();\n6: }\nA. The code does not compile because of lines 1 and 2.\nB. The code does not compile because of line 4.\nC. The code does not compile because of line 5.\nD. The code compiles without issue.");
            add("Which of the following is not a facet of traditional object-oriented programminglanguages?\nA. Objects are grouped as procedures, separate from the data they act on.\nB. An object can take many forms via casting.\nC. An object can hold data, referred to as attributes.\nD. An object can perform actions, via methods.");
            add("Which variables have a scope limited to a method?\nA. Interface variables\nB. Class variables\nC. Instance variables\nD. Local variables");
            add("Which package is imported into every Java class by default?\nA. java.util\nB. java.lang\nC. system.lang\nD. java.system");
            add("Which of the following is not a valid code comment in Java?\nA. // Add 5 to the result\nB. /*** TODO: Fix bug 12312 ***/\nC. # Add configuration value\nD. /* Read file from system ****/");
            add("Which statement about a valid .java file is true?\nA. It can only contain one class declaration.\nB. It can contain one public class declaration and one public interface definition.\nC. It must define at least one public class.\n" +
                    "D. It may define at most one public class.");
            add("Given the following application, fill in the missing values in the table starting from the top and going downward.\npackage competition;\npublic class Robot { \n  static String weight = \"A lot\"; \n  /* default */ double ageMonths = 5, ageDays = 2; \n  private static boolean success = true; \n  public void main(String[] args) { \n     final String retries = \"1\"; \n     // P1 \n  }\n}\n\n" +
                    "┌───────────────┬───────────────────────────────────────┐\n" +
                    "│ Variable Type │ Number of Variables Accessible at p1  │\n" +
                    "├───────────────┼───────────────────────────────────────┤\n" +
                    "│ Class         │ _____                                 │\n" +
                    "├───────────────┼───────────────────────────────────────┤\n" +
                    "│ Instance      │ _____                                 │\n" +
                    "├───────────────┼───────────────────────────────────────┤\n" +
                    "│ Local         │ _____                                 │\n" +
                    "└───────────────┴───────────────────────────────────────┘\n" +
                    "\n" +
                    "A. 2, 0, 1\nB. 2, 2, 1\nC. 1, 0, 1\nD. 0, 2, 1");
            add("Which statement about import statements is true?\nA. The class will not compile if it contains unused import statements.\nB. Unused import statements can be removed from the class without causing a classto become unable to be compiled.\nC. The class will not compile if a duplicate import statement is present.\nD. If a class contains an import statement for a class used in the program that cannotbe found, it can still compile.");
            add("What is the result of compiling and executing the following class?\n\n1: public class ParkRanger {\n2:    int birds = 10;\n3:    public static void main(String[] data) {\n4:       int trees = 5;\n5:       System.out.print(trees+birds);\n6:    }\n7: }\n\nA. It does not compile.\nB. It compiles but throws an exception at runtime.\n" +
                    "C. It compiles and outputs 5.\nD. It compiles and outputs 15.");
            add("Which statements about Java are true?\n\nI. The java command can execute .java and .class files.\nII. Java is not object oriented.\nIII. The javac command compiles directly into native machine code.\n\nA. I only\nB. III only\nC. II and III\nD. None are true.");
            add("Which of the following lines of code is not allowed as the first line of a Java class file?\nA. import widget.*;\nB. // Widget Manager\nC. package sprockets;\nD. int facilityNumber;");
            add("Which one of the following statements is true about using packages to organize yourcode in Java?\nA. Every class is required to include a package declaration.\nB. To create a new package, you need to add a package.init file to the directory.\nC. Packages allow you to limit access to classes, methods, or data from classes outsidethe package.\nD. It is not possible to restrict access to objects and methods within a package.");
            add("Given that the current directory is /user/home, with an application Java file in/user/home/Manager.java that uses the default package, which are the correctcommands to compile and run the application in Java?\nA. javac Manager \njava Manager\nB. javac Manager.java \njava Manager\nC. javac Manager \njava Manager.class\nD. javac Manager.java \njava Manager.class");
            add("Structuring a Java class such that only methods within the class can access itsinstance variables is referred to as _______.\nA. platform independence\nB. object orientation\nC. inheritance\nD. encapsulation");
            add("What is the output of the following code snippet?\n\nString tree = \"pine\";\nint count = 0;\nif (tree.equals(\"pine\")) { \n  int height = 55; \n  count = count + 1;\n}\nSystem.out.print(height + count);\nA. 1\nB. 55\nC. 56\nD. It does not compile.");
            add("Which of the following is true of a Java bytecode file?\nA. It can be run on any computer with a compatible JVM.\nB. It can only be executed on the same type of computer that it was created on.\nC. It can be easily read and modified in a standard text editor.\nD. It requires the corresponding .java that created it to execute.");
            add("What is the correct character for terminating a statement in Java?A. A colon (:)B. An end-of-line characterC. A tab characterD. A semicolon (;)");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
        }
    };
}
