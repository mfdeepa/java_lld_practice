package practiceDesignPattern.pen2.controller;
import practiceDesignPattern.pen2.Strategy.DottedWriting;
import practiceDesignPattern.pen2.Strategy.SmoothWriting;
import practiceDesignPattern.pen2.ballPen.BallPen;
import practiceDesignPattern.pen2.fountainPen.FountainPen;
import practiceDesignPattern.pen2.gelPen.GelPen;
import practiceDesignPattern.pen2.model.Brand;
import practiceDesignPattern.pen2.model.Pen;
import practiceDesignPattern.pen2.model.PenBody;
import practiceDesignPattern.pen2.model.PenType;

public class Client {
    // can we create the factory for all the pentype ?

    public static void main(String[] args) {
        Pen pen = null;
        //pen = new BallPen("celo", "deepti", PenType.BALL, 7.15, 5, new RoughWriting(), PenBody.SINGLE_CAP);
       // pen.write();
        //System.out.println(pen); // by default its calling to toString method in pen class.
        PenType pt = PenType.BALL;
        switch(pt){
            case GEL -> {pen = new GelPen(Brand.CELLO,"deepa", PenType.GEL, 17.0, 6, new DottedWriting(), PenBody.PARTITION_CAP);
            break;}
            case BALL -> {pen = new BallPen(Brand.CELLO,"deepa",PenType.BALL,14.0,5, new SmoothWriting(), PenBody.SINGLE_CAP);
            break;}
            case FOUNTAIN -> {pen = new FountainPen(Brand.CROSS_PEN,"Deepali", PenType.FOUNTAIN,20.0, 6, new DottedWriting(), PenBody.PARTITION_CAP);
            break;}
            default -> {}

        }
        pen.write();
    }
}
