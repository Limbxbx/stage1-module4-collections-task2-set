package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> setOfSquares = new TreeSet<>();

        for (Integer number : sourceList) {
            int square = number * number;
            setOfSquares.add(square);
        }

        return setOfSquares.subSet(lowerBound, true, upperBound, true);
    }
}
