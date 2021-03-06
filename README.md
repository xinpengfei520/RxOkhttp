# Okla [![](https://jitpack.io/v/xinpengfei520/Okla.svg)](https://jitpack.io/#xinpengfei520/Okla)

![image](https://github.com/xinpengfei520/RxOkhttp/blob/master/sample/src/main/res/drawable/okla_logo.png)

从此，网络请求只需两步！！！

## Step 1:

in your project build.gradle:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

## Step 2:

in your module build.gradle dependencies:

```
implementation 'com.github.xinpengfei520:Okla:<latest-version>'
```

## 1.初始化

在Application中：

```
OklaClient.getInstance().init(this);
```

提示：默认已经配置好 **HttpDns** 域名解析和 **https** 请求。

## 2.请求示例

### 2.1 GET请求

```
	Okla.request()
		.get(url, new ApiRequestListener() {
		            @Override
		            public void onSuccess(String result) {
		                Log.e("TAG" + i, "success===" + result);
		            }
		
		            @Override
		            public void onError(String ex) {
		                Log.e("TAG", "error===" + ex);
		            }
        });
```

### 2.2 POST请求

此种方式支持将map键值对传入，内部进行Json序列化转换，只支持简单的数据类型，不支持Value为集合或者数组的情况！

```
	Okla.request()
		.post(url, map, new ApiRequestListener() {
	                @Override
	                public void onSuccess(String result) {
	                    Log.e("TAG", "success===" + result);
	                }
	
	                @Override
	                public void onError(String ex) {
	                    Log.e("TAG", "error===" + ex);
	                }
            });
```

### 2.3 POST Json String 

此种方式是为了弥补2.2中的缺陷，使用此种方式可以使用第三方框架，如 **Gson** 等，现将Post的内容转换为Json串之后再传入请求网络。

```
	Okla.request()
		.post(url, postJson, new ApiRequestListener() {
                    @Override
                    public void onSuccess(String result) {
                        Log.e("TAG", "success===" + result);
                    }

                    @Override
                    public void onError(String ex) {
                        Log.e("TAG", "error===" + ex);
                    }
                });
```

## Bugs Report

If you find any bug when using Okla, please report **[here](https://github.com/xinpengfei520/Okla/issues/new)**. Thanks for helping us making better.

## Change logs

### 1.5

- fix some bugs;
- upload jitpack repositories;
- optimized code;

### 1.2

 - update on 2018-03-28 add post json overload method.

### 1.0

 - release okla 1.0 on 2017-11-29

## Proguard

```
#okla
-dontwarn com.xpf.http.**
-keep class com.xpf.http.**{*;}

#okhttputils
-dontwarn com.zhy.http.**
-keep class com.zhy.http.**{*;}
	
#okhttp
-dontwarn okhttp3.**
-keep class okhttp3.**{*;}
	
#okio
-dontwarn okio.**
-keep class okio.**{*;}	
```

## LICENSE

```
   Copyright Copyright (C) 2016 x-sir , Okla Framework Open Source Project

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```