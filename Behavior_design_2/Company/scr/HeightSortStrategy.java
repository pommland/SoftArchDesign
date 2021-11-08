// package edu.parinya.softarchdesign.behavior2;

import java.util.List;

public class HeightSortStrategy implements SortStrategy {
    // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!

    @Override
    public void customSort(List<Person> people) {
        people.sort((person1, person2) -> Integer.compare(person1.getHeight(), person2.getHeight()));  
    }
 
        
        
        
    

}
