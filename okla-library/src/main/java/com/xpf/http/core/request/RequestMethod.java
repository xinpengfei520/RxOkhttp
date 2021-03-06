package com.xpf.http.core.request;

import com.xpf.http.core.callback.ApiRequestListener;
import com.xpf.http.logger.XLog;

import java.util.HashMap;

/**
 * Created by xpf on 2017/11/29 :)
 * Function:request method.
 */

public class RequestMethod {

    /**
     * get
     *
     * @param url      request url.
     * @param listener result callback.
     */
    public void get(String url, ApiRequestListener listener) {
        XLog.i("url===" + url);
        OkhttpFactory.get(url, listener);
    }

    /**
     * post
     *
     * @param url      request url.
     * @param map      map params.
     * @param listener result callback.
     */
    public void post(String url, HashMap<String, Object> map, ApiRequestListener listener) {
        XLog.i("url===" + url);
        OkhttpFactory.post(url, map, listener);
    }

    /**
     * post (overload method)
     *
     * @param url      request url
     * @param json     post json body
     * @param listener callback listener
     */
    public void post(String url, String json, ApiRequestListener listener) {
        XLog.i("url===" + url);
        OkhttpFactory.post(url, json, listener);
    }
}
