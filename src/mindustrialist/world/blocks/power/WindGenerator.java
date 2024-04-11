package mindustrialist.world.blocks.power;

import arc.*;
import arc.audio.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.struct.*;
import arc.util.*;
import arc.util.io.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.units.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.blocks.power.PowerGenerator;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import java.util.Random;

import static mindustry.Vars.*;

public class WindGenerator extends PowerGenerator {
    public float maxPower = 3.2f;
    public float minPower = 0f;
    
    private static final Random random = new Random();
    
    public WindGenerator(String name) {
        super(name);
        flags = EnumSet.of(BlockFlag.generator);
        envEnabled = Env.terrestrial;
    }
    
    @Override
    public void setStats(){
        super.setStats();
        stats.remove(generationType);
        stats.add(generationType, powerProduction * 60f, StatUnit.powerSecond);
    }
    
    public class WindGeneratorBuild extends GeneratorBuild{
        
        public float changeTime;
        
        @Override
        public void updateTile() {
            changeTime += Time.delta;
            if (changeTime > 10800) {
                changeTime = 0;
                productionEfficiency = Mathf.random(minPower, maxPower);
            }
        }
    }
}