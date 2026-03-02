package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class CharacterApi {
    private final HttpClient client;
    
    public CharacterApi(HttpClient client) {
        this.client = client;
    }

    /** Update character */
    public PlusApiResultPlusCharacterVO update(PlusCharacterForm body) throws Exception {
        return (PlusApiResultPlusCharacterVO) client.put(ApiPaths.backendPath("/character"), body);
    }

    /** Create character */
    public PlusApiResultPlusCharacterVO create(PlusCharacterForm body) throws Exception {
        return (PlusApiResultPlusCharacterVO) client.post(ApiPaths.backendPath("/character"), body);
    }

    /** Get characters by page */
    public PlusApiResultPagePlusCharacterVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusCharacterVO) client.post(ApiPaths.backendPath("/character/list"), body, params);
    }

    /** Get all characters */
    public PlusApiResultListPlusCharacterVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusCharacterVO) client.post(ApiPaths.backendPath("/character/list/all"), body);
    }

    /** Get character by ID */
    public PlusApiResultPlusCharacterVO getById(String id) throws Exception {
        return (PlusApiResultPlusCharacterVO) client.get(ApiPaths.backendPath("/character/" + id + ""));
    }

    /** Delete character */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/character/" + id + ""));
    }
}
