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
            /* Chapter 2 */
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
