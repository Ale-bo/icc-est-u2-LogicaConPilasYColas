
package Materia.Ejercicio_01_sign;

import java.util.Stack;

public class SingValidator{

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Si es apertura, lo agregamos a la pila
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            // Si es cierre, verificamos el tope de la pila
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Comparamos directamente sin usar un método extra
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // Si al final la pila está vacía, los signos están balanceados
        return stack.isEmpty();
    }
  }  