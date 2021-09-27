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
                    "this structure?" +
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
