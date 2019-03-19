/*
 * Copyright 2019 Actian Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.actian.dc.clientsdk.samples;

import java.util.logging.*;

/**
 * Simple logging utility used by the Client SDK Samples project
 */
public class LogUtil 
{
    static Logger getLogger(Class<?> clazz) {
        // Set the log level to Info and send logs to the console
        Logger logger = Logger.getLogger(clazz.getName());
        logger.setLevel(Level.INFO);
        Handler handler = new ConsoleHandler();
        handler.setFormatter(new SimpleFormatter()); 
        return logger;
    }
}
