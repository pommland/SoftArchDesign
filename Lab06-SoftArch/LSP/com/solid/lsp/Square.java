package com.solid.lsp;

public class Square extends  CalculateArea {
    private int side;

    Square(int side) {
        this.side = side;
    }


    public void setSide(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }


}
