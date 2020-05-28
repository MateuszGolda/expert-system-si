package main.com.codecool.java.rule;

import main.com.codecool.java.rule.value.Value;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Answer {
    private final List<Value> values;

    public Answer() {
        this.values = new ArrayList<>();
    }

    public boolean evaluateAnswerByInput(String input) {
        for (Value value : this.values) {
            if (value.getInputPattern().contains(input)) {
                return value.getSelectionType();
            }
        }
        throw new InputMismatchException();
    }

    public void addValue(Value value) {
        values.add(value);
    }
}
