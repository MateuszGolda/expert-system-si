package main.com.codecool.java.rule;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class RuleRepository {
    private final Deque<Question> questions;

    public RuleRepository() {
        this.questions = new ArrayDeque<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public Iterator<Question> getIterator() {
        return new QuestionIterator();
    }

    public class QuestionIterator implements Iterator<Question> {
        final Deque<Question> questionsToIterate;

        QuestionIterator() {
            questionsToIterate = questions;
        }

        @Override
        public boolean hasNext() {
            return !questionsToIterate.isEmpty();
        }

        @Override
        public Question next() {
            return questionsToIterate.pop();
        }
    }
}
