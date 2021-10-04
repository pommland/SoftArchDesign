package com.solid.book;

public class PrintToScreen {
  
    static void printToScreen(Book book) {
        //Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
    
}
