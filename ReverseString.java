import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String input = "It’s lights out and away we go";
        String reversed = reverse(input);
        System.out.println("Обърнат стринг: " + reversed);
    }

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); 
        }
        return reversed;
    }
}

}

  }
}