package QnA;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    public List<String> questions = new ArrayList<String>() {
        {
            /* Chapter 1 */
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
            add("What is the result of compiling and executing the following class?\n\n" +
                    "1: public class Tolls {\n" +
                    "2:   private static int yesterday = 1;\n" +
                    "3:   int tomorrow = 10;\n" +
                    "4:   public static void main(String[] args) {\n" +
                    "5:     Tolls tolls = new Tolls();\n" +
                    "6:     int today=20, tomorrow = 40;\n" +
                    "7:     System.out.print(today + tolls.tomorrow + tolls.yesterday);\n" +
                    "8:   }\n" +
                    "9: }\n\n" +
                    "A. The code does not compile due to line 6.\n" +
                    "B. The code does not compile due to line 7.\n" +
                    "C. 31\n" +
                    "D. 61");
            add("Given the following class definition, which is the only line that does not contain a\n" +
                    "compilation error?\n\n" +
                    "1: public ThisClassDoesNotCompile {\n" +
                    "2:   double int count;\n" +
                    "3:   void errors() {}\n" +
                    "4:   static void private limit; }\n\n" +
                    "A. Line 1\n" +
                    "B. Line 2\n" +
                    "C. Line 3\n" +
                    "D. Line 4");
            add("Which of the following features allows a Java class to be run on a wide variety of\n" +
                    "computers and devices?\n" +
                    "A. Encapsulation\n" +
                    "B. Object oriented\n" +
                    "C. Inheritance\n" +
                    "D. Platform independence");
            add("Which of the following is not a property of a JVM?\n" +
                    "A. It prevents Java bytecode from being easily decoded/decompiled.\n" +
                    "B. It supports platform independence.\n" +
                    "C. It manages memory for the application.\n" +
                    "D. It translates Java instructions to machine instructions.");
            add("Which of the following variables are always in scope for the entire program?\n" +
                    "A. Package variables\n" +
                    "B. Class variables\n" +
                    "C. Instance variables\n" +
                    "D. Local variables");
            add("Given the following wildcard import statements, which class would be included in the\n" +
                    "import?\n\n" +
                    "import television.actor.*;\n" +
                    "import movie.director.*;\n\n" +
                    "A. television.actor.recurring.Marie\n" +
                    "B. movie.directors.John\n" +
                    "C. television.actor.Package\n" +
                    "D. movie.NewRelease");
            add("Which is the correct order of statements for a Java class file?\n" +
                    "A. import statements, package statement, class declaration\n" +
                    "B. package statement, class declaration, import statement\n" +
                    "C. class declaration, import statements, package declaration\n" +
                    "D. package statement, import statements, class declaration");
            add("Given the following class definition, what is the maximum number of import\n" +
                    "statements that can be discarded and still have the code compile? For this question,\n" +
                    "assume that the Blackhole class is defined only in the stars package.\n\n" +
                    "package planetarium;\n" +
                    "import java.lang.*;\n" +
                    "import stars.*;\n" +
                    "import java.lang.Object;\n" +
                    "import stars.Blackhole;\n" +
                    "public class Observer {\n" +
                    "  public void find(Blackhole blackhole) {}\n" +
                    "}\n\n" +
                    "A. Zero\n" +
                    "B. One\n" +
                    "C. Two\n" +
                    "D. Three");
            add("Given the following class definition, which command will cause the application to\n" +
                    "output the message White-tailed?\n\n" +
                    "package forest;\n" +
                    "public class Deer {\n" +
                    "  public static void main(String... deerParams) {\n" +
                    "    System.out.print(theInput[2]);\n" +
                    "  }\n" +
                    "}\n\n" +
                    "A. java forest.Deer deer 5 \"White-tailed deer\"\n" +
                    "B. java forest.Deer \"White-tailed deer\" deer 3\n" +
                    "C. java forest.Deer Red deer White-tailed deer\n" +
                    "D. java forest.Deer My \"deer White-tailed\"");
            add("Which of the following is a true statement?\n" +
                    "A. The java command compiles a .java file into a .class file.\n" +
                    "B. The javac command compiles a .java file into a .class file.\n" +
                    "C. The java command compiles a .class file into a .java file.\n" +
                    "D. The javac command compiles a .class file into a .java file.");
            add("Which of the following statements about Java is true?\n" +
                    "A. Java is a procedural programming language.\n" +
                    "B. Java allows method overloading.\n" +
                    "C. Java allows operator overloading.\n" +
                    "D. Java allows direct access to objects in memory.");
            add("Given the following code, what values inserted in order into the blank lines, allow the\n" +
                    "code to compile?\n\n" +
                    "_______agent;\n" +
                    "public _______Banker {\n" +
                    "  private static _______getMaxWithdrawal() {\n" +
                    "    return 10;\n" +
                    "  }\n" +
                    "}\n\n" +
                    "A. import, class, null\n" +
                    "B. import, interface, void\n" +
                    "C. package, int, int\n" +
                    "D. package, class, long");
            add("What is the output of the following application?\n\n" +
                    "public class Airplane {\n" +
                    "  static int start = 2;\n" +
                    "  final int end;\n" +
                    "  public Airplane(int x) {\n" +
                    "    x = 4;\n" +
                    "    end = x;\n" +
                    "  }\n" +
                    "  public void fly(int distance) {\n" +
                    "    System.out.print(end-start+\" \");\n" +
                    "    System.out.print(distance);\n" +
                    "  }\n" +
                    "  public static void main(String... start) {\n" +
                    "    new Airplane(10).fly(5);\n" +
                    "  }\n" +
                    "}\n\n" +
                    "A. 2 5\n" +
                    "B. 8 5\n" +
                    "C. 6 5\n" +
                    "D. The code does not compile.");
            add("What is one of the most important reasons that Java supports extending classes via\n" +
                    "inheritance?\n" +
                    "A. Inheritance requires that a class that extends another class be in the same package.\n" +
                    "B. The program must spend extra time/resources at runtime jumping through\n" +
                    "multiple layers of inheritance to determine precise methods and variables.\n" +
                    "C. Method signature changes in parent classes may break subclasses that use\n" +
                    "overloaded methods.\n" +
                    "D. Developers minimize duplicate code in new classes by sharing code in a common\n" +
                    "parent class.");
            add("Which of the following is a valid code comment in Java?\n" +
                    "A. //////// Walk my dog\n" +
                    "B. #! Go team!\n" +
                    "C. / Process fails at runtime /\n" +
                    "D. None of the above");
            add("Which of the following method signatures is not a valid declaration of an entry point\n" +
                    "in a Java application?\n" +
                    "A. public static void main(String... arguments)\n" +
                    "B. public static void main(String arguments)\n" +
                    "C. public static final void main(String[] arguments)\n" +
                    "D. public static void main(String[] arguments)");
            add("Given the file Magnet.java below, which of the marked lines can you independently\n" +
                    "insert the line public String color; into and still have the code compile?\n\n" +
                    "// line a1\n" +
                    "public class Magnet {\n" +
                    "  // line a2\n" +
                    "  public void attach() {\n" +
                    "    // line a3\n" +
                    "  }\n" +
                    "  // line a4\n" +
                    "}\n\n" +
                    "A. a1 and a3\n" +
                    "B. a2 and a4\n" +
                    "C. a2, a3, and a4\n" +
                    "D. a1, a2, a3, and a4");
            add("What is required to define a valid Java class file?\n" +
                    "A. A class declaration\n" +
                    "B. A package statement\n" +
                    "C. At least one import statement\n" +
                    "D. The public modifier");
            add("What is the proper filename extension for a Java source file?\n" +
                    "A. .jav\n" +
                    "B. .class\n" +
                    "C. .source\n" +
                    "D. .java");
            add("Given that a Math class exists in both the java.lang and pocket.complex packages,\n" +
                    "what is the result of compiling the following class?\n\n" +
                    "1: package pocket;\n" +
                    "2: import pocket.complex.*;\n" +
                    "3: import java.util.*;\n" +
                    "4: public class Calculator {\n" +
                    "5:   public static void main(String[] args) {\n" +
                    "6:     System.out.print(Math.floor(5));\n" +
                    "7:   }\n" +
                    "8: }\n\n" +
                    "A. The code does not compile because of line 2.\n" +
                    "B. The code does not compile because of line 3.\n" +
                    "C. The code does not compile because of line 6.\n" +
                    "D. The code compiles without issue.");
            add("Given a class that uses the following import statements, which class would not be\n" +
                    "automatically accessible within the class without using its full package name?\n\n" +
                    "import dog.*;\n" +
                    "import dog.puppy.*;\n\n" +
                    "A. dog.puppy.female.KC\n" +
                    "B. dog.puppy.Georgette\n" +
                    "C. dog.Webby\n" +
                    "D. java.lang.Object");
            add("_______is the technique of structuring programming data as a unit consisting of\n" +
                    "attributes, with actions defined on the unit.\n" +
                    "A. Encapsulation\n" +
                    "B. Object orientation\n" +
                    "C. Platform independence\n" +
                    "D. Polymorphism");
            add("Given the following class definition, what is the maximum number of import\n" +
                    "statements that can be discarded and still have the code compile? For this question,\n" +
                    "assume that the Broccoli class is in the food.vegetables package, and the Apple class\n" +
                    "is the food.fruit package.\n\n" +
                    "package food;\n" +
                    "import food.vegetables.*;\n" +
                    "import food.fruit.*;\n" +
                    "import java.util.Date;\n" +
                    "public class Grocery {\n" +
                    "  Apple a; Broccoli b; Date c;\n" +
                    "}\n\n" +
                    "A. 0\n" +
                    "B. 1\n" +
                    "C. 2\n" +
                    "D. 3");
            add("Given the following application, what is the expected output?\n\n" +
                    "public class Keyboard {\n" +
                    "  private boolean numLock = true;\n" +
                    "  static boolean capLock = false;\n" +
                    "  public static void main(String... shortcuts) {\n" +
                    "    System.out.print(numLock+\" \"+capLock);\n" +
                    "  }\n" +
                    "}\n\n" +
                    "A. true false\n" +
                    "B. false false\n" +
                    "C. It does not compile.\n" +
                    "D. It compiles but throws an exception at runtime.");
            add("What is the result of compiling and executing the following class?\n" +
                    "public class RollerSkates {\n" +
                    "  static int wheels = 1;\n" +
                    "  int tracks = 5;\n" +
                    "  public static void main(String[] arguments) {\n" +
                    "    RollerSkates s = new RollerSkates();\n" +
                    "    int feet=4, tracks = 15;\n" +
                    "    System.out.print(feet + tracks + s.wheels);\n" +
                    "  }\n" +
                    "}\n\n" +
                    "A. The code does not compile.\n" +
                    "B. 5\n" +
                    "C. 10\n" +
                    "D. 20");
            add("What is the result of compiling and executing the following class?\n\n" +
                    "package sports;\n" +
                    "public class Bicycle {\n" +
                    "  String color = \"red\";\n" +
                    "  private void printColor(String color) {\n" +
                    "    color = \"purple\";\n" +
                    "    System.out.print(color);\n" +
                    "  }\n" +
                    "  public static void main(String[] rider) {\n" +
                    "    new Bicycle().printColor(\"blue\");\n" +
                    "  }\n" +
                    "}\n\n" +
                    "A. red\n" +
                    "B. purple\n" +
                    "C. blue\n" +
                    "D. It does not compile.");
            add("Which statements about calling the compilation command javac and the execution\n" +
                    "command java are true?\n\n" +
                    "I. java may use a period . to separate packages.\n" +
                    "II. javac takes a .java file and returns a .class file.\n" +
                    "III. java may use a slash (/) to separate packages.\n\n" +
                    "A. I only\n" +
                    "B. II only\n" +
                    "C. I and II\n" +
                    "D. I, II, and III");
            add("What is the result of compiling and executing the following application?\n\n" +
                    "package forecast;\n" +
                    "public class Weather {\n" +
                    "  private static boolean heatWave = true;\n" +
                    "  public static void main() {\n" +
                    "    boolean heatWave = false;\n" +
                    "    System.out.print(heatWave);\n" +
                    "  }\n" +
                    "}\n\n" +
                    "A. true\n" +
                    "B. false\n" +
                    "C. It does not compile.\n" +
                    "D. It compiles but throws an error at runtime.");
            add("Given the following class diagram, which Java implementation most closely matches\n" +
                    "this structure?\n" +
                    "   ┌──────────────────┐\n" +
                    "   │      Book        │\n" +
                    "   ├──────────────────┤\n" +
                    "   │ + numberOfPages  │\n" +
                    "   ├──────────────────┤\n" +
                    "   │ + getRating()    │\n" +
                    "   └──────────────────┘\n" +
                    "A. public class Book {\n" +
                    "       public int numOfPages;\n" +
                    "B. public class Book {\n" +
                    "       public String getRating() {return null;} }\n" +
                    "C. public class Book {\n" +
                    "       public int numberOfPages;\n" +
                    "       public String getRating() {return null;} }\n" +
                    "D. public class Book {\n" +
                    "       void numberOfPages; }");
            add("Which statement about the JVM is true?\n" +
                    "A. The JVM schedules garbage collection on a predictable schedule.\n" +
                    "B. The JVM ensures that the application will always terminate.\n" +
                    "C. The JVM requires a properly defined entry point method to execute the application.\n" +
                    "D. A Java compiled code can be run on any computer.");

            /* Chapter 2*/
            add("Which of the following declarations does not compile?\n" +
                    "A. double num1, int num2 = 0;\n" +
                    "B. int num1, num2;\n" +
                    "C. int num1, num2 = 0;\n" +
                    "D. int num1 = 0, num2 = 0;");
            add("What is the output of the following?\n\n" +
                    "public static void main(String... args) {\n" +
                    "   String chair, table = \"metal\";\n" +
                    "   chair = chair + table;\n" +
                    "   System.out.println(chair);\n" +
                    "}\n\n" +
                    "A. metal\n" +
                    "B. metalmetal\n" +
                    "C. nullmetal\n" +
                    "D. The code does not compile.");
            add("Which is correct about an instance variable of type String?\n" +
                    "A. It defaults to an empty string.\n" +
                    "B. It defaults to null.\n" +
                    "C. It does not have a default value.\n" +
                    "D. It will not compile without initializing on the declaration line.");
            add("Which of the following is not a valid variable name?\n" +
                    "A. _blue\n" +
                    "B. 2blue\n" +
                    "C. blue$\n" +
                    "D. Blue");
            add("Which of these class names best follows standard Java naming conventions?\n" +
                    "A. fooBar\n" +
                    "B. FooBar\n" +
                    "C. FOO_BAR\n" +
                    "D. F_o_o_B_a_r");
            add("How many of the following methods compile?\n\n" +
                    "public String convert(int value) {\n" +
                    "   return value.toString();\n" +
                    "}\n" +
                    "public String convert(Integer value) {\n" +
                    "   return value.toString();\n" +
                    "}\n" +
                    "public String convert(Object value) {\n" +
                    "   return value.toString();\n" +
                    "}\n\n" +
                    "A. None\n" +
                    "B. One\n" +
                    "C. Two\n" +
                    "D. Three");
            add("Which of the following does not compile?\n" +
                    "A. int num = 999;\n" +
                    "B. int num = 9_9_9;\n" +
                    "C. int num = _9_99;\n" +
                    "D. None of the above; they all compile.");
            add("Which of the following is a wrapper class?\n" +
                    "A. int\n" +
                    "B. Int\n" +
                    "C. Integer\n" +
                    "D. Object");
            add("What is the result of running this code?\n\n" +
                    "public class Values {\n" +
                    "integer a = Integer.valueOf(\"1\");\n" +
                    "   public static void main(String[] nums) {\n" +
                    "       integer a = Integer.valueOf(\"2\");\n" +
                    "       integer b = Integer.valueOf(\"3\");\n" +
                    "       System.out.println(a + b);\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. 4\n" +
                    "B. 5\n" +
                    "C. The code does not compile.\n" +
                    "D. The code compiles but throws an exception at runtime.");
            add("Which best describes what the new keyword does?\n" +
                    "A. Creates a copy of an existing object and treats it as a new one\n" +
                    "B. Creates a new primitive\n" +
                    "C. Instantiates a new object\n" +
                    "D. Switches an object reference to a new one");
            add("Which is the first line to trigger a compiler error?\n" +
                    "double d1 = 5f; // p1\n" +
                    "double d2 = 5.0; // p2\n" +
                    "float f1 = 5f; // p3\n" +
                    "float f2 = 5.0; // p4\n" +
                    "A. p1\n" +
                    "B. p2\n" +
                    "C. p3\n" +
                    "D. p4");
            add("Which of the following lists of primitive types are presented in order from smallest to\n" +
                    "largest data type?\n" +
                    "A. byte, char, float, double\n" +
                    "B. byte, char, double, float\n" +
                    "C. char, byte, float, double\n" +
                    "D. char, double, float, bigint");
            add("Which of the following is not a valid order for elements in a class?\n" +
                    "A. Constructor, instance variables, method names\n" +
                    "B. Instance variables, constructor, method names\n" +
                    "C. Method names, instance variables, constructor\n" +
                    "D. None of the above: all orders are valid.");
            add("Which of the following lines contains a compiler error?\n" +
                    "String title = \"Weather\"; // line x1\n" +
                    "int hot, double cold; // line x2\n" +
                    "System.out.println(hot + \" \" + title); // line x3\n" +
                    "A. x1\n" +
                    "B. x2\n" +
                    "C. x3\n" +
                    "D. None of the above");
            add("How many instance initializers are in this code?\n\n" +
                    "1: public class Bowling {\n" +
                    "2:     { System.out.println(); }\n" +
                    "3:     public Bowling () {\n" +
                    "4:     System.out.println();\n" +
                    "5:     }\n" +
                    "6:     static { System.out.println(); }\n" +
                    "7:     { System.out.println(); }\n" +
                    "8: }\n\n" +
                    "A. None\n" +
                    "B. One\n" +
                    "C. Two\n" +
                    "D. Three");
            add("Of the types double, int, and short, how many could fill in the blank to have this code\n" +
                    "output 0?\n\n" +
                    "public static void main(String[] args) {\n" +
                    "   _______defaultValue;\n" +
                    "   System.out.println(defaultValue);\n" +
                    "}\n\n" +
                    "A. None\n" +
                    "B. One\n" +
                    "C. Two\n" +
                    "D. Three");
            add("What is true of the finalize() method?\n" +
                    "A. It may be called zero or one times.\n" +
                    "B. It may be called zero or more times.\n" +
                    "C. It will be called exactly once.\n" +
                    "D. It may be called one or more times.");
            add("Which of the following is not a wrapper class?\n" +
                    "A. Double\n" +
                    "B. Integer\n" +
                    "C. Long\n" +
                    "D. String");
            add("Suppose you have the following code. Which of the images best represents the state of\n" +
                    "the references right before the end of the main method, assuming garbage collection\n" +
                    "hasn’t run?\n\n" +
                    "1: public class Link {\n" +
                    "2:     private String name;\n" +
                    "3:     private Link next;\n" +
                    "4:     public Link(String name, Link next) {\n" +
                    "5:         this.name = name;\n" +
                    "6:         this.next = next;\n" +
                    "7:     }\n" +
                    "8:     public void setNext(Link next) {\n" +
                    "9:         this.next = next;\n" +
                    "10:    }\n" +
                    "11:    public Link getNext() {\n" +
                    "12:        return next;\n" +
                    "13:    }\n" +
                    "14:    public static void main(String... args) {\n" +
                    "15:        Link link1 = new Link(\"x\", null);\n" +
                    "16:        Link link2 = new Link(\"y\", link1);\n" +
                    "17:        Link link3 = new Link(\"z\", link2);\n" +
                    "18:        link2.setNext(link3);\n" +
                    "19:        link3.setNext(link2);\n" +
                    "20:        link1 = null;\n" +
                    "21:        link3 = null;\n" +
                    "22:    }\n" +
                    "23: }\n" +
                    "\n" +
                    "A: \n" +
                    "┌─────────────────────────────────┐\n" +
                    "│link1 │          ┌───┐           │\n" +
                    "│      ├────────► │ x │           │\n" +
                    "│      │          └───┘           │\n" +
                    "│link3 │                          │\n" +
                    "│                                 │\n" +
                    "│              ┌───┐        ┌───┐ │\n" +
                    "│link2───────► │ y │  ◄───► │ z │ │\n" +
                    "│              └───┘        └───┘ │\n" +
                    "└─────────────────────────────────┘\n\n" +
                    "B: \n" +
                    "┌─────────────────────────────────┐\n" +
                    "│link1 │                    ┌───┐ │\n" +
                    "│      ├──────► null        │ x │ │\n" +
                    "│      │                    └───┘ │\n" +
                    "│link3 │                          │\n" +
                    "│                                 │\n" +
                    "│              ┌───┐        ┌───┐ │\n" +
                    "│link2───────► │ y │   ───► │ z │ │\n" +
                    "│              └───┘        └───┘ │\n" +
                    "└─────────────────────────────────┘\n\n" +
                    "C: \n" +
                    "┌─────────────────────────────────┐\n" +
                    "│link1 │                    ┌───┐ │\n" +
                    "│      ├──────► null        │ x │ │\n" +
                    "│      │                    └───┘ │\n" +
                    "│link3 │                          │\n" +
                    "│                                 │\n" +
                    "│              ┌───┐        ┌───┐ │\n" +
                    "│link2───────► │ y │  ◄───► │ z │ │\n" +
                    "│              └───┘        └───┘ │\n" +
                    "└─────────────────────────────────┘\n\n" +
                    "D: \n" +
                    "┌─────────────────────────────────┐\n" +
                    "│link1 │                    ┌───┐ │\n" +
                    "│      ├──────► null        │ x │ │\n" +
                    "│      │                    └───┘ │\n" +
                    "│link3 │                          │\n" +
                    "│                                 │\n" +
                    "│              ┌───┐        ┌───┐ │\n" +
                    "│link2───────► │ y │        │ z │ │\n" +
                    "│              └───┘        └───┘ │\n" +
                    "└─────────────────────────────────┘\n\n");
            add("Which type can fill in the blank?\n" +
                    "_______ pi = 3.14;\n" +
                    "A. byte\n" +
                    "B. float\n" +
                    "C. double\n" +
                    "D. short");
            add("What is the first line in the following code to not compile?\n\n" +
                    "public static void main(String[] args) {\n" +
                    "   int Integer = 0; // k1\n" +
                    "   Integer int = 0; // k2\n" +
                    "   Integer ++;      // k3\n" +
                    "   int++;           // k4\n" +
                    "}\n\n" +
                    "A. k1\n" +
                    "B. k2\n" +
                    "C. k3\n" +
                    "D. k4");
            add("Suppose foo is a reference to an instance of a class. Which of the following is not true\n" +
                    "about foo.bar?\n" +
                    "A. bar is an instance variable.\n" +
                    "B. bar is a local variable.\n" +
                    "C. It can be used to read from bar.\n" +
                    "D. It can be used to write to bar.");
            add("Which of the following is not a valid class declaration?\n" +
                    "A. class building {}\n" +
                    "B. class Cost$ {}\n" +
                    "C. class 5MainSt {}\n" +
                    "D. class _Outside {}");
            add("Which of the following can fill in the blanks to make this code compile?\n" +
                    "_______d = new_______ (1_000_000_.00);\n" +
                    "A. double, double\n" +
                    "B. double, Double\n" +
                    "C. Double, double\n" +
                    "D. None of the above");
            add("Which is correct about a local variable of type String?\n" +
                    "A. It defaults to an empty string.\n" +
                    "B. It defaults to null.\n" +
                    "C. It does not have a default value.\n" +
                    "D. It will not compile without initializing on the declaration line.");
            add("Of the types double, int, long, and short, how many could fill in the blank to have this\n" +
                    "code output 0?\n\n" +
                    "static _______defaultValue;\n\n" +
                    "   public static void main(String[] args) {\n" +
                    "       System.out.println(defaultValue);\n" +
                    "   }\n\n" +
                    "A. One\n" +
                    "B. Two\n" +
                    "C. Three\n" +
                    "D. Four");
            add("Which of the following is true about primitives?\n" +
                    "A. You can call methods on a primitive.\n" +
                    "B. You can convert a primitive to a wrapper class object simply by assigning it.\n" +
                    "C. You can convert a wrapper class object to a primitive by calling valueOf().\n" +
                    "D. You can store a primitive directly into an ArrayList.");
            add("What is the output of the following?\n\n" +
                    "Integer integer = new Integer(4);\n" +
                    "System.out.print(integer.byteValue());\n\n" +
                    "System.out.print(\"-\");\n\n" +
                    "int i = new Integer(4);\n" +
                    "System.out.print(i.byteValue());\n\n" +
                    "A. 4-0\n" +
                    "B. 4-4\n" +
                    "C. The code does not compile.\n" +
                    "D. The code compiles but throws an exception at runtime.");
            add("Given the following code, fill in the blank to have the code print bounce.\n\n" +
                    "public class TennisBall {\n" +
                    "   public TennisBall() {\n" +
                    "       System.out.println(\"bounce\");\n" +
                    "   }\n" +
                    "   public static void main(String[] slam) {\n" +
                    "       _____________________\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. TennisBall;\n" +
                    "B. TennisBall();\n" +
                    "C. new TennisBall;\n" +
                    "D. new TennisBall();");
            add("Which of the following correctly assigns animal to both variables?\n\n" +
                    "I. String cat = \"animal\", dog = \"animal\";\n" +
                    "II. String cat = \"animal\"; dog = \"animal\";\n" +
                    "III. String cat, dog = \"animal\";\n" +
                    "IV. String cat, String dog = \"animal\";\n\n" +
                    "A. I\n" +
                    "B. I, II\n" +
                    "C. I, III\n" +
                    "D. I, II, III, IV");
            add("Which two primitives have wrapper classes that are not merely the name of the\n" +
                    "primitive with an uppercase letter?\n" +
                    "A. byte and char\n" +
                    "B. byte and int\n" +
                    "C. char and int\n" +
                    "D. None of the above");
            add("Which of the following is true about String instance variables?\n" +
                    "A. They can be set to null.\n" +
                    "B. They can never be set from outside the class they are defined in.\n" +
                    "C. They can only be set in the constructor.\n" +
                    "D. They can only be set once per run of the program.");
            add("Which statement is true about primitives?\n" +
                    "A. Primitive types begin with a lowercase letter.\n" +
                    "B. Primitive types can be set to null.\n" +
                    "C. String is a primitive.\n" +
                    "D. You can create your own primitive types.");
            add("How do you force garbage collection to occur at a certain point?\n" +
                    "A. Call System.forceGc()\n" +
                    "B. Call System.gc()\n" +
                    "C. Call System.requireGc()\n" +
                    "D. None of the above");
            add("How many of the String objects are eligible for garbage collection right before the end\n" +
                    "of the main method?\n\n" +
                    "public static void main(String[] fruits) {\n" +
                    "   String fruit1 = new String(\"apple\");\n" +
                    "   String fruit2 = new String(\"orange\");\n" +
                    "   String fruit3 = new String(\"pear\");\n" +
                    "   fruit3 = fruit1;\n" +
                    "   fruit2 = fruit3;\n" +
                    "   fruit1 = fruit2;\n" +
                    "}\n\n" +
                    "A. None\n" +
                    "B. One\n" +
                    "C. Two\n" +
                    "D. Three");
            add("Which of the following can fill in the blanks to make this code compile?\n" +
                    "_______d = new_______ (1_000_000.00);\n" +
                    "A. double, double\n" +
                    "B. double, Double\n" +
                    "C. Double, double\n" +
                    "D. None of the above");
            add("What does the following output?\n\n" +
                    "1: public class InitOrder {\n" +
                    "2:     public String first = \"instance\";\n" +
                    "3:     public InitOrder() {\n" +
                    "4:         first = \"constructor\";\n" +
                    "5:     }\n" +
                    "6:     { first = \"block\"; }\n" +
                    "7:     public void print() {\n" +
                    "8:         System.out.println(first);\n" +
                    "9:     }\n" +
                    "10:    public static void main(String... args) {\n" +
                    "11:        new InitOrder().print();\n" +
                    "12:    }\n" +
                    "13: }\n\n" +
                    "A. block\n" +
                    "B. constructor\n" +
                    "C. instance\n" +
                    "D. The code does not compile.");
            add("How many of the following lines compile?\n" +
                    "int i = null;\n" +
                    "Integer in = null;\n" +
                    "String s = null;\n" +
                    "A. None\n" +
                    "B. One\n" +
                    "C. Two\n" +
                    "D. Three");
            add("Which pairs of statements can accurately fill in the blanks in this table?\n" +
                    "┌──────────────┬────────────────────────────────────────────────────────┐\n" +
                    "│Variable Type │Can be called within the class from what type of method │\n" +
                    "├──────────────┼────────────────────────────────────────────────────────┤\n" +
                    "│Instance      │Blank 1:_________                                       │\n" +
                    "├──────────────┼────────────────────────────────────────────────────────┼\n" +
                    "│Static        │Blank 2:_________                                       │\n" +
                    "└──────────────┴────────────────────────────────────────────────────────┘\n\n" +
                    "A. Blank 1: an instance method only, Blank 2: a static method only\n" +
                    "B. Blank 1: an instance or static method, Blank 2: a static method only\n" +
                    "C. Blank 1: an instance method only, Blank 2: an instance or static method\n" +
                    "D. Blank 1: an instance or static method, Blank 2: an instance or static method");
            add("Which of the following does not compile?\n" +
                    "A. double num = 2.718;\n" +
                    "B. double num = 2._718;\n" +
                    "C. double num = 2.7_1_8;\n" +
                    "D. None of the above; they all compile.");
            add("Which of the following lists of primitive numeric types is presented in order from\n" +
                    "smallest to largest data type?\n" +
                    "A. byte, short, int, long\n" +
                    "B. int, short, byte, long\n" +
                    "C. short, byte, int, long\n" +
                    "D. short, int, byte, long");
            add("Fill in the blank to make the code compile:\n\n" +
                    "package animal;\n" +
                    "public class Cat {\n" +
                    "   public String name;\n" +
                    "   public static void main(String[] meow) {\n" +
                    "       Cat cat = new Cat();\n" +
                    "       ______________ = \"Sadie\";\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. cat.name\n" +
                    "B. cat-name\n" +
                    "C. cat.setName\n" +
                    "D. cat[name]");
            add("Which of the following is the output of this code, assuming it runs to completion?\n\n" +
                    "package store;\n" +
                    "public class Toy {\n" +
                    "   public void play() {\n" +
                    "       System.out.print(\"play-\");\n" +
                    "   }\n" +
                    "   public void finalizer() {\n" +
                    "       System.out.print(\"clean-\");\n" +
                    "   }\n" +
                    "   public static void main(String[] fun) {\n" +
                    "       Toy car = new Toy();\n" +
                    "       car.play();\n" +
                    "       System.gc();\n" +
                    "       Toy doll = new Toy();\n" +
                    "       doll.play();\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. play-\n" +
                    "B. play-play-\n" +
                    "C. play-clean-play-\n" +
                    "D. play-play-clean-clean-");
            add("Which is the most common way to fill in the blank to implement this method?\n\n" +
                    "public class Penguin {\n" +
                    "   private double beakLength;\n" +
                    "       public static void setBeakLength(Penguin p, int b) {\n" +
                    "       _____________________________\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. p.beakLength = b;\n" +
                    "B. p['beakLength'] = b;\n" +
                    "C. p[beakLength] = b;\n" +
                    "D. None of the above");
            add("Fill in the blanks to indicate whether a primitive or wrapper class can be assigned\n" +
                    "without the compiler using the autoboxing feature.\n" +
                    "_______first = Integer.parseInt(\"5\");\n" +
                    "_______second = Integer.valueOf(\"5\");\n" +
                    "A. int, int\n" +
                    "B. int, Integer\n" +
                    "C. Integer, int\n" +
                    "D. Integer, Integer");
            add("How many objects are eligible for garbage collection right before the end of the main method?\n\n" +
                    "1: public class Person {\n" +
                    "2:     public Person youngestChild;\n" +
                    "3:\n" +
                    "4:     public static void main(String... args) {\n" +
                    "5:         Person elena = new Person();\n" +
                    "6:         Person diana = new Person();\n" +
                    "7:         elena.youngestChild = diana;\n" +
                    "8:         diana = null;\n" +
                    "9:         Person zoe = new Person();\n" +
                    "10:        elena.youngestChild = zoe;\n" +
                    "11:        zoe = null;\n" +
                    "12:    }\n" +
                    "13: }\n\n" +
                    "A. None\n" +
                    "B. One\n" +
                    "C. Two\n" +
                    "D. Three");
            add("Which is a valid constructor for this class?\n\n" +
                    "public class TennisBall {\n" +
                    "}\n\n" +
                    "A. public TennisBall static create() { return new TennisBall(); }\n" +
                    "B. public TennisBall static newInstance() { return new TennisBall():}\n" +
                    "C. public TennisBall() {}\n" +
                    "D. public void TennisBall() {}");
            add("Which of the following is not a possible output of this code, assuming it runs to\n" +
                    "completion?\n\n" +
                    "package store;\n" +
                    "public class Toy {\n" +
                    "   public void play() {\n" +
                    "       System.out.print(\"play-\");\n" +
                    "   }\n" +
                    "   public void finalize() {\n" +
                    "       System.out.print(\"clean-\");\n" +
                    "   }\n" +
                    "   public static void main(String[] args) {\n" +
                    "       Toy car = new Toy();\n" +
                    "       car.play();\n" +
                    "       System.gc();\n" +
                    "       Toy doll = new Toy();\n" +
                    "       doll.play();\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. play-\n" +
                    "B. play-play-\n" +
                    "C. play-play-clean-\n" +
                    "D. play-play-clean-clean-");
            add("Which converts a primitive to a wrapper class object without using autoboxing?\n" +
                    "A. Call the asObject() method\n" +
                    "B. Call the constructor of the wrapper class\n" +
                    "C. Call the convertToObject() method\n" +
                    "D. Call the toObject() method");
            add("What is the output of the following?\n\n" +
                    "package beach;\n" +
                    "public class Sand {\n" +
                    "   public Sand() {\n" +
                    "       System.out.print(\"a\");\n" +
                    "   }\n" +
                    "   public void Sand() {\n" +
                    "       System.out.print(\"b\");\n" +
                    "   }\n" +
                    "   public void run() {\n" +
                    "       new Sand();\n" +
                    "       Sand();\n" +
                    "   }\n" +
                    "   public static void main(String... args) {\n" +
                    "       new Sand().run();\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. a\n" +
                    "B. ab\n" +
                    "C. aab\n" +
                    "D. None of the above");
            /* Chapter 3 */
            add("Which of the following variable types is not permitted in a switch statement?\n" +
                    "A. String\n" +
                    "B. double\n" +
                    "C. int\n" +
                    "D. char");
            add("What is the value of tip after executing the following code snippet?\n" +
                    "int meal = 5;\n" +
                    "int tip = 2;\n" +
                    "int total = meal + (meal>6 ? ++tip : tip);\n" +
                    "A. 1\n" +
                    "B. 2\n" +
                    "C. 3\n" +
                    "D. 6");
            add("What is the output of the following application?\n\n" +
                    "package registration;\n" +
                    "public class NameCheck {\n" +
                    "   public static void main(String... data) {\n" +
                    "       String john = \"john\";\n" +
                    "       String jon = new String(john);\n" +
                    "       System.out.print((john==jon)+\" \"+(john.equals(jon)));\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. true true\n" +
                    "B. true false\n" +
                    "C. false true\n" +
                    "D. false false");
            add("What is the output of the following application?\n\n" +
                    "package planning;\n" +
                    "public class ThePlan {\n" +
                    "   public static void main(String[] input) {\n" +
                    "       int plan = 1;\n" +
                    "       plan = plan++ + --plan;\n" +
                    "       if(plan==1) {\n" +
                    "           System.out.print(\"Plan A\");\n" +
                    "       } else { if(plan==2) System.out.print(\"Plan B\");\n" +
                    "       } else System.out.print(\"Plan C\");\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. Plan A\n" +
                    "B. Plan B\n" +
                    "C. Plan C\n" +
                    "D. None of the above");
            add("Which of the following statements about a default branch in a switch statement is\n" +
                    "correct?\n" +
                    "A. All switch statements must include a default statement.\n" +
                    "B. The default statement is required to be placed after all case statements.\n" +
                    "C. Unlike a case statement, the default statement does not take a value.\n" +
                    "D. A default statement can only be used when at least one case statement is present.");
            add("What is the value of thatNumber after the execution of the following code snippet?\n\n" +
                    "long thatNumber = 5 >= 5 ? 1+2 : 1*1;\n" +
                    "if(++thatNumber < 4)\n" +
                    "   thatNumber += 1;\n\n" +
                    "A. 3\n" +
                    "B. 4\n" +
                    "C. 5\n" +
                    "D. The answer cannot be determined until runtime.");
            add("Which statement immediately exits a switch statement, skipping all remaining case or\n" +
                    "default branches?\n" +
                    "A. exit\n" +
                    "B. break\n" +
                    "C. goto\n" +
                    "D. continue");
            add("Which statement about ternary expressions is true?\n" +
                    "A. In some cases, both expressions to the right of the conditional operator in a ternary\n" +
                    "expression will be evaluated at runtime.\n" +
                    "B. Ternary expressions require parentheses for proper evaluation.\n" +
                    "C. The ternary expressions are a convenient replacement for an if-then-else\n" +
                    "statement.\n" +
                    "D. Ternary expressions support int and boolean expressions for the left-most\n" +
                    "operand.");
            add("What is the output of the following application?\n" +
                    "package voting;\n\n" +
                    "1: public class Election {\n" +
                    "2:     public void calculateResult(Integer candidateA, Integer candidateB) {\n" +
                    "3:         boolean process = candidateA == null || candidateA.intValue() < 10;\n" +
                    "4:         boolean value = candidateA && candidateB;\n" +
                    "5:         System.out.print(process || value);\n" +
                    "6:     }\n" +
                    "7:     public static void main(String[] unused) {\n" +
                    "8:         new Election().calculateResult(null,203);\n" +
                    "9:     }\n" +
                    "10: }\n\n" +
                    "A. true\n" +
                    "B. false\n" +
                    "C. The code does not compile.\n" +
                    "D. The code compiles but throws a NullPointerException on line 3 at runtime.");
            add("What is the output of the following application?\n\n" +
                    "package dinosaur;\n" +
                    "public class Park {\n" +
                    "   public final static void main(String... arguments) {\n" +
                    "       int pterodactyl = 6;\n" +
                    "       long triceratops = 3;\n" +
                    "       if(pterodactyl % 3 >= 1)\n" +
                    "           triceratops++;\n" +
                    "           triceratops--;\n" +
                    "       System.out.print(triceratops);\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. 2\n" +
                    "B. 3\n" +
                    "C. 4\n" +
                    "D. The code does not compile.");
            add("Which statement about if-then statements is true?\n" +
                    "A. An if-then statement is required to have an else statement.\n" +
                    "B. If the boolean test of an if-then statement evaluates to false, then the target clause\n" +
                    "   of the if-then statement will still be evaluated.\n" +
                    "C. An if-then statement is required to cast an object.\n" +
                    "D. An if-then statement can execute a single statement or a block {}.");
            add("What is the output of the following application?\n\n" +
                    "package restaurant;\n" +
                    "public class Pieces {\n" +
                    "   public static void main(String[] info) {\n" +
                    "       int flair = 15;\n" +
                    "       if(flair >= 15 && flair < 37) {\n" +
                    "           System.out.print(\"Not enough\");\n" +
                    "       } if(flair==37) {\n" +
                    "           System.out.print(\"Just right\");\n" +
                    "       } else {\n" +
                    "           System.out.print(\"Too many\");\n" +
                    "       }\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. Not enough\n" +
                    "B. Just right\n" +
                    "C. Too many\n" +
                    "D. None of the above");
            add("Which statement about case statements of a switch statement is not true?\n" +
                    "A. A case value can be final.\n" +
                    "B. A case statement must be terminated with a break statement.\n" +
                    "C. A case value can be a literal expression.\n" +
                    "D. A case value must match the data type of the switch variable, or be able to be\n" +
                    "promoted to that type.");
            add("Given the following truth table, which operator for the boolean expressions x and y\n" +
                    "corresponds to this relationship?\n" +
                    "┌──────────┬─────────┬───────────┐\n" +
                    "│          │ x = true│ x = false │\n" +
                    "├──────────┼─────────┼───────────┤\n" +
                    "│ y = true │ true    │ false     │\n" +
                    "├──────────┼─────────┼───────────┤\n" +
                    "│ y = false│ false   │ false     │\n" +
                    "└──────────┴─────────┴───────────┘\n\n" +
                    "A. --\n" +
                    "B. ++\n" +
                    "C. ||\n" +
                    "D. &&");
            add("What is the output of the following code snippet?\n\n" +
                    "int hops = 0;\n" +
                    "int jumps = 0;\n" +
                    "jumps = hops++;\n" +
                    "if(jumps)\n" +
                    "   System.out.print(\"Jump!\");\n" +
                    "else\n" +
                    "   System.out.print(\"Hop!\");\n\n" +
                    "A. Jump!\n" +
                    "B. Hop!\n" +
                    "C. The code does not compile.\n" +
                    "D. The code compiles but throws an exception at runtime.");
            add("Fill in the blanks: The _____________ operator increases the value of a variable by\n" +
                    "1 and returns the new value, while the _____________ operator decreases the\n" +
                    "value of a variable by 1 and returns the original value.\n" +
                    "A. pre-increment [++v], pre-decrement [--v]\n" +
                    "B. pre-increment [++v], post-decrement [v--]\n" +
                    "C. post-increment [v++], pre-decrement [--v]\n" +
                    "D. post-increment [v++], post-decrement [v--]");
            add("What is the output of the following application?\n" +
                    "package jungle;\n\n" +
                    "public class TheBigRace {\n" +
                    "   public static void main(String[] in) {\n" +
                    "       int tiger = 2;\n" +
                    "       short lion = 3;\n" +
                    "       long winner = lion+2*(tiger + lion);\n" +
                    "       System.out.print(winner);\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. 11\n" +
                    "B. 13\n" +
                    "C. 25\n" +
                    "D. None of the above");
            add("Given the following code snippet, assuming dayOfWeek is an int, what variable type of\n\n" +
                    "saturday is not permitted?\n" +
                    "final _________ saturday = 6;\n" +
                    "switch(dayOfWeek) {\n" +
                    "   default:\n" +
                    "       System.out.print(\"Another Weekday\");\n" +
                    "       break;\n" +
                    "   case saturday:\n" +
                    "       System.out.print(\"Weekend!\");\n" +
                    "}\n\n" +
                    "A. byte\n" +
                    "B. long\n" +
                    "C. int\n" +
                    "D. None of the above");
            add("Given the following code snippet, what is the value of dinner after it is executed?\n" +
                    "int time = 11;\n" +
                    "int day = 4;\n" +
                    "String dinner = time > 10 ? day ? \"Takeout\" : \"Salad\" : \"Leftovers\";\n" +
                    "A. Takeout\n" +
                    "B. Salad\n" +
                    "C. The code does not compile but would compile if parentheses were added.\n" +
                    "D. None of the above");
            add("What is the output of the following application?\n\n" +
                    "package recreation;\n" +
                    "public class Dancing {\n" +
                    "   public static void main(String[] vars) {\n" +
                    "       int leaders = 10 * (2 + (1 + 2 / 5);\n" +
                    "       int followers = leaders * 2;\n" +
                    "       System.out.print(leaders + followers < 10 ? \"Too few\" : \"Too many\");\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. Too few\n" +
                    "B. Too many\n" +
                    "C. The code does not compile.\n" +
                    "D. The code compiles but throws a division by zero error at runtime.");
            add("What is the output of the following application?\n\n" +
                    "package schedule;\n" +
                    "public class PrintWeek {\n" +
                    "   public static final void main(String[] days) {\n" +
                    "       System.out.print(5 + 6 + \"7\" + 8 + 9);\n" +
                    "   }\n" +
                    "}\n" +
                    "A. 56789\n" +
                    "B. 11789\n" +
                    "C. 11717\n" +
                    "D. The code does not compile.");
            add("Fill in the blanks: The______________ operator is used to find the difference\n" +
                    "between two numbers, while the______________ operator is used to find the\n" +
                    "remainder when one number is divided by another.\n" +
                    "A. /, %\n" +
                    "B. –, %\n" +
                    "C. %, <\n" +
                    "D. –, ||");
            add("What is the output of the following application?\n\n" +
                    "package transporter;\n" +
                    "public class Rematerialize {\n" +
                    "   public static void main(String[] input) {\n" +
                    "       int dog = 11;\n" +
                    "       int cat = 3;\n" +
                    "       int partA = dog / cat;\n" +
                    "       int partB = dog % cat;\n" +
                    "       int newDog = partB + partA * cat;\n" +
                    "       System.out.print(newDog);\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. 9\n" +
                    "B. 11\n" +
                    "C. 15\n" +
                    "D. The code does not compile.");
            add("What is the output of the following application?\n\n" +
                    "package dessert;\n" +
                    "public class IceCream {\n" +
                    "   public final static void main(String... args) {\n" +
                    "       int flavors = 30;\n" +
                    "       int eaten = 0;\n" +
                    "       switch(flavors) {\n" +
                    "           case 30: eaten++;\n" +
                    "           case 40: eaten+=2;\n" +
                    "           default: eaten--;\n" +
                    "       }\n" +
                    "       System.out.print(eaten);\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. 1\n" +
                    "B. 2\n" +
                    "C. 3\n" +
                    "D. The code does not compile.");
            add("What is the output of the following application?\n\n" +
                    "package mode;\n" +
                    "public class Transportation {\n" +
                    "   public static String travel(int distance) {\n" +
                    "       return distance<1000 ? \"train\" : 10;\n" +
                    "   }\n" +
                    "   public static void main(String[] answer) {\n" +
                    "       System.out.print(travel(500));\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. train\n" +
                    "B. 10\n" +
                    "C. The code does not compile.\n" +
                    "D. The code compiles but throws an exception at runtime.");
            add("Fill in the blanks: Given two non-null String objects with reference names\n" +
                    "apples______________ and oranges, if apples oranges evaluates to true, then\n" +
                    "apples______________ oranges must also evaluate to true.\n" +
                    "A. ==, equals()\n" +
                    "B. !=, equals()\n" +
                    "C. equals(), ==\n" +
                    "D. equals(), =!");
            add("For a given non-null String myTestVariable, what is the resulting value of executing\n" +
                    "the statement myTestVariable.equals(null)?\n" +
                    "A. true\n" +
                    "B. false\n" +
                    "C. The statement does not compile.\n" +
                    "D. The statement compiles but will produce an exception when used at runtime.");
            add("How many 1s are outputted when the following application is compiled and run?\n" +
                    "package city;\n" +
                    "public class Road {\n" +
                    "   public static void main(String... in) {\n" +
                    "       int intersections = 100;\n" +
                    "       int streets = 200;\n" +
                    "       if (intersections < 150) {\n" +
                    "           System.out.print(\"1\");\n" +
                    "       } else if (streets && intersections > 1000) {\n" +
                    "           System.out.print(\"2\");\n" +
                    "       } if (streets < 500)\n" +
                    "           System.out.print(\"1\");\n" +
                    "       else\n" +
                    "           System.out.print(\"2\");\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. None\n" +
                    "B. One\n" +
                    "C. Two\n" +
                    "D. The code does not compile.");
            add("Which statement about the logical operators & and && is true?\n" +
                    "A. The & and && operators are interchangeable, always producing the same results at\n" +
                    "runtime.\n" +
                    "B. The & operator always evaluates both operands, while the && operator may only\n" +
                    "evaluate the left operand.\n" +
                    "C. Both expressions evaluate to true if either operand is true.\n" +
                    "D. The & operator always evaluates both operands, while the && operator may only\n" +
                    "evaluate the right operand.");
            add("What is the output of the following code snippet?\n" +
                    "int x = 10, y = 5;\n" +
                    "boolean w = true, z = false;\n" +
                    "x = w ? y++ : y--;\n" +
                    "w = !z;\n" +
                    "System.out.print((x+y)+\" \"+(w ? 5 : 10));\n" +
                    "A. The code does not compile.\n" +
                    "B. 10 10\n" +
                    "C. 11 5\n" +
                    "D. 12 5");
            add("What is the output of the following application?\n\n" +
                    "package bob;\n" +
                    "public class AreYouBob {\n" +
                    "   public static void main(String[] unused) {\n" +
                    "       String bob = new String(\"bob\");\n" +
                    "       String notBob = bob;\n" +
                    "       System.out.print((bob==notBob)+\" \"+(bob.equals(notBob)));\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. true true\n" +
                    "B. true false\n" +
                    "C. false true\n" +
                    "D. false false");
            add("What is the value of 12 + 6 * 3 % (1 + 1) in Java?\n" +
                    "A. 0\n" +
                    "B. 12\n" +
                    "C. 14\n" +
                    "D. None of the above");
            add("Given the following truth table, the boolean variables p and q, and the expression p ^\n" +
                    "q, what are the missing values in the truth table, starting with the first column?\n" +
                    "┌──────────┬─────────┬───────────┐\n" +
                    "│          │ p = true│ p = false │\n" +
                    "├──────────┼─────────┼───────────┤\n" +
                    "│ q = true │ true    │ false     │\n" +
                    "├──────────┼─────────┼───────────┤\n" +
                    "│ q = false│ false   │ false     │\n" +
                    "└──────────┴─────────┴───────────┘\n" +
                    "A. false and true\n" +
                    "B. false and false\n" +
                    "C. true and true\n" +
                    "D. true and false");
            add("Which of the following is not a possible result of executing the following application?\n\n" +
                    "public class ConditionallyLogical {\n" +
                    "   public static void main(String... data) {\n" +
                    "       if(data.length>=1\n" +
                    "           && (data[0].equals(\"sound\") || data[0].equals (\"logic\"))\n" +
                    "           && data.length<2) {\n" +
                    "       System.out.print(data[0]);\n" +
                    "       }\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. Nothing is printed.\n" +
                    "B. sound is printed.\n" +
                    "C. The application throws an exception at runtime.\n" +
                    "D. logic is printed.");
            add("Fill in the blanks: The operators +,______________ ,______________\n" +
                    ",______________ , and ++ are listed in the same or increasing level of operator\n" +
                    "precedence.\n" +
                    "A. *, --, /\n" +
                    "B. %, -, *\n" +
                    "C. /, *, %\n" +
                    "D. *, -, /");
            add("What statement about the ^ operator is correct?\n" +
                    "A. If one of the operands of ^ is true, then the result is always true.\n" +
                    "B. There is a conditional form of the operator, denoted as ^^.\n" +
                    "C. If both operands of ^ are true, the result is true.\n" +
                    "D. The ^ operator can only be applied to boolean values.");
            add(    "Given the following Venn diagram and the variables, x, y, and z, which Java expression\n" +
                    "most closely represents the filled-in region of the diagram?\n" +
                    "        , - ~ ~ ~ - ,          , - ~ ~ ~ - ,\n" +
                    " X   , '               ' ,  , '             ',  Y\n" +
                    "   ,                      ,,                  ,\n" +
                    "  ,                      ,  ,                  ,\n" +
                    " ,                     ,      ,                 ,\n" +
                    " ,                     ,      ,                 ,\n" +
                    " ,                 , - , ~ ~ ~, - ,             ,\n" +
                    "  ,              ,'     ,    ,     ',           ,\n" +
                    "   ,            ,        , ,         ,        ,\n" +
                    "     ,         ,        , ' ,         ,       ,\n" +
                    "       ' - , _,_ _ ,  '      ' - , _ _, _ ,  '\n" +
                    "              ,                         , \n" +
                    "              ,                         ,\n" +
                    "              ,                         ,\n" +
                    "                 ,                  , '\n" +
                    "                   ' - , _ _ _ ,  '   Z\n\n" +
                    "A. x || z\n" +
                    "B. y || (y && z)\n" +
                    "C. x || y\n" +
                    "D. y && x ");
            add("What variable type of red allows the following application to compile?\n" +
                    "package tornado;\n" +
                    "public class Kansas {\n" +
                    "   public static void main(String[] args) {\n" +
                    "       int colorOfRainbow = 10;\n" +
                    "       ________ red = 5;\n" +
                    "       switch(colorOfRainbow) {\n" +
                    "       default:\n" +
                    "           System.out.print(\"Home\");\n" +
                    "           break;\n" +
                    "       case red:\n" +
                    "           System.out.print(\"Away\");\n" +
                    "       }\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. long\n" +
                    "B. double\n" +
                    "C. int\n" +
                    "D. None of the above");
            add("Which two operators would be used to test if a number is equal to or greater than 5.21\n" +
                    "but strictly less than 8.1?\n" +
                    "A. > and <=\n" +
                    "B. >= and >\n" +
                    "C. < and >=\n" +
                    "D. < and >");
            add("What is the output of the following application?\n\n" +
                    "package transporter;\n" +
                    "public class TurtleVsHare {\n" +
                    "   public static void main(String[] arguments) {\n" +
                    "       int turtle = 10 * (2 + (3 + 2) / 5);\n" +
                    "       int hare = turtle < 5 ? 10 : 25;\n" +
                    "       System.out.print(turtle < hare ? \"Hare wins!\" : \"Turtle wins!\");\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. Hare wins!\n" +
                    "B. Turtle wins!\n" +
                    "C. The code does not compile.\n" +
                    "D. The code compiles but throws a division by zero error at runtime.");
            add("What is the output of the following application?\n\n" +
                    "public class CountEntries {\n" +
                    "   public static int getResult(int threshold) {\n" +
                    "       return threshold > 5 ? 1 : 0;\n" +
                    "   }\n" +
                    "   public static final void main(String[] days) {\n" +
                    "       System.out.print(getResult(5)+getResult(1)\n" +
                    "          +getResult(0)+getResult(2)+\"\");\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. 0\n" +
                    "B. 1\n" +
                    "C. 0000\n" +
                    "D. 1000");
            add("What is the output of the following application?\n\n" +
                    "package yoyo;\n" +
                    "public class TestGame {\n" +
                    "   public String runTest(boolean spinner, boolean roller) {\n" +
                    "       if(spinner = roller) return \"up\";\n" +
                    "       else return roller ? \"down\" : \"middle\";\n" +
                    "   }\n" +
                    "   public static final void main(String pieces[]) {\n" +
                    "       final TestGame tester = new TestGame();\n" +
                    "       System.out.println(tester.runTest(false,true));\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. up\n" +
                    "B. middle\n" +
                    "C. down\n" +
                    "D. The code does not compile.");
            add("Fill in the blanks: The______________ operator is true if either of the operands\n" +
                    "are true, while the______________ operator flips a boolean value.\n" +
                    "A. +, -\n" +
                    "B. &&, !\n" +
                    "C. |, -\n" +
                    "D. ||, !");
            add("Given the following code snippet, what is the value of movieRating after it is executed?\n" +
                    "int characters = 5;\n" +
                    "int story = 3;\n" +
                    "double movieRating = characters <= 4 ? 3 : story>1 ? 2 : 1;\n" +
                    "A. 2.0\n" +
                    "B. 3.0\n" +
                    "C. The code does not compile but would compile if parentheses were added.\n" +
                    "D. None of the above");
            add("Fill in the blanks: A switch statement can have______________ case statements\n" +
                    "and______________ default statements.\n" +
                    "A. at most one, at least one\n" +
                    "B. any number of, at most one\n" +
                    "C. at least one, any number of\n" +
                    "D. at least one, at most one");
            add("Which of the following is not a possible result of executing the following application?\n\n" +
                    "public class OutsideLogic {\n" +
                    "   public static void main(String... weather) {\n" +
                    "       System.out.print(weather[0]!=null\n" +
                    "           && weather[0].equals(\"sunny\")\n" +
                    "           && !false\n" +
                    "       ? \"Go Outside\" : \"Stay Inside\");\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. Nothing is printed.\n" +
                    "B. The application throws an exception at runtime.\n" +
                    "C. Go Outside is printed.\n" +
                    "D. Stay Inside is printed.");
            add("What is the value of (5 + (!2 + 8) * 3 - 3 % 2)/2 in Java?\n" +
                    "A. 2\n" +
                    "B. 11\n" +
                    "C. 16\n" +
                    "D. None of the above");
            add("Given the following truth table, the boolean variables w and z, and the expression w ||\n" +
                    "z, what are the missing values in the truth table, starting with the first row?\n" +
                    "┌──────────┬─────────┬───────────┐\n" +
                    "│          │ w = true│ w = false │\n" +
                    "├──────────┼─────────┼───────────┤\n" +
                    "│ z = true │ true    │ false     │\n" +
                    "├──────────┼─────────┼───────────┤\n" +
                    "│ z = false│ false   │ false     │\n" +
                    "└──────────┴─────────┴───────────┘\n" +
                    "A. false and false\n" +
                    "B. true and false\n" +
                    "C. true and true\n" +
                    "D. false and true");
            add("Fill in the blanks: The operators –,______________ ,______________\n" +
                    ",______________ , and % are listed in the same or increasing level of operator\n" +
                    "precedence.\n" +
                    "A. +, /, *\n" +
                    "B. --, -, *\n" +
                    "C. ++, /, *\n" +
                    "D. *, ++, %");
            add("What is the output of the following application?\n\n" +
                    "public class Baby {\n" +
                    "   public static String play(int toy, int age) {\n" +
                    "       final String game;\n" +
                    "       if(toy<2)\n" +
                    "           game = age > 1 ? 1 : 10; // p1\n" +
                    "       else\n" +
                    "           game = age > 3 ? \"Ball\" : \"Swim\"; // p2\n" +
                    "       return game;\n" +
                    "   }\n" +
                    "   public static void main(String[] variables) {\n" +
                    "       System.out.print(play(5,2));\n" +
                    "   }\n" +
                    "}\n\n" +
                    "A. Ball\n" +
                    "B. Swim\n" +
                    "C. The code does not compile due to p1.\n" +
                    "D. The code does not compile due to p2.");
            /* Chapter 4 */
            add("What symbol is used for a varargs method parameter?\n" +
                    "A. ..\n" +
                    "B. ...\n" +
                    "C. --\n" +
                    "D. ---");
            add("Fill in the blank in the following code to get the first element from the varargs\n" +
                    "parameter.\n" +
                    "   public void toss (Frisbee... f) {\n" +
                    "Frisbee first = ____________;\n" +
                    "}\n" +
                    "A. f\n" +
                    "B. f[0]\n" +
                    "C. f[1]\n" +
                    "D. None of the above");
            add("Which of the following are primitives?\n" +
                    "int[] lowercase = new int[0];\n" +
                    "Integer[] uppercase = new Integer[0];\n" +
                    "A. Only lowercase\n" +
                    "B. Only uppercase\n" +
                    "C. Bother lowercase and uppercase\n" +
                    "D. Neither lowercase nor uppercase");
            add("How many of the following are legal declarations?\n" +
                    "[]double lion;\n" +
                    "double[] tiger;\n" +
                    "double bear[];\n" +
                    "A. None\n" +
                    "B. One\n" +
                    "C. Two\n" +
                    "D. Three");
            add("Given the following two methods, which method call will not compile?\n" +
                    "public void printStormName(String... names) {\n" +
                    "   System.out.println(Arrays.toString(names));\n" +
                    "}\n" +
                    "public void printStormNames(String[] names) {\n" +
                    "   System.out.println(Arrays.toString(names));\n" +
                    "}\n" +
                    "A. printStormName(\"Arlene\");\n" +
                    "B. printStormName(new String[] { \"Bret\" });\n" +
                    "C. printStormNames(\"Cindy\");\n" +
                    "D. printStormNames(new String[] { \"Don\" });");
            add("How do you determine the number of elements in an array?\n" +
                    "A. buses.length\n" +
                    "B. buses.length()\n" +
                    "C. buses.size\n" +
                    "D. buses.size()");
            add("Which of the following create an empty two-dimensional array with dimensions 2×2?\n" +
                    "A. int[][] blue = new int[2, 2];\n" +
                    "B. int[][] blue = new int[2], [2];\n" +
                    "C. int[][] blue = new int[2][2];\n" +
                    "D. int[][] blue = new int[2 x 2];");
            add("How many lines does the following code output?\n" +
                    "String[] days = new String[] { \"Sunday\", \"Monday\", \"Tuesday\",\n" +
                    "\"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\" };\n" +
                    "for (int i = 0; i < days.length; i++)\n" +
                    "System.out.println(days[i]);\n" +
                    "A. Six\n" +
                    "B. Seven\n" +
                    "C. The code does not compile.\n" +
                    "D. The code compiles but throws an exception at runtime.");
            add("What are the names of the methods to do searching and sorting respectively on\n" +
                    "arrays?\n" +
                    "A. Arrays.binarySearch() and Arrays.linearSort()\n" +
                    "B. Arrays.binarySearch() and Arrays.sort()\n" +
                    "C. Arrays.search() and Arrays.linearSort()\n" +
                    "D. Arrays.search() and Arrays.sort()");
            add("What does this code output?\n" +
                    "String[] nums = new String[] { \"1\", \"9\", \"10\" };\n" +
                    "Arrays.sort(nums);\n" +
                    "System.out.println(Arrays.toString(nums));\n" +
                    "A. [1, 9, 10]\n" +
                    "B. [1, 10, 9]\n" +
                    "C. [10, 1, 9]\n" +
                    "D. None of the above");
            add("Which of the following references the first and last element in a non-empty array?\n" +
                    "A. trains[0] and trains[trains.length]\n" +
                    "B. trains[0] and trains[trains.length - 1]\n" +
                    "C. trains[1] and trains[trains.length]\n" +
                    "D. trains[1] and trains[trains.length - 1]");
            add("How many of the following are legal declarations?\n" +
                    "String lion [] = new String[] {\"lion\"};\n" +
                    "String tiger [] = new String[1] {\"tiger\"};\n" +
                    "String bear [] = new String[] {};\n" +
                    "String ohMy [] = new String[0] {};\n" +
                    "A. None\n" +
                    "B. One\n" +
                    "C. Two\n" +
                    "D. Three");
            add("How many of the following are legal declarations?\n" +
                    "float[] lion = new float[];\n" +
                    "float[] tiger = new float[1];\n" +
                    "float[] bear = new[] float;\n" +
                    "float[] ohMy = new[1] float;\n" +
                    "A. None\n" +
                    "B. One\n" +
                    "C. Two\n" +
                    "D. Three");
            add("Which statement most accurately represents the relationship between searching and\n" +
                    "sorting with respect to the Arrays class?\n" +
                    "A. If the array is not sorted, calling Arrays.binarySearch() will be accurate, but\n" +
                    "slower than if it were sorted.\n" +
                    "B. The array does not need to be sorted before calling Arrays.binarySearch() to get\n" +
                    "an accurate result.\n" +
                    "C. The array must be sorted before calling Arrays.binarySearch() to get an accurate\n" +
                    "result.\n" +
                    "D. None of the above");
            add("Which is not a true statement about an array?\n" +
                    "A. An array expands automatically when it is full.\n" +
                    "B. An array is allowed to contain duplicate values.\n" +
                    "C. An array understands the concept of ordered elements.\n" +
                    "D. An array uses a zero index to reference the first element.");
            add("Which line of code causes an ArrayIndexOutOfBoundsException?\n" +
                    "String[][] matrix = new String[1][2];\n" +
                    "matrix[0][0] = \"Don't think you are, know you are.\";      // m1\n" +
                    "matrix[0][1] = \"I'm trying to free your mind Neo\";        // m2\n" +
                    "matrix[1][0] = \"Is all around you \";                      // m3\n" +
                    "matrix[1][1] = \"Why oh why didn't I take the BLUE pill?\"; // m4\n" +
                    "A. m1\n" +
                    "B. m2\n" +
                    "C. m3\n" +
                    "D. m4");
            add("What does the following output?\n" +
                    "String[] os = new String[] { \"Mac\", \"Linux\", \"Windows\" };\n" +
                    "Arrays.sort(os);\n" +
                    "System.out.println(Arrays.binarySearch(os, \"Mac\"));\n" +
                    "A. 0\n" +
                    "B. 1\n" +
                    "C. 2\n" +
                    "D. The output is not defined.");
            add("Which is the first line to prevent this code from compiling and running without error?\n" +
                    "char[][] ticTacToe = new char[3,3]; // r1\n" +
                    "ticTacToe[1][3] = 'X'; // r2\n" +
                    "ticTacToe[2][2] = 'X';\n" +
                    "ticTacToe[3][1] = 'X';\n" +
                    "System.out.println(ticTacToe.length + \" in a row!\"); // r3\n" +
                    "A. Line r1\n" +
                    "B. Line r2\n" +
                    "C. Line r3\n" +
                    "D. None of the above");
            add("How many objects are created when running the following code?\n" +
                    "Integer[] lotto = new Integer[4];\n" +
                    "lotto[0] = new Integer(1_000_000);\n" +
                    "lotto[1] = new Integer(999_999);\n" +
                    "A. Two\n" +
                    "B. Three\n" +
                    "C. Four\n" +
                    "D. Five");
            add("How many of the following are legal declarations?\n" +
                    "[][] String alpha;\n" +
                    "[] String beta;\n" +
                    "String[][] gamma;\n" +
                    "String[] delta[];\n" +
                    "String epsilon[][];\n" +
                    "A. Two\n" +
                    "B. Three\n" +
                    "C. Four\n" +
                    "D. Five");
            add("Which of the options in the graphic best represent the blocks variable?\n" +
                    "char[][] blocks = new char[][] { { 'a', 'b', 'c' }, { 'd' }, { 'e', 'f' } };\n" +
                    "A. \n\n" +
                    "blocks\n" +
                    "  │        ┌────┬─────┬────┐\n" +
                    "  └─────►  │'a' │ 'd' │ 'e'│\n" +
                    "           ├────┼─────┼────┤\n" +
                    "           │'b' │     │ 'f'│\n" +
                    "           ├────┼─────┼────┤\n" +
                    "           │'c' │     │    │\n" +
                    "           └────┴─────┴────┘\n" +
                    "B. \n" +
                    "blocks\n" +
                    "  │      ┌──────┬───────┬──────┐\n" +
                    "  └─────►│      │       │      │\n" +
                    "         └──┬───┴───┬───┴────┬─┘\n" +
                    "            │       │        │\n" +
                    "            ▼       ▼        ▼\n" +
                    "          ┌───┐   ┌───┐    ┌───┐\n" +
                    "          │'a'│   │'d'│    │'e'│\n" +
                    "          ├───┤   └───┘    ├───┤\n" +
                    "          │'b'│            │'f'│\n" +
                    "          ├───┤            └───┘\n" +
                    "          │'c'│\n" +
                    "          └───┘\n" +
                    "C. \n" +
                    "blocks\n" +
                    "  │        ┌────┬─────┬────┐\n" +
                    "  └─────►  │'a' │ 'b' │ 'c'│\n" +
                    "           ├────┼─────┼────┤\n" +
                    "           │'d' │     │    │\n" +
                    "           ├────┼─────┼────┤\n" +
                    "           │'e' │ 'f' │ 'g'│\n" +
                    "           └────┴─────┴────┘\n" +
                    "D. \n" +
                    "blocks\n" +
                    "  │      ┌──────┬───────┬──────┐\n" +
                    "  └─────►│      │       │      │\n" +
                    "         └──┬───┴───┬───┴────┬─┘\n" +
                    "            │       │        │\n" +
                    "            ▼       ▼        ▼\n" +
                    "          ┌───┐   ┌───┐    ┌───┐\n" +
                    "          │'a'│   │'b'│    │'c'│\n" +
                    "          ├───┤   ├───┤    ├───┤\n" +
                    "          │'d'│   │   │    │   │\n" +
                    "          ├───┤   ├───┤    ├───┤\n" +
                    "          │'e'│   │'f'│    │   │\n" +
                    "          └───┘   └───┘    └───┘");
            add("What happens when calling the following method with a non-null and non-empty\n" +
                    "array?\n" +
                    "public static void addStationName(String[] names) {\n" +
                    "   names[names.length] = \"Times Square\";\n" +
                    "}\n" +
                    "A. It adds an element to the array the value of which is Times Square.\n" +
                    "B. It replaces the last element in the array with the value Times Square.\n" +
                    "C. It does not compile.\n" +
                    "D. It throws an exception.");
            add("How many lines does the following code output?\n" +
                    "String[] days = new String[] { \"Sunday\", \"Monday\", \"Tuesday\",\n" +
                    "       \"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\" };\n" +
                    "for (int i = 0; i < days.size(); i++)\n" +
                    "   System.out.println(days[i]);\n" +
                    "A. Six\n" +
                    "B. Seven\n" +
                    "C. The code does not compile.\n" +
                    "D. The code compiles but throws an exception at runtime.");
            add("How many dimensions does the array reference moreBools allow?\n" +
                    "boolean[][][] bools, moreBools;\n" +
                    "A. One dimension\n" +
                    "B. Two dimensions\n" +
                    "C. Three dimensions\n" +
                    "D. None of the above");
            add("What is a possible output of the following code?\n" +
                    "String[] strings = new String[2];\n" +
                    "System.out.println(strings);\n" +
                    "A. [null, null]\n" +
                    "B. [,]\n" +
                    "C. [Ljava.lang.String;@74a14482\n" +
                    "D. None of the above");
            add("Which is the first line to prevent this code from compiling and running without error?\n" +
                    "char[][] ticTacToe = new char[3][3]; // r1\n" +
                    "ticTacToe[1][3] = 'X'; // r2\n" +
                    "ticTacToe[2][2] = 'X';\n" +
                    "ticTacToe[3][1] = 'X';\n" +
                    "System.out.println(ticTacToe.length + \" in a row!\"); // r3\n" +
                    "A. Line r1\n" +
                    "B. Line r2\n" +
                    "C. Line r3\n" +
                    "D. None of the above");
            add("What is the result of running the following as java Copier?\n" +
                    "package duplicate;\n" +
                    "public class Copier {\n" +
                    "   public static void main(String... original) {\n" +
                    "       String... copy = original;\n" +
                    "       System.out.println(copy.length + \" \" + copy[0]);\n" +
                    "   }\n" +
                    "}\n" +
                    "A. 0\n" +
                    "B. 0 followed by an exception\n" +
                    "C. 1 followed by an exception\n" +
                    "D. The code does not compile.");
            add("What is the result of running the following program?\n" +
                    "1: package fun;\n" +
                    "2: public class Sudoku {\n" +
                    "3:     static int[][] game = new int[6][6];\n" +
                    "4:\n" +
                    "5:     public static void main(String[] args) {\n" +
                    "6:         game[3][3] = 6;\n" +
                    "7:         Object[] obj = game;\n" +
                    "8:         obj[3] = \"X\";\n" +
                    "9:         System.out.println(game[3][3]);\n" +
                    "10:    }\n" +
                    "11: }\n" +
                    "A. X\n" +
                    "B. The code does not compile.\n" +
                    "C. The code compiles but throws a NullPointerException at runtime.\n" +
                    "D. The code compiles but throws a different exception at runtime.");
            add("What does the following output?\n" +
                    "String[] os = new String[] { \"Mac\", \"Linux\", \"Windows\" };\n" +
                    "Arrays.sort(os);\n" +
                    "System.out.println(Arrays.binarySearch(os, \"RedHat\"));\n" +
                    "A. -1\n" +
                    "B. -2\n" +
                    "C. -3\n" +
                    "D. The output is not defined.");
            add("What is the output of the following when run as java FirstName Wolfie?\n" +
                    "public class FirstName {\n" +
                    "   public static void main(String... names) {\n" +
                    "       System.out.println(names[0]);\n" +
                    "   }\n" +
                    "}\n" +
                    "A. FirstName\n" +
                    "B. Wolfie\n" +
                    "C. The code throws an ArrayIndexOutOfBoundsException.\n" +
                    "D. The code throws a NullPointerException.");
            add("What is the output of the following when run as java Count 1 2?\n" +
                    "public class Count {\n" +
                    "   public static void main(String target[]) {\n" +
                    "       System.out.println(target.length);\n" +
                    "   }\n" +
                    "}\n" +
                    "A. 0\n" +
                    "B. 1\n" +
                    "C. 2\n" +
                    "D. The code does not compile.");
            add("What is the output of the following when run as java unix.EchoFirst seed flower?\n" +
                    "package unix;\n" +
                    "import java.util.*;\n" +
                    "public class EchoFirst {\n" +
                    "   public static void main(String[] args) {\n" +
                    "       String one = args[0];\n" +
                    "       Arrays.sort(args);\n" +
                    "       int result = Arrays.binarySearch(args, one);\n" +
                    "       System.out.println(result);\n" +
                    "   }\n" +
                    "}\n" +
                    "A. 0\n" +
                    "B. 1\n" +
                    "C. The code does not compile.\n" +
                    "D. The code compiles but throws an exception at runtime.");
            add("Which of these four array declarations produces a different array than the others?\n" +
                    "A. int[][] nums = new int[2][1];\n" +
                    "B. int[] nums[] = new int[2][1];\n" +
                    "C. int[] nums[] = new int[][] { { 0 }, { 0 } };\n" +
                    "D. int[] nums[] = new int[][] { { 0, 0 } };");
            add("How do you access the array element with the value of \"z\"?\n" +
                    "dimensions\n" +
                    "  │      ┌──────┬───────┬───────┐\n" +
                    "  └─────►│ \"one\"│ \"two\" │\"three\"│\n" +
                    "         └──┬───┴───┬───┴────┬──┘\n" +
                    "            │       │        │\n" +
                    "            ▼       ▼        ▼\n" +
                    "          ┌───┐   ┌───┐    ┌───┐\n" +
                    "          │\"p\"│   │\"x\"│    │\"x\"│\n" +
                    "          └───┘   ├───┤    ├───┤\n" +
                    "                  │\"y\"│    │\"y\"│\n" +
                    "                  └───┘    ├───┤\n" +
                    "                           │\"z\"│\n" +
                    "                           └───┘\n" +
                    "A. dimensions[\"three\"][2]\n" +
                    "B. dimensions[\"three\"][3]\n" +
                    "C. dimensions[2][2]\n" +
                    "D. dimensions[3][3]");
            add("How many lines does the following code output?\n" +
                    "String[] days = new String[] { \"Sunday\", \"Monday\", \"Tuesday\",\n" +
                    "\"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\" };\n" +
                    "for (int i = 1; i <= days.length; i++)\n" +
                    "System.out.println(days[i]);\n" +
                    "A. Six\n" +
                    "B. Seven\n" +
                    "C. The code does not compile.\n" +
                    "D. The code compiles but throws an exception at runtime.");
            add("What is the output of the following when run as java FirstName Wolfie?\n" +
                    "public class FirstName {\n" +
                    "public static void main(String... names) {\n" +
                    "System.out.println(names[1]);\n" +
                    "}\n" +
                    "}\n" +
                    "A. FirstName\n" +
                    "B. Wolfie\n" +
                    "C. The code throws an ArrayIndexOutOfBoundsException.\n" +
                    "D. The code throws a NullPointerException.");
            add("Which is the first line to prevent this code from compiling and running without error?\n" +
                    "char[][] ticTacToe = new char[3][3]; // r1\n" +
                    "ticTacToe[0][0] = 'X'; // r2\n" +
                    "ticTacToe[1][1] = 'X';\n" +
                    "ticTacToe[2][2] = 'X';\n" +
                    "System.out.println(ticTacToe.length + \" in a row!\"); // r3\n" +
                    "A. Line r1\n" +
                    "B. Line r2\n" +
                    "C. Line r3\n" +
                    "D. None of the above");
            add("What is the output of the following when run as java Count 1 2?\n" +
                    "public class Count {\n" +
                    "public static void main(String target[]) {\n" +
                    "System.out.println(target.length());\n" +
                    "}\n" +
                    "}\n" +
                    "A. 0\n" +
                    "B. 1\n" +
                    "C. 2\n" +
                    "D. The code does not compile.");
            add("How many dimensions does the array reference moreBools allow?\n" +
                    "boolean[][] bools[], moreBools;\n" +
                    "A. One dimension\n" +
                    "B. Two dimensions\n" +
                    "C. Three dimensions\n" +
                    "D. None of the above");
            add("What is the result of the following when called as java counting.Binary?\n" +
                    "package counting;\n" +
                    "import java.util.*;\n" +
                    "public class Binary {\n" +
                    "   public static void main(String... args) {\n" +
                    "       Arrays.sort(args);\n" +
                    "       System.out.println(Arrays.toString(args));\n" +
                    "   }\n" +
                    "}\n" +
                    "A. null\n" +
                    "B. []\n" +
                    "C. The code does not compile.\n" +
                    "D. The code compiles but throws an exception at runtime.");
            add("What does the following output?\n" +
                    "String[] os = new String[] { \"Mac\", \"Linux\", \"Windows\" };\n" +
                    "System.out.println(Arrays.binarySearch(os, \"Linux\"));\n" +
                    "A. 0\n" +
                    "B. 1\n" +
                    "C. 2\n" +
                    "D. The output is not defined.");
            add("What is the result of running the following program?\n" +
                    "1: package fun;\n" +
                    "2: public class Sudoku {\n" +
                    "3: static int[][] game;\n" +
                    "4:\n" +
                    "5:     public static void main(String[] args) {\n" +
                    "6:         game[3][3] = 6;\n" +
                    "7:         Object[] obj = game;\n" +
                    "8:         game[3][3] = \"X\";\n" +
                    "9:         System.out.println(game[3][3]);\n" +
                    "10:    }\n" +
                    "11: }\n" +
                    "A. X\n" +
                    "B. The code does not compile.\n" +
                    "C. The code compiles but throws a NullPointerException at runtime.\n" +
                    "D. The code compiles but throws a different exception at runtime.");
            add("What is the output of the following?\n" +
                    "String[][] listing = new String[][] { { \"Book\" }, { \"Game\", \"29.99\" } };\n" +
                    "System.out.println(listing.length + \" \" + listing[0].length);\n" +
                    "A. 2 1\n" +
                    "B. 2 2\n" +
                    "C. The code does not compile.\n" +
                    "D. The code compiles but throws an exception at runtime.");
            add("What is the output of the following when run as java FirstName?\n" +
                    "public class FirstName {\n" +
                    "   public static void main(String[] names) {\n" +
                    "       System.out.println(names[0]);\n" +
                    "   }\n" +
                    "}\n" +
                    "A. FirstName\n" +
                    "B. The code does not compile.\n" +
                    "C. The code throws an ArrayIndexOutOfBoundsException.\n" +
                    "D. The code throws a NullPointerException.");
            add("How many lines does the following code output?\n" +
                    "String[] days = new String[] { \"Sunday\", \"Monday\", \"Tuesday\",\n" +
                    "\"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\" };\n" +
                    "for (int i = 1; i < days.length; i++)\n" +
                    "System.out.println(days[i]);\n" +
                    "A. Six\n" +
                    "B. Seven\n" +
                    "C. The code does not compile.\n" +
                    "D. The code compiles but throws an exception at runtime.");
            add("What is the output of the following when run as java Count \"1 2\"?\n" +
                    "public class Count {\n" +
                    "   public static void main(String target[]) {\n" +
                    "       System.out.println(target.length);\n" +
                    "   }\n" +
                    "}\n" +
                    "A. 0\n" +
                    "B. 1\n" +
                    "C. 2\n" +
                    "D. The code does not compile.");
            add("What does the following output?\n" +
                    "String[] os = new String[] { \"Linux\", \"Mac\", \"Windows\" };\n" +
                    "System.out.println(Arrays.binarySearch(os, \"Linux\"));\n" +
                    "A. 0\n" +
                    "B. 1\n" +
                    "C. 2\n" +
                    "D. The output is not defined.");
            add("Which of the following statements are true?\n" +
                    "I. You can always change a method signature from call(String[] arg) to\n" +
                    "call(String... arg) without causing a compiler error in the calling code.\n" +
                    "II. You can always change a method signature from call(String... arg) to\n" +
                    "call(String[] arg) without causing a compiler error in the existing code.\n" +
                    "A. I\n" +
                    "B. II\n" +
                    "C. Both I and II\n" +
                    "D. Neither I nor II");
            add("Which of these four array references can point to an array that is different from the\n" +
                    "others?\n" +
                    "A. int[][][][] nums1a, nums1b;\n" +
                    "B. int[][][] nums2a[], nums2b;\n" +
                    "C. int[][] nums3a[][], nums3b[][];\n" +
                    "D. int[] nums4a[][][], numbs4b[][][];");
            add("What is the output of the following when run as java unix.EchoFirst seed flower?\n" +
                    "package unix;\n" +
                    "import java.util.*;\n" +
                    "public class EchoFirst {\n" +
                    "   public static void main(String[] args) {\n" +
                    "       Arrays.sort(args);\n" +
                    "       String result = Arrays.binarySearch(args, args[0]);\n" +
                    "       System.out.println(result);\n" +
                    "   }\n" +
                    "}\n" +
                    "A. 0\n" +
                    "B. 1\n" +
                    "C. The code does not compile.\n" +
                    "D. The code compiles but throws an exception at runtime.");
            /* Chapter 5 */
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
            add("");
            add("");
            /* Chapter 6 */
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
            add("");
            add("");
            /* Chapter 7 */
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
            add("");
            add("");
            /* Chapter 8 */
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
            add("");
            add("");
            /* Chapter 9 */
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
            add("");
            add("");
            /* Chapter 10 */
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
            add("");
            add("");
        }
    };
}
