package main.com.codecool.java.rule.value;

import java.util.ArrayList;
import java.util.List;

public abstract class Value {
    private final List<String> inputPattern;
    private final boolean selectionType;

    public Value(String pattern, boolean selectionType) {
        this.inputPattern = new ArrayList<>();
        inputPattern.add(pattern);
        this.selectionType = selectionType;
    }

    public Value(List<String> patterns, boolean selectionType) {
        this.inputPattern = patterns;
        this.selectionType = selectionType;
    }

    public List<String> getInputPattern() {
        return inputPattern;
    }

    public boolean getSelectionType() {
        return selectionType;
    }
}
