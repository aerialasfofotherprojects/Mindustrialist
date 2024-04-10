package mindustrialist.content;

import mindustry.ai.types.*;
import mindustry.type.*;
import mindustry.type.unit.*;

import static mindustry.Vars.tilesize;

public class MDITUnitTypes {
    public static UnitType builder;
    
    public static void load(){
        builder = new ErekirUnitType("builder"){{
            coreUnitDock = true;
            controller = u -> new BuilderAI(true, 2147483647f);
            isEnemy = false;
            envDisabled = 0;
            
            range = 60f;
            faceTarget = true;
            targetPriority = -2;
            lowAltitude = false;
            mineWalls = false;
            mineFloor = false;
            mineHardnessScaling = false;
            flying = true;
            mineSpeed = 6f;
            mineTier = 696969696;
            buildSpeed = 1.2f;
            drag = 0.08f;
            speed = 5.6f;
            rotateSpeed = 7f;
            accel = 0.09f;
            itemCapacity = 1;
            health = 0.000000000000000000000000000000000000000000001f;
            armor = 1f;
            hitSize = 9f;
            engineSize = 0;
            payloadCapacity = 2f * 2f * tilesize * tilesize;
            pickupUnits = false;
            vulnerableWithPayloads = true;
        }};
    }
}
