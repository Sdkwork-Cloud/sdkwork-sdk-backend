package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class DiskApi(private val client: HttpClient) {

    /** Update an existing file disk */
    suspend fun update(body: PlusDiskForm): PlusApiResultPlusDiskVO? {
        return client.put(ApiPaths.backendPath("/disk"), body) as? PlusApiResultPlusDiskVO
    }

    /** Create a new file disk */
    suspend fun create(body: PlusDiskForm): PlusApiResultPlusDiskVO? {
        return client.post(ApiPaths.backendPath("/disk"), body) as? PlusApiResultPlusDiskVO
    }

    /** Update an existing disk member */
    suspend fun updateMember(body: PlusDiskMemberForm): PlusApiResultPlusDiskMemberVO? {
        return client.put(ApiPaths.backendPath("/disk/member"), body) as? PlusApiResultPlusDiskMemberVO
    }

    /** Create a new disk member */
    suspend fun createMember(body: PlusDiskMemberForm): PlusApiResultPlusDiskMemberVO? {
        return client.post(ApiPaths.backendPath("/disk/member"), body) as? PlusApiResultPlusDiskMemberVO
    }

    /** Get disk members by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusDiskMemberVO? {
        return client.post(ApiPaths.backendPath("/disk/member/list"), body, params) as? PlusApiResultPagePlusDiskMemberVO
    }

    /** Get all disk members */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusDiskMemberVO? {
        return client.post(ApiPaths.backendPath("/disk/member/list/all"), body) as? PlusApiResultListPlusDiskMemberVO
    }

    /** Get file disks by page */
    suspend fun createListByPageDisk(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusDiskVO? {
        return client.post(ApiPaths.backendPath("/disk/list"), body, params) as? PlusApiResultPagePlusDiskVO
    }

    /** Get all file disks */
    suspend fun createListAllEntitiesDisk(body: QueryListForm? = null): PlusApiResultListPlusDiskVO? {
        return client.post(ApiPaths.backendPath("/disk/list/all"), body) as? PlusApiResultListPlusDiskVO
    }

    /** List files */
    suspend fun getListFiles(params: Map<String, Any>? = null): PlusApiResultFileListVO? {
        return client.get(ApiPaths.backendPath("/disk/files"), params) as? PlusApiResultFileListVO
    }

    /** Upload file */
    suspend fun createUploadFile(body: CreateUploadFileRequest? = null, params: Map<String, Any>? = null): PlusApiResultFileItemVO? {
        return client.post(ApiPaths.backendPath("/disk/files"), body, params, null, "multipart/form-data") as? PlusApiResultFileItemVO
    }

    /** Get a file disk by ID */
    suspend fun getById(id: String): PlusApiResultPlusDiskVO? {
        return client.get(ApiPaths.backendPath("/disk/$id")) as? PlusApiResultPlusDiskVO
    }

    /** Delete a file disk */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/disk/$id")) as? PlusApiResultBoolean
    }

    /** Get a disk member by ID */
    suspend fun getByIdMember(id: String): PlusApiResultPlusDiskMemberVO? {
        return client.get(ApiPaths.backendPath("/disk/member/$id")) as? PlusApiResultPlusDiskMemberVO
    }

    /** Delete a disk member */
    suspend fun deleteMember(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/disk/member/$id")) as? PlusApiResultBoolean
    }

    /** Get file */
    suspend fun getFile(fileId: String): PlusApiResultFileItemVO? {
        return client.get(ApiPaths.backendPath("/disk/files/$fileId")) as? PlusApiResultFileItemVO
    }

    /** Delete file */
    suspend fun deleteFile(fileId: String): PlusApiResultFileItemVO? {
        return client.delete(ApiPaths.backendPath("/disk/files/$fileId")) as? PlusApiResultFileItemVO
    }

    /** Get file content */
    suspend fun getFileContent(fileId: String): String? {
        return client.get(ApiPaths.backendPath("/disk/files/$fileId/content")) as? String
    }
}
