package com.cg.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {

        String name = "Sumit";
        int age = 22;

        logger.info("Student Name : {}", name);

        logger.info("Age : {}", age);

    }

}