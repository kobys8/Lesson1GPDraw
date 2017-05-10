/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1gpdraw;

import gpdraw.*;
/**
 *
 * @author kms080
 */
public class Lesson1GPDraw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DrawL myL = new DrawL();
        myL.draw();
    }
}

class DrawL {
    private SketchPad myPaper;
    private DrawingTool myPencil;
    public DrawL() {
        myPaper = new SketchPad(300,300);
        myPencil = new DrawingTool(myPaper);
    }
    public void draw() {
        myPencil.turnLeft(90);
        myPencil.forward(100);
        myPencil.turnRight(90);
        myPencil.forward(200);
    }
}
