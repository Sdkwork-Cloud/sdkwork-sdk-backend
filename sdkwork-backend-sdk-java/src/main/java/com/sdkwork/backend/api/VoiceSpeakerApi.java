package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class VoiceSpeakerApi {
    private final HttpClient client;
    
    public VoiceSpeakerApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing voice speaker */
    public PlusApiResultPlusVoiceSpeakerVO update(PlusVoiceSpeakerForm body) throws Exception {
        return (PlusApiResultPlusVoiceSpeakerVO) client.put(ApiPaths.backendPath("/voice/speaker"), body);
    }

    /** Create a new voice speaker */
    public PlusApiResultPlusVoiceSpeakerVO create(PlusVoiceSpeakerForm body) throws Exception {
        return (PlusApiResultPlusVoiceSpeakerVO) client.post(ApiPaths.backendPath("/voice/speaker"), body);
    }

    /** Get voice speakers by page */
    public PlusApiResultPagePlusVoiceSpeakerVO listPublic(PlusVoiceSpeakerQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVoiceSpeakerVO) client.post(ApiPaths.backendPath("/voice/speaker/list_public"), body, params);
    }

    /** Get voice speakers by page */
    public PlusApiResultPagePlusVoiceSpeakerVO listByPage(PlusVoiceSpeakerQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVoiceSpeakerVO) client.post(ApiPaths.backendPath("/voice/speaker/list"), body, params);
    }

    /** Get all voice speakers */
    public PlusApiResultListPlusVoiceSpeakerVO listAllEntities(PlusVoiceSpeakerQueryForm body) throws Exception {
        return (PlusApiResultListPlusVoiceSpeakerVO) client.post(ApiPaths.backendPath("/voice/speaker/list/all"), body);
    }

    /** Get a voice speaker by ID */
    public PlusApiResultPlusVoiceSpeakerVO getById(String id) throws Exception {
        return (PlusApiResultPlusVoiceSpeakerVO) client.get(ApiPaths.backendPath("/voice/speaker/" + id + ""));
    }

    /** Delete a voice speaker */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/voice/speaker/" + id + ""));
    }
}
