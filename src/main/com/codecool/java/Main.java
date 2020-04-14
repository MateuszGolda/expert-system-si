package main.com.codecool.java;

import main.com.codecool.java.fact.FactParser;
import main.com.codecool.java.rule.RuleParser;

public class Main {

    public static void main(String[] args) {
	    ESProvider eSProvider = new ESProvider(new FactParser(), new RuleParser());
    }
}
