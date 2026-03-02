package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class NotificationApi(private val client: HttpClient) {

    /** Update an existing notification */
    suspend fun update(body: PlusNotificationForm): PlusApiResultPlusNotificationVO? {
        return client.put(ApiPaths.backendPath("/notification"), body) as? PlusApiResultPlusNotificationVO
    }

    /** Create a new notification */
    suspend fun create(body: PlusNotificationForm): PlusApiResultPlusNotificationVO? {
        return client.post(ApiPaths.backendPath("/notification"), body) as? PlusApiResultPlusNotificationVO
    }

    /** Get notifications by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusNotificationVO? {
        return client.post(ApiPaths.backendPath("/notification/list"), body, params) as? PlusApiResultPagePlusNotificationVO
    }

    /** Get all notifications */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusNotificationVO? {
        return client.post(ApiPaths.backendPath("/notification/list/all"), body) as? PlusApiResultListPlusNotificationVO
    }

    /** Get a notification by ID */
    suspend fun getById(id: String): PlusApiResultPlusNotificationVO? {
        return client.get(ApiPaths.backendPath("/notification/$id")) as? PlusApiResultPlusNotificationVO
    }

    /** Delete a notification */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/notification/$id")) as? PlusApiResultBoolean
    }
}
