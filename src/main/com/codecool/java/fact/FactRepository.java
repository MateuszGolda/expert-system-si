package main.com.codecool.java.fact;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class FactRepository {
    final Deque<Fact> facts;

    FactRepository() {
        facts = new ArrayDeque<>();
    }

    public void addFact(Fact fact) {
        facts.add(fact);
    }

    public Iterator<Fact> getIterator() {
        return new FactIterator();
    }

    public class FactIterator implements Iterator<Fact> {
        final Deque<Fact> factsToIterate;

        FactIterator() {
            factsToIterate = facts;
        }

        @Override
        public boolean hasNext() {
            return !factsToIterate.isEmpty();
        }

        @Override
        public Fact next() {
            return factsToIterate.pop();
        }
    }
}
