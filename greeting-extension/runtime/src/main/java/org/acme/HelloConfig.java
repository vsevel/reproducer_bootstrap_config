package org.acme;

import io.quarkus.runtime.annotations.ConfigGroup;
import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

import java.util.Map;

@ConfigRoot(name = "greeting", phase = ConfigPhase.BOOTSTRAP)
public class HelloConfig {

    /**
     * doc
     */
    @ConfigItem(name = "map")
    public Map<String, MapConfig> map;

    @Override
    public String toString() {
        return "HelloConfig{" + "map=" + map + '}';
    }

    @ConfigGroup
    public static class MapConfig {

        /**
         * doc
         */
        @ConfigItem(name = ConfigItem.PARENT)
        String value;

        public MapConfig(String value) {
            this.value = value;
        }

        public MapConfig() {
            value = "";
        }

        @Override
        public String toString() {
            return "MapConfig{" + "value=" + value + '}';
        }
    }
}
