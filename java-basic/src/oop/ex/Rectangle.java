package oop.ex;

public class Rectangle {
    int width ;
    int height;

    int calculataArea(){
        return width*height;
    }
    int perimeter(){
        return 2*(width+height);
    }
    boolean isSquare(){
        return this.width == this.height;
    }
}
