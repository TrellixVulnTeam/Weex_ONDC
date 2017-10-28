/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.alibaba.weex.extend.module;

import android.content.Intent;
import android.util.Log;

import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;


public class RenderModule extends WXModule {
  public void onActivityResult(int requestCode, int resultCode, Intent data) {
    System.out.println("--RenderModule----onActivityResult------");
  }

  public void onActivityCreate() {
    System.out.println("--RenderModule----onActivityCreate------");
  }

  public void onActivityStart() {
    System.out.println("--RenderModule----onActivityStart------");
  }

  public void onActivityPause() {
    System.out.println("--RenderModule----onActivityPause------");
  }

  public void onActivityResume() {
    System.out.println("--RenderModule----onActivityResume------");
  }

  public void onActivityStop() {
    System.out.println("--RenderModule----onActivityStop------");
  }

  public void onActivityDestroy() {
    System.out.println("--RenderModule----onActivityDestroy------");
  }

  @JSMethod
  public void performClick() {
    Log.d("Render", "Render");
  }
}
