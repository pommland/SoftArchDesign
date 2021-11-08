// package edu.parinya.softarchdesign.behavior2;

import java.util.Comparator;
import java.util.List;

public class WeightStrategy implements SortStrategy {

    @Override
    public void customSort(List<Person> people) {
        people.sort((person1, person2) -> Integer.compare(person1.getWeight(), person2.getWeight()));  
    }
 
    // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!

}
