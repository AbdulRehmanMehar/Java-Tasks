public class MyProgram {
    public static void main(String [] args){
        System.out.println("Our Program that contains errors");
        System.out.print(
                "*/ What's wrong with this program? /*\n" +
                        "public MyProgram\n" +
                        "{\n" +
                        "public static void Main(String args);\n" +
                        "}\n" +
                        "int a; b, c \\\\ Three integers\n" +
                        "3 = a\n" +
                        "b = 4\n" +
                        "a + b = c\n" +
                        "System.out.println('The value of c is' + C);\n" +
                        "{\n"
        );

        System.out.println("Errors Found: \n" +
                "comment should be written as /* my comment */ but in present case it is written as */ my comment /*" + "\n" +
                "public MyProgram is not valid entry point for program, it must be public class MyProgram" +"\n" +
                "Main(String args) must not be terminated by semicolon and must be written as main(String [] args){ " +"\n" +
                "Invalid opening and closing of a method, It must be { /* my method */ }" + "\n" +
                "int a;b,c is not valid statement, it must be int a,b,c;"+ "\n" +
                "3 = a is invalid, it must be a = 3;"+ "\n" +
                "b = 4 is not terminated, it must be terminated by semicolon" + "\n" +
                "a+b = c is not valid , it must be c = a+b;" +"\n" +
                "Output statement is invalid as we want a string to be displayed but we aren't using double quotes. i.e \" String \" "+ "\n" +
                "class is not closed by matching bracket"
        );
    }
}
