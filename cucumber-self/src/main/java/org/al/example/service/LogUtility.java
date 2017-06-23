package org.al.example.service;

import org.apache.logging.log4j.*;

public class LogUtility {

    private static final Logger logger = LogManager.getLogger(LogUtility.class);

    public static void logInfo(String message) {
        logger.log(Level.INFO, message);
    }

    public static void logDebug(String message) {
        logger.log(Level.DEBUG, message);
    }
}
