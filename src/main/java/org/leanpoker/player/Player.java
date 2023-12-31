package org.leanpoker.player;

import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class Player {

    private static final Logger log = getLogger(Player.class);

    static final String VERSION = "3 1k with logs";

    public static int betRequest(JsonNode request) {
        log.info(request.toString());
        return 1000;
    }

    public static void showdown(JsonNode game) {
    }
}
