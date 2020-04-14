package main.com.codecool.java.rule;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RuleRepository {
    /* The RuleParser adds the questions with their corresponding id to the RuleRepository instance.
    This is stored in a Map inside the RuleRepository (as a field instance).
    The RuleRepository constructor initializes the QuestionIterator inner class that implements the Iterator interface.
    With this we can iterate through the questions later.
     */
    Map rules = new HashMap<Question, Answer>();
    Iterator<Question> questionIterator;

    RuleRepository() {
        questionIterator = new QuestionIterator();
    }

    public void addQuestion(Question question) {

    }

    public Iterator<Question> getIterator() {
        return new QuestionIterator();
    }

    public class QuestionIterator implements Iterator<Question> {
        public QuestionIterator() {
            
        }

        @Override
        public boolean hasNext() {

            return false;
        }

        @Override
        public Question next() {

            return null;
        }
    }
}
