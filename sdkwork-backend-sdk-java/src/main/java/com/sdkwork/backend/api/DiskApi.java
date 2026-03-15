package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class DiskApi {
    private final HttpClient client;
    
    public DiskApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing file disk */
    public PlusApiResultPlusDiskVO update(PlusDiskForm body) throws Exception {
        return (PlusApiResultPlusDiskVO) client.put(ApiPaths.backendPath("/disk"), body);
    }

    /** Create a new file disk */
    public PlusApiResultPlusDiskVO create(PlusDiskForm body) throws Exception {
        return (PlusApiResultPlusDiskVO) client.post(ApiPaths.backendPath("/disk"), body);
    }

    /** Update an existing disk member */
    public PlusApiResultPlusDiskMemberVO updateMember(PlusDiskMemberForm body) throws Exception {
        return (PlusApiResultPlusDiskMemberVO) client.put(ApiPaths.backendPath("/disk/member"), body);
    }

    /** Create a new disk member */
    public PlusApiResultPlusDiskMemberVO createMember(PlusDiskMemberForm body) throws Exception {
        return (PlusApiResultPlusDiskMemberVO) client.post(ApiPaths.backendPath("/disk/member"), body);
    }

    /** Get disk members by page */
    public PlusApiResultPagePlusDiskMemberVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusDiskMemberVO) client.post(ApiPaths.backendPath("/disk/member/list"), body, params);
    }

    /** Get all disk members */
    public PlusApiResultListPlusDiskMemberVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusDiskMemberVO) client.post(ApiPaths.backendPath("/disk/member/list/all"), body);
    }

    /** Get file disks by page */
    public PlusApiResultPagePlusDiskVO createListByPageDisk(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusDiskVO) client.post(ApiPaths.backendPath("/disk/list"), body, params);
    }

    /** Get all file disks */
    public PlusApiResultListPlusDiskVO createListAllEntitiesDisk(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusDiskVO) client.post(ApiPaths.backendPath("/disk/list/all"), body);
    }

    /** List files */
    public PlusApiResultFileListVO getListFiles(Map<String, Object> params) throws Exception {
        return (PlusApiResultFileListVO) client.get(ApiPaths.backendPath("/disk/files"), params);
    }

    /** Upload file */
    public PlusApiResultFileItemVO createUploadFile(CreateUploadFileRequest body, Map<String, Object> params) throws Exception {
        return (PlusApiResultFileItemVO) client.post(ApiPaths.backendPath("/disk/files"), body, params, null, "multipart/form-data");
    }

    /** Get a file disk by ID */
    public PlusApiResultPlusDiskVO getById(String id) throws Exception {
        return (PlusApiResultPlusDiskVO) client.get(ApiPaths.backendPath("/disk/" + id + ""));
    }

    /** Delete a file disk */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/disk/" + id + ""));
    }

    /** Get a disk member by ID */
    public PlusApiResultPlusDiskMemberVO getByIdMember(String id) throws Exception {
        return (PlusApiResultPlusDiskMemberVO) client.get(ApiPaths.backendPath("/disk/member/" + id + ""));
    }

    /** Delete a disk member */
    public PlusApiResultBoolean deleteMember(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/disk/member/" + id + ""));
    }

    /** Get file */
    public PlusApiResultFileItemVO getFile(String fileId) throws Exception {
        return (PlusApiResultFileItemVO) client.get(ApiPaths.backendPath("/disk/files/" + fileId + ""));
    }

    /** Delete file */
    public PlusApiResultFileItemVO deleteFile(String fileId) throws Exception {
        return (PlusApiResultFileItemVO) client.delete(ApiPaths.backendPath("/disk/files/" + fileId + ""));
    }

    /** Get file content */
    public String getFileContent(String fileId) throws Exception {
        return (String) client.get(ApiPaths.backendPath("/disk/files/" + fileId + "/content"));
    }
}
