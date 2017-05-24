package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable,Defensable{

    private static int hitCount;
    public String name;

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {

            attackedBodyPart = BodyPart.CHEST;
        }
        else  {
            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defencedBodyPart = null;
        hitCount = hitCount + 2;

        if (hitCount == 1) {
            defencedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {

            defencedBodyPart = BodyPart.CHEST;
        } else if (hitCount == 3) {
            defencedBodyPart = BodyPart.ARM;
        } else {
            hitCount = 0;
            defencedBodyPart = BodyPart.LEG;
        }
        return defencedBodyPart;
    }
    public String getName() {
        return name;
    }
}
