package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class AppApi {
    private final HttpClient client;
    
    public AppApi(HttpClient client) {
        this.client = client;
    }

    /** Get app SDK config */
    public PlusApiResultAppSdkConfigVO getSdkConfig(CreateJsapiSignatureForm body) throws Exception {
        return (PlusApiResultAppSdkConfigVO) client.post(ApiPaths.backendPath("/app/get_sdk_config"), body);
    }

    /** Get app info */
    public PlusApiResultAppInfoVO getAppInfo() throws Exception {
        return (PlusApiResultAppInfoVO) client.get(ApiPaths.backendPath("/app/info"));
    }
}
