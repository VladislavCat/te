package com.example.myapplication.parenthesis;

public interface SolutionParenthesis {
    String parentCalc(String text, String charFind);
    default boolean isParent(String text, String charFind) {
        return text.contains(charFind);
    }

}
