import Materia.Ejercicio_01_sign.*;
import Materia.Ejercicio_02_sorting.*;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        // =============================
        // Ejercicio 01: Validación de signos
        // =============================
        SingValidator validator = new SingValidator();

        System.out.println("Ejercicio 01: Validación de signos");
        String test1 = "([]){}";
        String test2 = "({)}";

        System.out.println("Input: " + test1 + " => Output: " + validator.isValid(test1)); // true
        System.out.println("Input: " + test2 + " => Output: " + validator.isValid(test2)); // false

        // =============================
        // Ejercicio 02: Ordenar un Stack
        // =============================

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        
        System.out.println("Intput" + stack);      

        StackSorter sorter = new StackSorter();
        sorter.sortStack(stack);
        System.out.println("Output: " + stack);
    }
}
