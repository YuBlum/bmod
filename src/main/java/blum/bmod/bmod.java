package blum.bmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class bmod implements ModInitializer {
    public static final String MOD_ID = "bmod";
    public static final Logger logger = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        logger.info("Hello, World!");
    }
}
