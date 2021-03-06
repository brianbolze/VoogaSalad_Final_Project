package gameEngine.actors.behaviors;

import gameEngine.actors.BaseActor;
import java.util.Comparator;
import java.util.List;


public class FarthestRangeAttack extends RangeAttack {

    public FarthestRangeAttack (List<Double> list) {
        super(list);
    }

    public FarthestRangeAttack (double attackSpeed) {
        super(attackSpeed);
    }

    @Override
    public Comparator<BaseActor> defineComparison (BaseActor a) {
        return (BaseActor a1, BaseActor a2) -> Double
                .compare(((BaseMovementBehavior) (a1.getBehavior("movement")))
                        .getRemainingDistance(),
                         ((BaseMovementBehavior) (a2.getBehavior("movement")))
                                 .getRemainingDistance());
    }

    @Override
    public IBehavior copy () {
        return new FarthestRangeAttack(myList);
    }


}
