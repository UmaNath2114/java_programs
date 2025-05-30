public class Global {
        // Global variable declaration
        static int global_var = 100;

        public static void exampleFunction() {
            int x = 100;
            int y = 200;
            int z = x + y + global_var;
            System.out.println("The sum is: " + z);
            global_var = global_var + 25;
        }

        public static void main(String[] args) {
            System.out.println(global_var);
            exampleFunction();
            System.out.println(global_var);
        }
    }
