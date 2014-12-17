/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package com.kanhan.ywca;

import android.content.Intent;
import android.os.Bundle;

import org.apache.cordova.CordovaActivity;

public class YWCA extends CordovaActivity
{
    public final static String STAGE_ID = "STAGE_ID";
    @Override
    public void onCreate(Bundle savedInstanceState)
    {

        Intent intent = getIntent();
        String gameId = "2";
        String in;
        if(intent != null){
            gameId = String.valueOf(intent.getIntExtra(STAGE_ID,1));
        }
        super.onCreate(savedInstanceState);
        // Set by <content src="index.html" /> in config.xml
        //loadUrl(launchUrl);
        loadUrl("file:///android_asset/www/index.html");

    }
}
