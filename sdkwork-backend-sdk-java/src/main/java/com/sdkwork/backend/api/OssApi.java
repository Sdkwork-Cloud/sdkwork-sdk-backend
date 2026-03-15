package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class OssApi {
    private final HttpClient client;
    
    public OssApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing OSS bucket */
    public PlusApiResultPlusOssBucketVO update(PlusOssBucketForm body) throws Exception {
        return (PlusApiResultPlusOssBucketVO) client.put(ApiPaths.backendPath("/oss/bucket"), body);
    }

    /** Create a new OSS bucket */
    public PlusApiResultPlusOssBucketVO create(PlusOssBucketForm body) throws Exception {
        return (PlusApiResultPlusOssBucketVO) client.post(ApiPaths.backendPath("/oss/bucket"), body);
    }

    /** List files */
    public PlusApiResultFileListVO listFiles(Map<String, Object> params) throws Exception {
        return (PlusApiResultFileListVO) client.get(ApiPaths.backendPath("/oss/files"), params);
    }

    /** Upload file */
    public PlusApiResultFileItemVO uploadFile(UploadFileRequest body, Map<String, Object> params) throws Exception {
        return (PlusApiResultFileItemVO) client.post(ApiPaths.backendPath("/oss/files"), body, params, null, "multipart/form-data");
    }

    /** Get upload temporary session */
    public PlusApiResultPlusTempSessionVO getTempSession(PlusGetTempSessionForm body) throws Exception {
        return (PlusApiResultPlusTempSessionVO) client.post(ApiPaths.backendPath("/oss/files/temp_session"), body);
    }

    /** Generate presigned URL */
    public PlusApiResultGetUrlResult getPresignedUrl(PlusGetPresignedUrlForm body) throws Exception {
        return (PlusApiResultGetUrlResult) client.post(ApiPaths.backendPath("/oss/files/get_presigned_url"), body);
    }

    /** Upload file */
    public PlusApiResultPlusFileVO createFiles(PlusUploadForm body) throws Exception {
        return (PlusApiResultPlusFileVO) client.post(ApiPaths.backendPath("/oss/files/create"), body);
    }

    /** Get OSS buckets by page */
    public PlusApiResultPagePlusOssBucketVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusOssBucketVO) client.post(ApiPaths.backendPath("/oss/bucket/list"), body, params);
    }

    /** Get all OSS buckets */
    public PlusApiResultListPlusOssBucketVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusOssBucketVO) client.post(ApiPaths.backendPath("/oss/bucket/list/all"), body);
    }

    /** Get file */
    public PlusApiResultFileItemVO getFile(String fileId) throws Exception {
        return (PlusApiResultFileItemVO) client.get(ApiPaths.backendPath("/oss/files/" + fileId + ""));
    }

    /** Delete file */
    public PlusApiResultFileItemVO deleteFile(String fileId) throws Exception {
        return (PlusApiResultFileItemVO) client.delete(ApiPaths.backendPath("/oss/files/" + fileId + ""));
    }

    /** Get file content */
    public String getFileContent(String fileId) throws Exception {
        return (String) client.get(ApiPaths.backendPath("/oss/files/" + fileId + "/content"));
    }

    /** Get an OSS bucket by ID */
    public PlusApiResultPlusOssBucketVO getById(String id) throws Exception {
        return (PlusApiResultPlusOssBucketVO) client.get(ApiPaths.backendPath("/oss/bucket/" + id + ""));
    }

    /** Delete an OSS bucket */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/oss/bucket/" + id + ""));
    }
}
