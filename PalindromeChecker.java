import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";
        boolean isPalindrome = checkPalindrome(str);
        System.out.println("Стрингът \"" + str + "\" е палиндром: " + isPalindrome);
    }

    public static boolean checkPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
    }
}

}

  }
}