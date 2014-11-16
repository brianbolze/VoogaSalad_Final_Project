package gameEngine.actors;

import gameEngine.actors.behaviors.BaseMovementBehavior;
import gameEngine.actors.behaviors.IBehavior;
import java.util.ArrayList;
import java.util.List;

public class BaseProjectile extends BaseActor{

    private ProjectileInfo myInfo;
    public BaseProjectile (ProjectileInfo info, BaseMovementBehavior move) {
        myInfo=info;
        List<IBehavior> behaviors=new ArrayList<IBehavior>();
        behaviors.add(move);
        myBehaviors=behaviors;
        // TODO Auto-generated constructor stub
    }
    public ProjectileInfo getInfo(){
        return myInfo;
    }
}
