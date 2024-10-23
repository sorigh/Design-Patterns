package structural.adapter;

import structural.adapter.adapters.SquarePegAdapter;
import structural.adapter.round.RoundHole;
import structural.adapter.round.RoundPeg;
import structural.adapter.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("round peg r5 fits in hole r5");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("square peg w2 fits round hole r5");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("square peg w20 doesnt fit into round hole r5");
        }
    }
}
