package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void isValid() {
        String s = "{}{}{}}{}(((())))[][][][][][]";
        ValidParentheses validParentheses = new ValidParentheses();
        boolean valid = validParentheses.isValid(s);
        System.out.println(valid);
    }
}