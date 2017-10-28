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
import android.widget.Toast;

import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;

public class MyModule extends WXModule {
  public void onActivityResult(int requestCode, int resultCode, Intent data) {
    System.out.println("--MyModule----onActivityResult------");
  }

  public void onActivityCreate() {
    System.out.println("--MyModule----onActivityCreate------");
  }

  public void onActivityStart() {
    System.out.println("--MyModule----onActivityStart------");
  }

  public void onActivityPause() {
    System.out.println("--MyModule----onActivityPause------");
  }

  public void onActivityResume() {
    System.out.println("--MyModule----onActivityResume------");
  }

  public void onActivityStop() {
    System.out.println("--MyModule----onActivityStop------");
  }

  public void onActivityDestroy() {
    System.out.println("--MyModule----onActivityDestroy------");
  }

  @JSMethod(uiThread = true)
  public void printLog(String msg) {
    Toast.makeText(mWXSDKInstance.getContext(),msg,Toast.LENGTH_SHORT).show();
  }
}
