package QnA;

import java.util.ArrayList;
import java.util.List;

public class Explanation {
    public List<String> explanations = new ArrayList<>() {
        {
            /* Chapter 1 */
            add("An entry point in a Java application consists of a main() method with a single\n String[] argument, return type of void, and modifiers public and static. The name\n of the variable in the input argument does not matter. Option A is missing the static\n modifier, Option B is missing the String[] argument, and Option C has the wrong\n access modifier and method name. Only Option D fulfills these requirements. Note\n that the modifier final is optional and may be added to an entry point method.\n");
            add("The diagram is an example of object-oriented design in Java, making Option B a\n" +
                    "true statement. Options C and D are also true, as they follow from the inheritance\n" +
                    "model in the diagram. Option A is the correct answer, since platform independence\n" +
                    "has nothing to do with the diagram.\n");
            add("The proper extension for a Java compiled bytecode file is .class, making Option C\n" +
                    "the correct answer.\n");
            add("The fact that the Date class exists in both packages does not impact the ability to\n" +
                    "import both packages, so lines 1 and 2 compile without issue, and Option A is\n" +
                    "incorrect. Line 4 will not compile because the Date class used is ambiguous, making\n" +
                    "Option B correct and Option D incorrect. Finally, Option C is incorrect because line 5\n" +
                    "does compile, as the fully qualified name of the class is used.");
            add("Options B, C, and D are each attributes of traditional object-oriented programming.\n" +
                    "Option A is incorrect as an object-oriented project tends to group data and the actions\n" +
                    "related to that data into a single object.\n");
            add("Only local variables have such a small scope, making Option D the correct answer.\n");
            add("The package java.lang is imported into every Java class, so Option B is correct. The\n" +
                    "other options must be explicitly imported. Option A exists but must be explicitly\n" +
                    "imported. Options C and D do not exist in the standard Java runtime.\n");
            add("Java accepts Options A, B, and D as valid comments. Note that the /* */ syntax can\n" +
                    "have additional (and uneven) star (*) characters as shown in B and D. Option C is\n" +
                    "incorrect as hashtag (#) is not a valid comment character in Java.");
            add("A valid .java file may define any number of classes or interfaces but have at most\n" +
                    "one public class. It can also not define any public classes. For these reasons, Option\n" +
                    "A, B, and C are incorrect, leaving Option D as the only correct answer.");
            add("Notice in this question that main() is not a static method, therefore it can access\n" +
                    "both class and instance variables. Since there are two class variables and two instance\n" +
                    "variables defined, Option B is the correct answer.");
            add("A class will compile if it has unused or redundant import statements, making\n" +
                    "Option A and C incorrect. Option D is also incorrect as the compiler must be able to\n" +
                    "locate the class of the import statement. The correct answer is Option B. Removing\n" +
                    "unused import statements does not cause a class to become unable to be compiled");
            add("The code does not compile because of line 5, making Option A the correct answer.\n" +
                    "For this question, it helps to understand variable scope. The main() method is static\n" +
                    "and does not have access to any class instance variables. The birds variable is not\n" +
                    "static and requires a class instance variable to access. Therefore, the code does not\n" +
                    "compile when the static method attempts to access a non-static variable without an\n" +
                    "instance of the class.");
            add("The java command can only execute compiled .class files, so I is false. Java is\n" +
                    "most certainly object oriented, one of the key design principles, so II is also false. The\n" +
                    "javac command compiles into bytecode, which must be run in a Java virtual machine\n" +
                    "(JVM), and is not native machine code, so III is false as well. Since none of the\n" +
                    "statements are true, Option D is the correct answer.\n");
            add("A class can start with a comment, an optional package statement, or an import\n" +
                    "statement if there is no package statement. It cannot start with a variable definition,\n" +
                    "making Option D the correct answer.\n");
            add("Classes may be defined without a package declaration and are placed in the default\n" +
                    "package, so Option A is incorrect. Option B is a completely false statement as no such\n" +
                    "file is required in Java. Option C is correct as it is one of the primary reasons for\n" +
                    "organizing your application into packages. Option D is incorrect as package-private\n" +
                    "allows access to methods and variables to be limited to those classes within the same\n" +
                    "package.");
            add("The compilation command requires the full or relative name of the file, including\n" +
                    "the .java extension, making Options A and C incorrect. The execution command\n" +
                    "requires the class name without a filename extension, making Option D incorrect.\n" +
                    "Option B is the only correct set of compilation and execution commands.");
            add("Encapsulation is the technique of removing access to a class’s instance variables\n" +
                    "from processes outside the class, making Option D the correct answer.");
            add("The height variable is declared within the if-then statement block. Therefore, it\n" +
                    "cannot be referenced outside the if-then statement and the code does not compile.");
            add("A Java bytecode file is a binary encoded set of instructions designed to be run on\n" +
                    "any computer with a compatible JVM, making Option A the only correct answer. By\n" +
                    "compatible JVM, we mean one capable of running the class file. For example, a Java 6\n" +
                    "JVM may have trouble executing a Java 8 compiled file. Option B is incorrect, and is\n" +
                    "more a facet of machine language compiled programming classes. Option C is also\n" +
                    "incorrect as binary data is not particularly human readable. Finally, Option D is\n" +
                    "incorrect as the compiled file can be distributed without its .java source file and\n" +
                    "execute without issue.");
            add("Unlike with some other programming languages, the proper way to terminate a line\n" +
                    "of code is with a semicolon (;), making D the only correct answer.\n");
            add("The code compiles and runs without issue, so Options A and B are incorrect. The\n" +
                    "question relies on your ability to understand variable scope. The variable today has\n" +
                    "local scope to the method in which it is executed. The variable tomorrow is re-declared\n" +
                    "in the method, but the reference used on line 7 is to the instance variable with a value\n" +
                    "of 10. Finally, the variable tomorrow is static. While using an instance reference to\n" +
                    "access a static variable is not recommended, it does not prevent the variable from\n" +
                    "being read. The result is line 7 evaluates and prints (20 + 10 + 1) = 31, making C the\n" +
                    "correct answer.");
            add("Line 1 is missing the class keyword. Line 2 contains two types for the same\n" +
                    "variable. Line 3 is a valid definition for a method, making C the correct answer.\n" +
                    "Finally, line 4 contains an access modifier, private, after the return type, which is not\n" +
                    "allowed. In addition, void is an invalid type for variables.");
            add("Platform independence is the property of Java that allows it to be run on a variety\n" +
                    "of different devices.");
            add("Options B, C, and D are each correct statements about JVMs. Option A is incorrect.\n" +
                    "Not only is it not a statement about JVMs, it is actually false as Java bytecode can\n" +
                    "often be easily decoded/decompiled");
            add("There is no such thing as package variables, so Option A is incorrect. Option C is\n" +
                    "incorrect as the variable is only in scope within a specific instance of the class. Option\n" +
                    "D is also incorrect as the variable is only in scope for a single method that it is defined\n" +
                    "in. Option B is the only correct answer as class variables are in scope within the\n" +
                    "program.\n");
            add("Option A is incorrect as the sub-package recurring is not included by the import\n" +
                    "statements. Option B is also incorrect as it uses the plural directors instead of the\n" +
                    "singular director used in the import statements. Option D is incorrect as the wildcard\n" +
                    "is applied to the sub-package movie.director, not the package movie. Finally, Option C\n" +
                    "is correct as it is a valid class accessible from the wildcard import.");
            add("Java classes are defined in this order: package statement, import statements, class\n" +
                    "declaration, making Option D the only correct answer. Note that not all of these\n" +
                    "statements are required. For example, a class may not have a package statement, but if\n" +
                    "it does, it must come first in the file.\n");
            add("The import statements for stars.* and stars.Blackhole are redundant import\n" +
                    "statements, since only the class Blackhole is used, and therefore one of them can be\n" +
                    "safely removed. The import statements java.lang.* and java.lang.Object are both\n" +
                    "not required as java.lang is automatically imported in every Java class. Therefore,\n" +
                    "three of the four import statements can be safely removed, making the correct answer\n" +
                    "Option D.");
            add("The application prints the third argument of the input methods. Note that double\n" +
                    "quotes \"\" group input arguments. Therefore, the third argument of Option A is White\u0002tailed deer. The third argument of Option B is 3. The third argument of Option C is\n" +
                    "White-tailed, making it the correct answer. Finally, Option D only has two input\n" +
                    "arguments, leading to an ArrayIndexOutOfBoundsException trying to read the third\n" +
                    "argument at runtime.");
            add("The javac command compiles a .java file into a .class bytecode file, making\n" +
                    "Option B the correct answer.\n");
            add("Java is object oriented, not procedural, so Option A is a false statement. Java allows\n" +
                    "method overloading in subclasses, so Option B is correct. Operator overloading is\n" +
                    "permitted in languages like C++, not Java, so Option C is also untrue. Finally, Option\n" +
                    "D is not a true statement as the JVM manages the location of objects in memory that\n" +
                    "can change and is transparent to the Java application.");
            add("Option A is incorrect as the return type of the method cannot be null. Option B is\n" +
                    "also incorrect as the return type cannot be void if the method uses a return statement.\n" +
                    "Option C is incorrect too as the class keyword is replaced with int. Option D is correct\n" +
                    "because it’s the only answer that allows the code to compile without issue. Note that\n" +
                    "other values are possible for this question. For example, either int or long can be\n" +
                    "entered in the last blank. The key here is that only one of the available answer choices\n" +
                    "allows the code to compile.");
            add("The code compiles so Option D is incorrect. The input to the constructor is ignored,\n" +
                    "making the assignment of end to be 4. Since start is 2, the subtraction of 4 by 2 results\n" +
                    "in the application printing 2, followed by 5, making Option A the correct answer.");
            add("Option A is a false statement, while Options B and C are actually arguments against\n" +
                    "using inheritance. Option D is one of the most important reasons Java supports\n" +
                    "inheritance, to allow increased code reuse among classes.");
            add("The double slash (//) syntax can have any number of slashes as a comment, so long\n" +
                    "as it starts with two of them, making Option A the correct answer. The (#) is not a\n" +
                    "comment character in Java, regardless of whether it is followed by a (!), so Option B is\n" +
                    "incorrect. Option C is incorrect as a single slash (/) is not a valid comment in Java.\n" +
                    "Finally, Option D is incorrect as Option A is a valid comment.");
            add("An entry point in a Java application consists of a main() method with a single\n" +
                    "String[] argument, return type of void, and modifiers public and static. Option D is\n" +
                    "the typical syntax for this method, although Options A and C are also valid forms of\n" +
                    "this method. Note that the modifier final is optional and may be added to the method\n" +
                    "signature. Furthermore, the main() method may take a vararg or array. Option B is the\n" +
                    "only invalid declaration as it does not take an array as an argument.");
            add("The line of code cannot be inserted at a1 because no variables are allowed outside of\n" +
                    "the class declaration in this file, making Options A and D incorrect. The line of code\n" +
                    "can also not be inserted at a3 as local variables defined within methods cannot have\n" +
                    "access modifiers such as public, making Option C incorrect. The code can be inserted\n" +
                    "independently at a2 and a4 as instance variables can be defined anywhere in the class\n" +
                    "outside a method. Therefore, Option B is the correct choice.\n");
            add("Option A is the only correct answer as a class definition is the only required\n" +
                    "component in a Java class file. Note that we said a Java class file here; Java also allows\n" +
                    "interfaces and enums to be defined in a file. A package statement and import\n" +
                    "statements are optional for declaring a class, making Options B and C incorrect. A\n" +
                    "class may also be defined with package-level access in a file, making Option D an\n" +
                    "incorrect answer.");
            add("The proper extension for a Java compiled bytecode file is .java, making Option D\n" +
                    "the correct answer.");
            add("Remember that java.lang is automatically imported in all Java classes, therefore\n" +
                    "both java.lang.Math and pocket.complex.Math are both imported into this class.\n" +
                    "Importing both sets of packages does not cause any compilation issues, making\n" +
                    "Option A incorrect. Line 3 is unnecessary import but including it does not prevent the\n" +
                    "class from compiling, making Option B incorrect. While both versions of Math may be\n" +
                    "imported into the class, the usage of the Math class requires a package name. Because\n" +
                    "of this, line 6 does not compile as the class reference is ambiguous, making Option C\n" +
                    "the correct answer and Option D incorrect.");
            add("Options B and C are accessible within the class as they are covered by the import\n" +
                    "statements. Option D is also fine as java.lang.Object is available without an explicit\n" +
                    "import. The only class not automatically accessible within the class without the full\n" +
                    "package name is dog.puppy.female.KC as the import statements do not include sub\u0002packages; therefore, Option A is the correct answer.");
            add("Object-oriented programming is the technique of structuring data into objects,\n" +
                    "which may contain data and a set of actions that operate on the data, making Option B\n" +
                    "the correct answer.\n");
            add("All of the import statements in this class are required. Removing any of them would\n" +
                    "cause the class to not compile, making Option A the correct answer.\n");
            add("The numLock variable is not accessible in the static main() method without an\n" +
                    "instance of the Keyboard class; therefore, the code does not compile, and Option C is\n" +
                    "the correct answer.");
            add("The code compiles and runs without issue, so Option A is incorrect. The question\n" +
                    "involves understanding the value and scope of each variable at the print() statement.\n" +
                    "The variables feet and tracks are locally scoped and set to 4 and 15, respectively,\n" +
                    "ignoring the value of tracks of 5 in the instance of the class. Finally, the static\n" +
                    "variable s.wheels has a value of 1. The result is the combined value is 20, making\n" +
                    "Option D the correct answer.");
            add("First off, the color variable defined in the instance and set to red is ignored in the\n" +
                    "method printColor() as local scope overrides instance scope, so Option A is incorrect.\n" +
                    "The value of color passed to the printColor() method is blue, but that is lost by the\n" +
                    "assignment to purple, making Option B the correct answer and Option C incorrect.\n" +
                    "Option D is incorrect as the code compiles and runs without issue");
            add("The javac command takes a text-based .java file and returns a binary bytecode\n" +
                    ".class file, making II a true statement. The java command uses a period (.) to\n" +
                    "separate packages, not a slash (/), making I a true statement and III a false statement.\n" +
                    "For these reasons, Option C is the correct answer.\n");
            add("The application compiles without issue, so Option C is incorrect. The application\n" +
                    "does not execute though, as the main() method does not have the correct method\n" +
                    "signature. It is missing the required input argument, an array of String. Trying to\n" +
                    "execute the application without a proper entry point produces an error, making Option\n" +
                    "D the correct answer.\n");
            add("Option A does not compile because it is missing the closing bracket for the class.\n" +
                    "Option D does also not compile as void is not a valid type for a variable. Regardless,\n" +
                    "Options A and D are incorrect as they are missing the getRating() method. Note that\n" +
                    "Option A also uses an abbreviation for numberOfPages. Option B is incorrect as it is\n" +
                    "missing the numberOfPages attribute. Option C is the correct answer as it properly\n" +
                    "defines the attribute numberOfPages and method getRating().\n");
            add("Garbage collection can happen at any time while an application is running,\n" +
                    "especially if the available memory suddenly becomes low, making Option A incorrect.\n" +
                    "Option B is also incorrect, since it is trivial to create a Java application with an infinite\n" +
                    "loop that never terminates. Option D is incorrect because the computer must be able\n" +
                    "to run the JVM in order to execute a Java class. Option C is the only correct answer, as\n" +
                    "the JVM does require an entry point method to begin executing the application.\n");
            /* Chapter 2 */
            add(" Option A does not compile because Java does not allow declaring different types as\n" +
                    "part of the same declaration. The other three options show various legal combinations\n" +
                    "of combining multiple variables in the same declarations with optional default values.");
            add("The table variable is initialized to \"metal\". However, chair is not initialized. In\n" +
                    "Java, initialization is per variable and not for all the variables in a single declaration.\n" +
                    "Therefore, the second line tries to reference an uninitialized local variable and does\n" +
                    "not compile, which makes Option D correct.");
            add("Instance variables have a default value based on the type. For any non-primitive,\n" +
                    "including String, that type is a reference to null. Therefore Option B is correct. If the\n" +
                    "variable was a local variable, Option C would be correct.");
            add("An identifier name must begin with a letter, $, or _. Numbers are only permitted for\n" +
                    "subsequent characters. Therefore, Option B is not a valid variable name.\n");
            add("In Java, class names begin with an uppercase letter by convention. Then they use\n" +
                    "lowercase with the exception of new words. Option B follows this convention and is\n" +
                    "correct. Option A follows the convention for variable names. Option C follows the\n" +
                    "convention for constants. Option D doesn’t follow any Java conventions.");
            add("Objects have instance methods while primitives do not. Since int is a primitive, you\n" +
                    "cannot call instance methods on it. Integer and String are both objects and have\n" +
                    "instance methods. Therefore, Option C is correct.");
            add("Underscores are allowed between any two digits in a numeric literal. Underscores\n" +
                    "are not allowed at the beginning or end of the literal, making Option C the correct\n" +
                    "answer");
            add("Option A is incorrect because int is a primitive. Option B is incorrect because it is\n" +
                    "not the name of a class in Java. While Option D is a class in Java, it is not a wrapper\n" +
                    "class because it does not map to a primitive. Therefore, Option C is correct");
            add("There is no class named integer. There is a primitive int and a class Integer.\n" +
                    "Therefore, the code does not compile, and Option C is correct. If the type was changed\n" +
                    "to Integer, Option B would be correct.");
            add("The new keyword is used to call the constructor for a class and instantiate an\n" +
                    "instance of the class. A primitive cannot be created using the new keyword. Dealing\n" +
                    "with references happens after the object created by new is returned.");
            add("Java uses the suffix f to indicate a number is a float. Java automatically widens a\n" +
                    "type, allowing a float to be assigned to either a float or a double. This makes both\n" +
                    "lines p1 and p3 compile. Line p2 does compile without a suffix. Line p4 does not\n" +
                    "compile without a suffix and therefore is the answer.");
            add("A byte is smaller than a char, making Option C incorrect. bigint is not a primitive,\n" +
                    "making Option D incorrect. A double uses twice as much memory as a float variable,\n" +
                    "therefore Option A is correct.");
            add("The instance variables, constructor, and method names can appear in any order\n" +
                    "within a class declaration.\n");
            add("Java does not allow multiple Java data types to be declared in the same declaration,\n" +
                    "making Option B the correct answer. If double was removed, both hot and cold would\n" +
                    "be the same type. Then the compiler error would be on x3 because of a reference to an\n" +
                    "uninitialized variable.\n");
            add("Lines 2 and 7 illustrate instance initializers. Line 6 is a static initializer. Lines 3–5\n" +
                    "are a constructor.");
            add("Since defaultValue is a local variable, it is not automatically initialized. That means\n" +
                    "the code will not compile with any type. Therefore, Option A is correct. If this was an\n" +
                    "instance variable, Option C would be correct as int and short would be initialized to 0\n" +
                    "while double would be initialized to 0.0.");
            add("The finalize() method may not be called, such as if your program crashes.\n" +
                    "However, it is guaranteed to be called no more than once.\n");
            add("String is a class, but it is not a wrapper class. In order to be a wrapper class, the\n" +
                    "class must have a one-to-one mapping with a primitive");
            add("Lines 15–17 create the three objects. Lines 18–19 change the references so link2\n" +
                    "and link3 point to each other. The lines 20–21 wipe out two of the original references.\n" +
                    "This means the object with name as x is inaccessible");
            add("Options A and D are incorrect because byte and short do not store values with\n" +
                    "decimal points. Option B is tempting. However, 3.14 is automatically a double. It\n" +
                    "requires casting to float or writing 3.14f in order to be assigned to a float. Therefore,\n" +
                    "Option C is correct.");
            add("Integer is the name of a class in Java. While it is bad practice to use the name of a\n" +
                    "class as your local variable name, this is legal. Therefore, k1 does compile. It is not\n" +
                    "legal to use a reserved word as a variable name. All of the primitives including int are\n" +
                    "reserved words. Therefore, k2 does not compile, and Option B is the answer. Line k4\n" +
                    "doesn’t compile either, but the question asks about the first line to not compile.\n");
            add("Dot notation is used for both reading and writing instance variables, assuming they\n" +
                    "are in scope. It cannot be used for referencing local variables, making Option B the\n" +
                    "correct answer.");
            add("Class names follow the same requirements as other identifiers. Underscores and\n" +
                    "dollar signs are allowed. Numbers are allowed, but not as the first character of an\n" +
                    "identifier. Therefore, Option C is correct. Note that class names begin with an\n" +
                    "uppercase letter by convention, but this is not a requirement.");
            add("This question is tricky as it appears to be about primitive vs. wrapper classes.\n" +
                    "Looking closely, there is an underscore right before the decimal point. This is illegal as\n" +
                    "the underscore in a numeric literal can only appear between two digits.\n");
            add(" Local variables do not have a default initialization value. If they are referenced\n" +
                    "before being set to a value, the code does not compile. Therefore, Option C is correct.\n" +
                    "If the variable was an instance variable, Option B would be correct. Option D is tricky.\n" +
                    "A local variable will compile without an initialization if it isn’t referenced anywhere or\n" +
                    "it is assigned a value before it is referenced.");
            add("Since defaultValue is an instance variable, it is automatically initialized to the\n" +
                    "corresponding value for that type. For double, that value is 0.0. By contrast, it is 0 for\n" +
                    "int, long, and short. Therefore Option C is correct.\n");
            add("Option B is an example of autoboxing. Java will automatically convert from\n" +
                    "primitive to wrapper class types and vice versa. Option A is incorrect because you can\n" +
                    "only call methods on an object. Option C is incorrect because this method is used for\n" +
                    "converting to a wrapper class from a String. Option D is incorrect because autoboxing\n" +
                    "will convert the primitive to an object before adding it to the ArrayList.");
            add("Java does not allow calling a method on a primitive. While autoboxing does allow\n" +
                    "the assignment of an Integer to an int, it does not allow calling an instance method\n" +
                    "on a primitive. Therefore, the last line does not compile.");
            add("In order to call a constructor, you must use the new keyword. It cannot be called as\n" +
                    "if it was a normal method. This rules out Options A and B. Further, Option C is\n" +
                    "incorrect because the parentheses are required.");
            add("Option A (I) correctly assigns the value to both variables. II does not compile as dog\n" +
                    "does not have a type. Notice the semicolon in that line, which starts a new statement.\n" +
                    "III compiles but only assigns the value to dog since a declaration only assigns to one\n" +
                    "variable rather than everything in the declaration. IV does not compile because the\n" +
                    "type should only be specified once per declaration.");
            add("The wrapper class for int is Integer and the wrapper class for char is Character. All\n" +
                    "other primitives have the same name. For example, the wrapper class for boolean is\n" +
                    "Boolean.");
            add("Assuming the variables are not primitives, they allow a null assignment. The other\n" +
                    "statements are false.\n");
            add("An example of a primitive type is int. All the primitive types are lowercase, making\n" +
                    "Option A correct. Unlike object reference variables, primitives cannot reference null.\n" +
                    "String is not a primitive as evidenced by the uppercase letter in the name and the fact\n" +
                    "that we can call methods on it. You can create your own classes, but not primitives.");
            add("While you can suggest to the JVM that it might want to run a garbage collection\n" +
                    "cycle, the JVM is free to ignore your suggestion. Option B is how to make this\n" +
                    "suggestion. Since garbage collection is not guaranteed to run, Option D is correct.\n");
            add("All three references point to the String apple. This makes the other two String\n" +
                    "objects eligible for garbage collection and Option C correct.\n");
            add("A constructor can only be called with a class name rather than a primitive, making\n" +
                    "Options A and C incorrect. The newly constructed Double object can be assigned to\n" +
                    "either a double or Double thanks to autoboxing. Therefore, Option B is correct.");
            add("First line 2 runs and sets the variable using the declaration. Then the instance\n" +
                    "initializer on line 6 runs. Finally, the constructor runs. Since the constructor is the last\n" +
                    "to run of the three, that is the value that is set when we print the result, so Option B is\n" +
                    "correct.\n");
            add("Objects are allowed to have a null reference while primitives cannot. int is a\n" +
                    "primitive, so assigning null to it does not compile. Integer and String are both\n" +
                    "objects and can therefore be assigned a null reference. Therefore, Option C is correct.\n");
            add("An instance variable can only be referenced from instance methods in the class. A\n" +
                    "static variable can be referenced from any method. Therefore, Option C is correct.");
            add("Underscores are allowed between any two digits in a numeric literal. Underscores\n" +
                    "are not allowed adjacent to a decimal point, making Option B the correct answer.\n");
            add("These four types represent nondecimal values. While you don’t need to know the\n" +
                    "exact sizes, you do need to be able to order them from largest to smallest. A byte is\n" +
                    "smallest. A short comes next, followed by int and then long. Therefore, Option A is\n" +
                    "correct.");
            add("Java uses dot notation to reference instance variables in a class, making Option A\n" +
                    "correct.\n");
            add("If there was a finalize() method, this would be a different story. However, the\n" +
                    "method here is finalizer. Tricky! That’s just a normal method that doesn’t get called\n" +
                    "automatically. Therefore clean is never output.");
            add("Options B and C do not compile. In Java, braces are for arrays rather than instance\n" +
                    "variables. Option A is the correct answer. It uses dot notation to access the instance\n" +
                    "variable. It also shows that a private variable is accessible in the same class and that a\n" +
                    "narrower type is allowed to be assigned to a wider type.");
            add("The parseInt() methods return a primitive. The valueOf() methods return a\n" +
                    "wrapper class object. In real code, autoboxing would let you assign the return value to\n" +
                    "either a primitive or wrapper class. In terms of what gets returned directly, Option B is\n" +
                    "correct.\n");
            add("On line 9, all three objects have references. The elena and zoe objects have a direct\n" +
                    "reference. The diana object is referenced through the elena object. On line 10, the\n" +
                    "reference to the diana object is replaced by a reference to the zoe object. Therefore, the\n" +
                    "diana object is eligible to be garbage collected, and Option B is correct.");
            add("Options A and B are static methods rather than constructors. Option D is a method\n" +
                    "that happens to have the same name as the class. It is not a constructor because\n" +
                    "constructors don’t have return types.");
            add("Remember that garbage collection is not guaranteed to run on demand. If it doesn’t\n" +
                    "run at all, Option B would be output. If it runs at the requested point, Option C would\n" +
                    "be output. If it runs right at the end of the main() method, Option D would be output.\n" +
                    "Option A is the correct answer because play is definitely called twice. Note that you\n" +
                    "are unlikely to see all these scenarios if you run this code because we have not used\n" +
                    "enough memory for garbage collection to be worth running. However, you still need to\n" +
                    "be able to answer what could happen regardless of it being unlikely.\n");
            add("Each wrapper class has a constructor that takes the primitive equivalent. The\n" +
                    "methods mentioned in Options A, C, and D do not exist. ");
            add("The main() method calls the constructor which outputs a. Then the main method\n" +
                    "calls the run() method. The run() method calls the constructor again, which outputs a\n" +
                    "again. Then the run() method calls the Sand() method, which happens to have the\n" +
                    "same name as the constructor. This outputs b. Therefore, Option C is correct.\n");
            /* Chapter 3 */

            add("A switch statement supports the primitive types byte, short, char, and int and the\n" +
                    "classes String, Character, Byte, Short, and Integer. It also supports enumerated\n" +
                    "types. Floating-point types like float and double are not supported, therefore Option\n" +
                    "B is the correct answer.");
            add("Remember that in ternary expressions, only one of the two right-most expressions\n" +
                    "are evaluated. Since meal>6 is false, ––tip is evaluated and ++tip is skipped. The\n" +
                    "result is that tip is changed from 2 to 1, making Option A the correct answer. The\n" +
                    "value of total is 6, since the pre-increment operator was used on tip, although you\n" +
                    "did not need to know this to solve the question.");
            add("The first assignment creates a new String \"john\" object. The second line explicitly\n" +
                    "uses the new keyword, meaning a new String object is created. Since these objects are\n" +
                    "not the same, the == test on them evaluates to false. The equals() test on them\n" +
                    "returns true because the values they refer to are equivalent. Therefore, the correct\n" +
                    "answer is C.");
            add("This code does not compile because it has two else statements as part of a single ifthen\n" +
                    "statement. Notice that the second if statement is not connected to the last else\n" +
                    "statement. For this reason, Option D, none of the above, is the correct answer.");
            add("A default statement inside a switch statement is optional and can be placed in any\n" +
                    "order within the switch’s case statements, making Options A and B incorrect. Option\n" +
                    "D is an incorrect statement as a switch statement can be composed of a single default\n" +
                    "statement and no case statements. Option C is correct because a default statement\n" +
                    "does not take a value, unlike a case statement.");
            add("The initial assignment of thatNumber follows the first branch of the ternary\n" +
                    "expression. Since 5 >= 5 evaluates to true, a value of 3 is assigned to thatNumber. In\n" +
                    "the next line, the pre-increment operator increments the value of thatNumber to 4 and\n" +
                    "returns a value of 4 to the expression. Since 4 < 4 evaluates to false, the if-then block\n" +
                    "is skipped. This leaves the value of thatNumber as 4, making Option B the correct\n" +
                    "answer.");
            add("The break statement exits a switch statement, skipping all remaining branches,\n" +
                    "making Option B the correct answer. In Option A, exit is not a statement in Java. In\n" +
                    "Option C, goto is a reserved word but unused in Java. Finally, in Option D, continue is\n" +
                    "a statement but only used for loops.");
            add("Option A is incorrect as only one of the two right-hand expressions is evaluated at\n" +
                    "runtime. Parentheses are often helpful for reading ternary expressions but are not\n" +
                    "required, making Option B incorrect. Option C is a correct statement about ternary\n" +
                    "operators as they are commonly used to replace short if-then-else statements. Finally,\n" +
                    "Option D is incorrect as only boolean expressions are permitted in the left-most\n" +
                    "operand of a ternary expression.");
            add("On line 4, candidateA and candidateB are numbers, but the && operation can only be\n" +
                    "applied to boolean expressions. Therefore, the code does not compile because of line 4,\n" +
                    "making C the correct answer. All of the other lines are correct. Note that if line 4 is\n" +
                    "fixed, line 3 does not produce a NullPointerException at runtime. The conditional ||\n" +
                    "and the preceding null check allows the code to only call intValue() if candidateA is\n" +
                    "not null.");
            add("The first step is to determine whether or not the if-then statement’s expression is\n" +
                    "executed. The expression 6 % 3 evaluates to 0, since there is no remainder, and since \n" +
                    "0 >= 1 is false, the expression triceratops++ is not called. Notice there are no brackets\n" +
                    "{} in the if-then statement. Despite the triceratops–– line being indented, it is not\n" +
                    "part of the if-then statement. Recall that Java does not use indentation to determine\n" +
                    "the beginning or end of a statement. Therefore, triceratops–– is always executed,\n" +
                    "resulting in a value of 2 for triceratops and making Option A the correct answer.");
            add("Option A is incorrect because else statements are entirely optional. Option B is also\n" +
                    "incorrect. The target of an if-then statement is not evaluated if the boolean test is\n" +
                    "false. Option C is incorrect. While an if-then statement is often used to test whether\n" +
                    "an object is of a particular type in order to cast it, it is not required to cast an object.\n" +
                    "Option D is correct as an if-then statement may execute a single statement or a block\n" +
                    "of code {}.");
            add("For this question, it helps to notice that the second if-then statement is not\n" +
                    "connected to the first if-then statement, as there is no else joining them. When this\n" +
                    "code executes, the first if-then statement outputs Not enough since flair is >= 15 and\n" +
                    "< 37. The second if-then statement is then evaluated. Since flair is not 37, the\n" +
                    "expression Too many is outputted. Since two statements are outputted, Option D, none\n" +
                    "of the above, is the correct answer.");
            add("A case value must be a constant expression, such as a literal or final variable, so\n" +
                    "Options A and C are true statements about case values. A case statement may be\n" +
                    "terminated by a break statement, but it is not required, making Option B the false\n" +
                    "statement and correct answer. Option D is also a true statement about case values.");
            add("The question is about boolean operators. Since Options A and B are numeric\n" +
                    "operators, they can be instantly disregarded. The question then simplifies to which\n" +
                    "boolean expression, && or ||, corresponds to the truth table that only evaluates to true\n" +
                    "if both operands are true. Only the conjunctive logical && operator represents this\n" +
                    "relationship, making Option D the correct answer.");
            add("The value of jumps and hops is unimportant because this code does not compile,\n" +
                    "making Option C the correct answer. Unlike some other programming languages, Java\n" +
                    "does not automatically convert integers to boolean values for use in if-then\n" +
                    "statements. The statement if(jumps) evaluates to if(0), and since 0 is not a boolean\n" +
                    "value, the code does not compile. Note that the value of the jumps variable is irrelevant\n" +
                    "in this example; no integer evaluates to a boolean value in Java.");
            add("Prefix operators modify the variable and evaluate to the new value, while postfix\n" +
                    "operators modify the variable but return the original value. Therefore, Option B is the\n" +
                    "correct answer.");
            add("For this problem, it helps to recognize that parentheses take precedence over the\n" +
                    "operations outside the parentheses. Once we replace the variables with values, the\n" +
                    "expression becomes: 3+2*(2+3). We then calculate the value inside the parentheses to\n" +
                    "get 3+2*5. Since the multiplication operator has higher precedence than addition, we\n" +
                    "evaluate it first, resulting in 3+10 = 13, making Option B the correct answer.");
            add("Any value that can be implicitly promoted to int will work for the case statement\n" +
                    "with an int input. Since switch statements do not support long values, and long\n" +
                    "cannot be converted to int without a possible loss of data, Option B is the correct\n" +
                    "answer.");
            add("While parentheses are recommended for ternary operations, especially embedded\n" +
                    "ones, they are not required, so Option C is incorrect. The code does not compile\n" +
                    "because day is an int, not a boolean expression, in the second ternary operation,\n" +
                    "making Option D the correct answer. Remember that in Java, numeric values are not\n" +
                    "accepted in place of boolean expressions in if-then statements or ternary operations.");
            add("While the code involves numerous operations, none of that matters for solving this\n" +
                    "problem. The key to solving it is to notice that the line that assigns the leaders\n" +
                    "variable has an uneven number of parentheses. Without balanced parentheses, the\n" +
                    "code will not compile, making Option C the correct answer.");
            add("Remember that Java evaluates + from left to right. The first two values are both\n" +
                    "numbers, so the + is evaluated as numeric addition, resulting in a reduction to 11 +\n" +
                    "\"7\" + 8 + 9. The next two terms, 11 + \"7\", are handled as string concatenation since\n" +
                    "one of the terms is a String. This allows us to reduce the expression to \"117\" + 8 + 9.\n" +
                    "Likewise, the final two terms are each evaluated one at a time with the String on the\n" +
                    "left. Therefore, the final value is 11789, making Option B the correct answer.");
            add("The subtraction - operator is used to find the difference between two numbers,\n" +
                    "while the modulus % operator is used to find the remainder when one number is\n" +
                    "divided by another, making Option B the correct answer. The other options use\n" +
                    "operators that do not match this description.");
            add("The code compiles without issue, making Option D incorrect. The focus of this\n" +
                    "question is showing how the division and modulus of two numbers can be used to\n" +
                    "reconstitute one of the original operands. In this example, partA is the integer division\n" +
                    "of the two numbers. Since 3 does not divide 11 evenly, it is rounded down to 3. The\n" +
                    "variable partB is the remainder from the first expression, which is 2. The newDog\n" +
                    "variable is an expression that reconstitutes the original value for dog using the division\n" +
                    "value and the remainder. Note that due to operator precedence, the multiplication *\n" +
                    "operation is evaluated before the addition + operation. The result is the original value\n" +
                    "of 11 for dog is outputted by this program.");
            add("The code compiles without issue, so Option D is incorrect. In this question’s switch\n" +
                    "statement, there are no break statements. Once the matching case statement, 30, is\n" +
                    "reached, all remaining case statements will be executed. The variable eaten is\n" +
                    "increased by 1, then 2, then reduced by 1, resulting in a final value of 2, making Option\n" +
                    "B the correct answer.");
            add("Ternary operations require both right-hand expressions to be of compatible data\n" +
                    "types. In this example, the first right-hand expression of the outer ternary operation is\n" +
                    "of type String, while the second right-hand expression is of type int. Since these data\n" +
                    "types are incompatible, the code does not compile, and Option C is the correct answer.");
            add("For this question, remember that if two String objects evaluate to true using ==,\n" +
                    "then they are the same object. If they are the same String object, equals() will\n" +
                    "trivially return true. Option A correctly reflects this principle. Option B is incorrect as\n" +
                    "two String objects that are not the same may still be equivalent in terms of equals().\n" +
                    "For example, apples == new String(apples) evaluates to false, but equals() will\n" +
                    "evaluate to true on these String objects. Likewise, Options C and D are also incorrect\n" +
                    "because two String objects that are equivalent in terms of equals() may be different\n" +
                    "objects.");
            add("The statement compiles and runs without issue, making Options C and D incorrect.\n" +
                    "Since we are given that myTestVariable is not null, the statement will always evaluate\n" +
                    "to false, making Option B the correct answer. Note that if myTestVariable was null,\n" +
                    "then the code would still compile but throw a NullPointerException calling equals()\n" +
                    "at runtime.");
            add("The code does not compile, making Option D the correct answer. The reason the\n" +
                    "code does not compile is due to the test in the second if-then statement. The\n" +
                    "expression (streets && intersections > 1000) is invalid because streets is not a\n" +
                    "boolean expression and cannot be used as the left-hand side of the conjunctive logical\n" +
                    "&& operator. The line of code is designed to resemble the corrected expression\n" +
                    "(streets > 1000 && intersections > 1000. Notice the fixed expression requires two\n" +
                    "relational > operators. If the second if-then statement was corrected, then the\n" +
                    "application would compile and produce two 1’s, making Option C the correct answer.");
            add("The & and && (AND) operators are not interchangeable, as the conjunctive & operator\n" +
                    "always evaluates both sides of the expression, while the conditional conjunctive &&\n" +
                    "operator only evaluates the right-hand side of the expression if the left side is\n" +
                    "determined to be true. This is why conditional operators are often referred to as shortcircuit\n" +
                    "operators, skipping the right-hand side expression at runtime. For these\n" +
                    "reasons, Option B is the correct answer. Note that Option C is an incorrect statement\n" +
                    "as well, since it describes disjunctive (OR) operators.");
            add("The code compiles, so Option A is incorrect. Since w starts out true, the third line\n" +
                    "takes the first right-hand side of the ternary expression returning and assigning 5 to x\n" +
                    "(post-increment operator) while incrementing y to 6. Note that the second right-hand\n" +
                    "side of the ternary expression y–– is not evaluated since ternary operators only\n" +
                    "evaluate one right-hand expression at runtime. On the fourth line, the value of w is set\n" +
                    "to !z. Since z is false, the value of w remains true. The final line outputs the value of\n" +
                    "(5+6) and (true ? 5 : 10), which is 11 5, making Option C the correct answer.");
            add("The first assignment actually uses two String objects, the literal \"bob\" and the\n" +
                    "String created with the new keyword. Regardless, only the second object is assigned to\n" +
                    "the variable bob. The second variable, notBob, is assigned a reference to the value of\n" +
                    "the bob variable. This means that not only does the equals() test pass, but they are\n" +
                    "actually the same object, so the == test is true as well. Therefore, the correct answer is\n" +
                    "Option A.");
            add("The question is about operator precedence and order of operation. The\n" +
                    "multiplication * and modulus % operators have the highest precedence, although what\n" +
                    "is inside the parentheses needs to be evaluated first. We can reduce the expression to\n" +
                    "the following: 12 + 6 * 3 % 2. Since multiplication * and modulus % have the same\n" +
                    "operator precedence, we evaluate them from left to right as follows: 12 + 6 * 3 % 2 →\n" +
                    "12 + 18 % 2 → 12 + 0 → 12. We see that despite all of the operators on the right-hand\n" +
                    "side of the expression, the result is zero, leaving us a value of 12, making Option B the\n" +
                    "correct answer.");
            add("The XOR ^ operator evaluates to true if p and q differ and false if they are the\n" +
                    "same. Therefore, the missing values are true and false, making Option D the correct\n" +
                    "answer.");
            add("The key to understanding this question is to remember that the conditional\n" +
                    "conjunction && operator only executes the right-hand side of the expression if the lefthand\n" +
                    "side of the expression is true. If data is an empty array, then the expression ends\n" +
                    "early and nothing is output. The second part of the expression will return true if\n" +
                    "data’s first element is sound or logic. Since we know from the first part of the\n" +
                    "statement that data is of length at least one, no exception will be thrown. The final\n" +
                    "part of the expression with data.length<2 doesn’t change the output when data is an\n" +
                    "array of size one. Therefore, sound and logic are both possible outputs. For these\n" +
                    "reasons, Option C is the only result that is unexpected at runtime.");
            add("In Option A, the division operator / incorrectly comes after the decrement ––\n" +
                    "operator. In Option B, the subtraction operator - incorrectly comes after the modulus\n" +
                    "% operator. In Option D, the division operator / incorrectly comes after the subtraction\n" +
                    "- operator. The correct answer is Option C, where all three operators have the same\n" +
                    "order of precedence.");
            add("The exclusive or (XOR) ^ operator requires evaluating both operands to determine\n" +
                    "the result. For this reason, Options A and B are incorrect. For Option B, you can’t have\n" +
                    "a short-circuit operation if both operands are always read, therefore ^^ does not exist.\n" +
                    "Option C is an incorrect statement as the ^ operator only returns true if exactly one\n" +
                    "operand is true. Finally, Option D is correct as the ^ is only applied to boolean values\n" +
                    "in Java.");
            add("The diagram represents the overlap of x and y, corresponding to when one of them\n" +
                    "is true. Therefore, x || y, Option C, most closely matches this relationship. Note that\n" +
                    "z is unused in the diagram and therefore is not required in any expression.");
            add("The value of a case statement must be constant, a literal value, or final variable.\n" +
                    "Since red is missing the final attribute, no variable type allows the code to compile,\n" +
                    "making Option D the correct answer.");
            add("The question is asking which operator represents greater than or equal to and\n" +
                    "which operator is strictly less than. The >= and < correspond to these operators,\n" +
                    "respectively. Therefore, Option C is the correct answer. Note that the question does\n" +
                    "not specify which order the operators needed to appear in, only to select the two\n" +
                    "operators that match the question description.");
            add("The code compiles and runs without issue, making Options C and D incorrect. The\n" +
                    "key here is understanding operator precedence and applying the parentheses to\n" +
                    "override precedence correctly. The first expression is evaluated as follows: \n" +
                    "10 * (2 + (3 + 2) / 5) → 10 * (2 + 5 / 5) → 10 * (2 + 1) → 10 * 3, with a final value of 30\n" +
                    "for turtle. Since turtle is not less than 5, a value of 25 is assigned to hare. Since\n" +
                    "turtle is not less than hare, the last expression evaluates to Turtle wins!, which is\n" +
                    "outputted to the console, making Option B the correct answer.");
            add("All of the terms of getResult() in this question evaluate to 0, since they are all less\n" +
                    "than or equal to 5. The expression can therefore be reduced to 0+0+0+0+\"\". Since Java\n" +
                    "evaluates the + operator from left to right, the four operands on the left are applied\n" +
                    "using numeric addition, resulting in the expression 0+\"\". This expression just converts\n" +
                    "the value to a String, resulting in an output of 0, making Option A the correct answer.");
            add("The code compiles without issue, so Option D is incorrect. The key here is that the\n" +
                    "if-then statement in the runTest() method uses the assignment operator (=) instead\n" +
                    "of the (==) operator. The result is that spinner is assigned a value of true, and the\n" +
                    "statement (spinner = roller) returns the newly assigned value. The method then\n" +
                    "returns up, making Option A the correct answer. If the (==) operator had been used in\n" +
                    "the if-then statement, then the process would have branched to the else statement,\n" +
                    "with down being returned by the method.");
            add("The conditional disjunction (OR) || operator is true if either of the operands are\n" +
                    "true, while the logical complement (!) operator reverses or flips a boolean value,\n" +
                    "making Option D the correct answer. The other options use operators that do not\n" +
                    "match this description. In particular, Options A and C include operators that can only\n" +
                    "be applied to numerical values, not boolean ones.");
            add("While parentheses are recommended for ternary operations, especially embedded\n" +
                    "ones, they are not required, so Option C is incorrect.. The first ternary operation\n" +
                    "evaluates characters <= 4 as false, so the second ternary operation is executed. Since\n" +
                    "story > 1 is true, the final value of movieRating is 2.0, making Option A the correct\n" +
                    "answer.");
            add("Barring any JVM limitations, a switch statement can have any number of case\n" +
                    "statements (including none) but at most one default statement, with Option B\n" +
                    "correctly identifying this relationship.");
            add("The application uses the conditional conjunction && operator to test if weather[0] is\n" +
                    "null, but unfortunately this test does not work on zero-length arrays. Therefore, it is\n" +
                    "possible this code will throw an ArrayIndexOutOfBoundsException at runtime. The\n" +
                    "second part of the expression evaluates to true if the first input of weather matches\n" +
                    "sunny. The final part of the expression, && !false, is a tautology in that it is always\n" +
                    "true and has no impact on the expression. Either an exception will be thrown or text\n" +
                    "will be output, based on the value of weather, therefore Option A is the correct answer.");
            add("The question looks a lot more difficult than it is. In fact, to solve it you don’t have\n" +
                    "to compute anything! You just have to notice that the logical complement operator (!),\n" +
                    "which can only be applied to boolean values, is being applied to a numeric value.\n" +
                    "Therefore, the answer is that the expression wouldn’t compile or run, making Option\n" +
                    "D the correct answer.");
            add("The disjunctive logical || operator evaluates to true if either operand is true.\n" +
                    "Another way to look at it is that it only evaluates to false if both operands are false.\n" +
                    "Therefore, the missing values are both true, making Option C the correct answer.");
            add("In Option B, the subtraction operator - incorrectly comes after the decrement ––\n" +
                    "operator. In Option C, the division operator / incorrectly comes after the increment ++\n" +
                    "operator. In Option D, the modulus operator % incorrectly comes after the increment\n" +
                    "++ operator. The correct answer is Option A, where the subtraction - and addition +\n" +
                    "operators are followed by the division / and multiplication * operators.");
            add("The key to solving this problem is remembering that the type of the value returned\n" +
                    "by a ternary operation is determined by the expressions on the right-hand side. On\n" +
                    "line p1, the expressions are of type int, but the assignment is to the variable game, of\n" +
                    "type String. Since the assignment is invalid, the code does not compile, and Option C\n" +
                    "is correct.");
            /* Chapter 4*/
            add("Three dots (...) are the syntax for a method parameter of type varargs. It is treated\n" +
                    "like an array.");
            add("Array indexes are zero based in Java. A varargs parameter is simply another way of\n" +
                    "passing in data to a method. From within the method, it is treated just like you had\n" +
                    "written Frisbee[] f as the method parameter. Therefore, the first element uses the\n" +
                    "0th index, and Option B is correct.");
            add("Trick question! While int is a primitive, all arrays are objects. One way to tell is\n" +
                    "that an array has a public instance variable called length. Another way is that you can\n" +
                    "assign it a variable of type Object. Therefore, Option D is correct.");
            add("The array braces are allowed to appear before or after the variable name, making\n" +
                    "the tiger and bear declarations correct. The braces are not allowed to appear before\n" +
                    "the type making the lion declaration incorrect. Therefore, Option C is correct.");
            add("From within a method, an array or varargs parameter is treated the same. However,\n" +
                    "there is a difference from the caller’s point of view. A varargs parameter can receive\n" +
                    "either an array or individual values, making Options A and B compile. However, an\n" +
                    "array parameter can only take an array, which prevents Option C from compiling.");
            add("Arrays use the length variable to determine the number of elements, making\n" +
                    "Option A correct. For an ArrayList, Option D would have been the answer.");
            add("A two-dimensional array is declared by listing both sizes in separate pairs of braces.\n" +
                    "Option C correctly shows this syntax.");
            add("There is nothing wrong with this code. It correctly creates a seven-element array.\n" +
                    "The loop starts with index 0 and ends with index 6. Each line is correctly output.\n" +
                    "Therefore, Option B is correct.");
            add("Sorry. This is just something you have to memorize. The sort() and\n" +
                    "binarySearch() methods do sorting and searching, respectively.");
            add("The elements of the array are of type String rather than int. Therefore, we use\n" +
                    "alphabetical order when sorting. The character 1 sorts before the character 9,\n" +
                    "alphabetically making Option A incorrect. Shorter strings sort before longer strings\n" +
                    "when all the other characters are the same, making Option B the answer.");
            add("Array indices start with 0, making Options C and D incorrect. The length attribute\n" +
                    "refers to the number of elements in an array. It is one past the last valid array index.\n" +
                    "Therefore, Option B is correct.");
            add("When using an array initializer, you are not allowed to specify the size separately.\n" +
                    "The size is inferred from the number of elements listed. Therefore, tiger and ohMy are\n" +
                    "incorrect. When you’re not using an array initializer, the size is required. An empty\n" +
                    "array initializer is allowed. Option C is correct because lion and bear are legal.");
            add("Since no elements are being provided when creating the arrays, a size is required.\n" +
                    "Therefore, lion and bear are incorrect. The braces containing the size are required to\n" +
                    "be after the type, making ohMy incorrect. The only one that is correct is tiger, making\n" +
                    "the correct answer Option B.");
            add("The binarySearch() method requires a sorted array in order to return a correct\n" +
                    "result. If the array is not sorted, the results of a binary search are undefined.\n" +
                    "15. A. An ArrayList expands automatically when it is full. An array does not, making\n" +
                    "Option A the answer. The other three statements are true of both an array and an\n" +
                    "ArrayList.");
            add("An ArrayList expands automatically when it is full. An array does not, making\n" +
                    "Option A the answer. The other three statements are true of both an array and an\n" +
                    "ArrayList.");
            add("This code creates a two-dimensional array of size 1×2. Lines m1 and m2 assign values\n" +
                    "to both elements in the outer array. Line m3 attempts to reference the second element\n" +
                    "of the outer array. Since there is no such position, it throws an exception, and Option\n" +
                    "C is correct.");
            add("The code sorts before calling binarySearch(), so it meets the precondition for that\n" +
                    "method. The target string of \"Mac\" is the second element in the sorted array. Since\n" +
                    "array indices begin with zero, the second position is index 1, and Option B is correct.");
            add("A multi-dimensional array is created with multiple sets of size parameters. The first\n" +
                    "line should be char[] ticTacToe = new char[3][3];. Therefore, Option A is the\n" +
                    "answer.");
            add("The first line creates one object; the array itself. While there are four references to\n" +
                    "null in that array, none of those are objects. The second line creates one object and\n" +
                    "points one of the array references to it. So far there are two objects: the array itself and\n" +
                    "one object it is referencing. The third line does the same, bringing up the object count\n" +
                    "to three. Therefore, Option B is correct.");
            add("As with a one-dimensional array, the braces must be after the type, making alpha\n" +
                    "and beta illegal declarations. For a multi-dimensional array, the braces are allowed to\n" +
                    "be before and/or after the variable name. They do not need to be in the same place.\n" +
                    "Therefore, the remaining three are correct, and Option B is correct.");
            add("Options A, C and D represent 3x3 2D arrays. Option B best represents the array in\n" +
                    "the code. It shows there are three different arrays of different lengths.");
            add("Options A, C and D represent 3x3 2D arrays. Option B best represents the array in\n" +
                    "the code. It shows there are three different arrays of different lengths.");
            add("The code days.size() would be correct if this was an ArrayList. Since it is an array,\n" +
                    "days.length is the correct code. Therefore, the code does not compile, and Option C is\n" +
                    "the answer.");
            add("Since the braces in the declaration are before the variable names, the variable type\n" +
                    "boolean[][][] applies to both variables. Therefore, both bools and moreBools can\n" +
                    "reference a 3D array.");
            add("Calling toString() on an array doesn’t output the contents of the array, making\n" +
                    "Option C correct. If you wanted Option A to be the answer, you’d have to call\n" +
                    "Arrays.toString(strings).");
            add("Arrays begin with an index of 0. This array is a 3×3 array. Therefore. only indexes 0,\n" +
                    "1. and 2 are valid. Line r2 throws an ArrayIndexOutOfBoundsException. Therefore.\n" +
                    "Option B is correct.");
            add("Three dots in a row is a varargs parameter. While varargs is used like an array from\n" +
                    "within the method, it can only be used as a method parameter. This syntax is not\n" +
                    "allowed for a variable, making Option D the answer.");
            add("Line 6 assigns an int to a cell in a 2D array. This is fine. Line 7 casts to a general\n" +
                    "Object[]. This is dangerous, but legal. Why is it dangerous, you ask? That brings us to\n" +
                    "line 8. The compiler can’t protect us from assigning a String to the int[] because the\n" +
                    "reference is more generic. Therefore, line 8 throws an ArrayStoreException because\n" +
                    "the type is incorrect, and Option D is correct. You couldn’t have assigned an int on\n" +
                    "line 8 either because obj[3] is really an int[] behind the scenes and not an int.");
            add("The code sorts before calling binarySearch, so it meets the precondition for that\n" +
                    "method. The target string of \"RedHat\" is not found in the sorted array. If it was found,\n" +
                    "it would be between the second and third element. The rule is to take the negative\n" +
                    "index of where it would be inserted and subtract 1. It would need to be inserted as the\n" +
                    "third element. Since indexes are zero based, this is index 2. We take the negative,\n" +
                    "which is -2, and subtract 1, giving -3. Therefore, Option C is correct.");
            add("Array indexes begin with zero. FirstName is the name of the class, not an argument.\n" +
                    "Therefore, the first argument is Wolfie, and Option B is correct.");
            add("The name of the program is Count and there are two arguments. Therefore, the\n" +
                    "program outputs 2, and Option C is correct.");
            add("This class is called with two arguments. The first one (seed) is stored in the variable\n" +
                    "one. Then the array is sorted, meeting the precondition for binary search. Binary\n" +
                    "search returns 1 because seed is the second element in the sorted array, and Java uses\n" +
                    "zero-based indexes. Option B is correct.");
            add("Options A and B show the braces can be before or after the variable name and\n" +
                    "produce the same array. Option C specifies the same array the long way with two\n" +
                    "arrays of length 1. Option D is the answer because it is different than the others. It\n" +
                    "instead specifies an array of length 1 where that element is of length 2.");
            add("Arrays are indexed using numbers, not strings, making Options A and B incorrect.\n" +
                    "Since array indexes are zero based, Option C is the answer.");
            add("In Java, arrays are indexed starting with 0. While it is unusual for the loop to start\n" +
                    "with 1, this does not cause an error. What does cause an error is the loop ending at\n" +
                    "data.length, because the <= operator is used instead of the < operator. The last loop\n" +
                    "index is 6, not 7. On the last iteration of the loop, the code throws an\n" +
                    "ArrayIndexOutOfBoundsException. Therefore, Option D is correct.");
            add("Array indexes begin with zero. FirstName is the name of the class, not an argument.\n" +
                    "The first and only argument is Wolfie. There is not a second argument, so Option C is\n" +
                    "correct.");
            add("This code is correct. Line r1 correctly creates a 2D array. The next three lines\n" +
                    "correctly assign a value to an array element. Line r3 correctly outputs 3 in a row!");
            add("Arrays expose a length variable. They do not have a length() method. Therefore,\n" +
                    "the code does not compile, and Option D is correct.");
            add("This one is tricky since the array braces are split up. This means that bools is a 3D\n" +
                    "array reference. The braces both before and after the variable name count. For\n" +
                    "moreBools, it is only a 2D array reference because there are only two pairs of braces\n" +
                    "next to the type. In other words, boolean[][] applies to both variables. Then bools\n" +
                    "gets another dimension from the braces right after the variable name. However,\n" +
                    "moreBools stays at 2D, making Option B correct.");
            add("Since no arguments are passed from the command line, this creates an empty array.\n" +
                    "Sorting an empty array is valid and results in an empty array. Therefore, Option B is\n" +
                    "correct.");
            add("Java requires having a sorted array before calling binarySearch. Since the array is\n" +
                    "not sorted, the result is undefined, and Option D is correct. It may happen that you get\n" +
                    "1 as the result, but this behavior is not guaranteed. You need to know for the exam\n" +
                    "that this is undefined even if you happen to get the “right” answer.");
            add("Line 8 attempts to store a String in an array meant for an int. Line 8 does not\n" +
                    "compile, and Option B is correct.");
            add("This array has two elements, making listing.length output 2. While each array\n" +
                    "element does not have the same size, this does not matter because we are only looking\n" +
                    "at the first element. The first element has one. This makes the answer Option A.");
            add("FirstName is the name of the class, not an argument. There are no other arguments,\n" +
                    "so names is an empty array. Therefore, Option C is correct.");
            add("In Java, arrays are indexed starting with 0. While it is unusual for the loop to start\n" +
                    "with 1, this does not cause an error. It does cause the code to output six lines instead\n" +
                    "of seven since the loop doesn’t cover the first array element. Therefore, Option A is\n" +
                    "correct.");
            add("The name of the program is Count, and there is only one argument because double\n" +
                    "quotes are used around the value. That argument is a String with three characters: 1,\n" +
                    "a space, and 2. Therefore, the program outputs 1, and Option B is correct.");
            add("Java requires having a sorted array before calling binarySearch(). You do not have\n" +
                    "to call Arrays.sort to perform the sort though. This array happens to already be\n" +
                    "sorted, so it meets the precondition. The target string of \"Linux\" is the first element in\n" +
                    "the array. Since Java uses zero-based indexing, the answer is Option A.");
            add("From within a method, an array parameter and a varargs parameter are treated the\n" +
                    "same. From the caller, an array parameter is more restrictive. Both types can receive\n" +
                    "an array. However, only a varargs parameter is allowed to automatically turn\n" +
                    "individual parameters into an array. Therefore, statement I is correct and the answer\n" +
                    "is Option A.");
            add("All of the variables except nums2b point to a 4D array. Don’t create a 4D array; it’s\n" +
                    "confusing. The options show the braces can be before or after the variable in any\n" +
                    "combination. Option B is the answer because nums2b points to a 3D array. It only has\n" +
                    "three pairs of braces before the variable and none after. By comparison, nums2a has\n" +
                    "three pairs of braces before the variable and the fourth pair of braces after.");
            add("Binary search returns an int representing the index of a match or where a match\n" +
                    "would be. An int cannot be stored in a String variable. Therefore, the code does not\n" +
                    "compile and the answer is Option C.");

            /* chapter 5 */
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
            add("");
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
