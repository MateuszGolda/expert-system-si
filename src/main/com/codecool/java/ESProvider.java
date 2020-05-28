package main.com.codecool.java;

import main.com.codecool.java.fact.Fact;
import main.com.codecool.java.fact.FactParser;
import main.com.codecool.java.rule.Question;
import main.com.codecool.java.rule.RuleParser;

import java.util.*;

public class ESProvider {
    final Scanner sc;
    final FactParser factParser;
    final RuleParser ruleParser;
    final Map<String, Boolean> userSelection;

    public ESProvider(FactParser factParser, RuleParser ruleParser) {
        sc = new Scanner(System.in);
        this.factParser = factParser;
        this.ruleParser = ruleParser;
        this.userSelection = new HashMap<>();
    }

    public void collectAnswers() {
        Iterator<Question> questionIterator = this.ruleParser.getRuleRepository().getIterator();

        while (questionIterator.hasNext()) {
            Question question = questionIterator.next();
            String questionId = question.getId();
            System.out.println(question.getQuestion());
            boolean userAnswer = getAnswerByQuestion(question);

            this.userSelection.put(questionId, userAnswer);
        }
        sc.close();
    }

    public boolean getAnswerByQuestion(Question question) {
        String userInput;
        boolean validInput = false;
        boolean answer = false;
        while (!validInput) {
            userInput = sc.next();
            try {
                answer = question.getEvaluatedAnswer(userInput);
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Unrecognised answer, try again.");
            }
        }
        return answer;
    }

    public String evaluate() {
        String result = "";
        Iterator<Fact> factIterator = this.factParser.getFactRepository().getIterator();
        Fact fact;
        while (factIterator.hasNext()) {
            fact = factIterator.next();
            if (!checkMatch(fact.getIdSet(), fact)) {
                continue;
            }
            result = fact.getDescription();
        }
        return result;
    }

    private boolean checkMatch(Set<String> idSet, Fact fact) {

        for (String id : idSet) {
            if (fact.getValueById(id) != this.userSelection.get(id)) {
                return false;
            }
        }
        return true;
    }
}
