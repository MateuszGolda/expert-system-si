package main.com.codecool.java;

import main.com.codecool.java.fact.FactParser;
import main.com.codecool.java.fact.FactRepository;
import main.com.codecool.java.rule.Answer;
import main.com.codecool.java.rule.Question;
import main.com.codecool.java.rule.RuleParser;
import main.com.codecool.java.rule.RuleRepository;

import java.util.HashMap;
import java.util.Map;

public class ESProvider {
    Map rules = new HashMap<Question, Answer>();
    FactRepository factRepository;
    RuleRepository ruleRepository;

    ESProvider(FactParser factParser, RuleParser ruleParser) {
        factRepository = FactParser.getFactRepository();
        ruleRepository = RuleParser.getRuleRepository();
    }

    public void collectedAnswers() {

    }

    public boolean getAnswerByQuestion(String questionId) {

        return false;
    }

    public String evaluate() {

        return null;
    }
}
