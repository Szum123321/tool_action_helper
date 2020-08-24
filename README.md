This is small library meant for adding blocks to minecraft tools.

You currently can:
 * Add new blocks for stripping (Axe)
 * Add new blocks for tilling (Hoe)
 * Add new blocks for paths (Shovel)
 * Make shovel and\or axe effective on some blocks
 
All you have to do is get an instance of correct helper interface ([interface].getInstance()) and add your blocks there.
Keep in mind that this has to take place in mod's init.

Below you can see example class:

```java
    public class ExampleClass implements ModInitializer {
        @Override
        public void onInitialize() {
            /*
                This line makes shovel effective on cobweb (just like sword)
            */
            ToolEffectivenessHelper.getInstance().addEffectiveBlockToShovel(Blocks.COBWEB);  
            
            /*
                When you use hoe on hay, it will turn into mycelinum             
            */
            HoeTillingHelper.getInstance().addNewTilledPair(Blocks.HAY_BLOCK, Blocks.MYCELIUM.getDefaultState());

            /*
                When you use axe on Quartz Pillar, it will turn into bone block             
            */    
            AxeStrippingHelper.getInstance().addNewStrippingPair(Blocks.QUARTZ_PILLAR, Blocks.BONE_BLOCK);
 
            /*
                When you use shovel on gravel, it will turn into sand           
            */     
            ShovelPathHelper.getInstance().addNewPathPair(Blocks.GRAVEL, Blocks.SAND.getDefaultState());
        }
    }
```

Add this tou build.gradle to use this library:
```groovy
repositories{
	maven {
		url = 'https://raw.githubusercontent.com/Szum123321/SzumMaven/master/'
	}
}

dependencies {
	modImplementation "net.szum123321:tool_action_helper:[newest version]"
	
	//Uncomment this line if you want to include this mod in your mod's jar
	//include "net.szum123321:tool_action_helper:[newest version]"
}
```

Feel free to use this as library or stand-alone mod in your mod/modpack.
