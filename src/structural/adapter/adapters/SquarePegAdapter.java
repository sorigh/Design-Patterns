package structural.adapter.adapters;

import structural.adapter.round.RoundPeg;
import structural.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;
    public SquarePegAdapter(SquarePeg peg){
        this.peg = peg;
    }
    @Override
    public double getRadius(){
        double result;
        result = Math.sqrt(Math.pow((peg.getWidth()/2), 2) *2);
        return result;
    }

}
