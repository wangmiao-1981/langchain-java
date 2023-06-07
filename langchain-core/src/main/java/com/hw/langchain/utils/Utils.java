/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hw.langchain.utils;

import lombok.experimental.UtilityClass;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

/**
 * Utils
 * @author HamaWhite
 */
@UtilityClass
public class Utils {

    public static String getOrEnvOrDefault(String originalValue, String envKey, String... defaultValue) {
        if (isNotEmpty(originalValue)) {
            return originalValue;
        }
        String envValue = System.getenv(envKey);
        if (isNotEmpty(envValue)) {
            return envValue;
        }
        if (defaultValue.length > 0) {
            return defaultValue[0];
        }
        return null;
    }
}
