package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VipApi(private val client: HttpClient) {

    /** Update an existing VIP user */
    suspend fun update(body: PlusVipUserForm): PlusApiResultPlusVipUserVO? {
        return client.put(ApiPaths.backendPath("/vip/user"), body) as? PlusApiResultPlusVipUserVO
    }

    /** Create a new VIP user */
    suspend fun create(body: PlusVipUserForm): PlusApiResultPlusVipUserVO? {
        return client.post(ApiPaths.backendPath("/vip/user"), body) as? PlusApiResultPlusVipUserVO
    }

    /** Update an existing VIP recharge record */
    suspend fun updateRecharge(body: PlusVipRechargeForm): PlusApiResultPlusVipRechargeVO? {
        return client.put(ApiPaths.backendPath("/vip/recharge"), body) as? PlusApiResultPlusVipRechargeVO
    }

    /** Create a new VIP recharge record */
    suspend fun createRecharge(body: PlusVipRechargeForm): PlusApiResultPlusVipRechargeVO? {
        return client.post(ApiPaths.backendPath("/vip/recharge"), body) as? PlusApiResultPlusVipRechargeVO
    }

    /** Update an existing VIP recharge package */
    suspend fun updatePack(body: PlusVipRechargePackForm): PlusApiResultPlusVipRechargePackVO? {
        return client.put(ApiPaths.backendPath("/vip/recharge/pack"), body) as? PlusApiResultPlusVipRechargePackVO
    }

    /** Create a new VIP recharge package */
    suspend fun createPack(body: PlusVipRechargePackForm): PlusApiResultPlusVipRechargePackVO? {
        return client.post(ApiPaths.backendPath("/vip/recharge/pack"), body) as? PlusApiResultPlusVipRechargePackVO
    }

    /** Update an existing VIP point change record */
    suspend fun updateChange(body: PlusVipPointChangeForm): PlusApiResultPlusVipPointChangeVO? {
        return client.put(ApiPaths.backendPath("/vip/point/change"), body) as? PlusApiResultPlusVipPointChangeVO
    }

    /** Create a new VIP point change record */
    suspend fun createChange(body: PlusVipPointChangeForm): PlusApiResultPlusVipPointChangeVO? {
        return client.post(ApiPaths.backendPath("/vip/point/change"), body) as? PlusApiResultPlusVipPointChangeVO
    }

    /** Update an existing VIP package group */
    suspend fun updatePackGroup(body: PlusVipPackGroupForm): PlusApiResultPlusVipPackGroupVO? {
        return client.put(ApiPaths.backendPath("/vip/pack_group"), body) as? PlusApiResultPlusVipPackGroupVO
    }

    /** Create a new VIP package group */
    suspend fun createPackGroup(body: PlusVipPackGroupForm): PlusApiResultPlusVipPackGroupVO? {
        return client.post(ApiPaths.backendPath("/vip/pack_group"), body) as? PlusApiResultPlusVipPackGroupVO
    }

    /** Update VIP Package */
    suspend fun updatePack2(body: PlusVipPackForm): PlusApiResultPlusVipPackVO? {
        return client.put(ApiPaths.backendPath("/vip/pack"), body) as? PlusApiResultPlusVipPackVO
    }

    /** Create VIP Package */
    suspend fun createPack2(body: PlusVipPackForm): PlusApiResultPlusVipPackVO? {
        return client.post(ApiPaths.backendPath("/vip/pack"), body) as? PlusApiResultPlusVipPackVO
    }

    /** Update an existing VIP level */
    suspend fun updateLevel(body: PlusVipLevelForm): PlusApiResultPlusVipLevelVO? {
        return client.put(ApiPaths.backendPath("/vip/level"), body) as? PlusApiResultPlusVipLevelVO
    }

    /** Create a new VIP level */
    suspend fun createLevel(body: PlusVipLevelForm): PlusApiResultPlusVipLevelVO? {
        return client.post(ApiPaths.backendPath("/vip/level"), body) as? PlusApiResultPlusVipLevelVO
    }

    /** Update an existing VIP level benefit */
    suspend fun updateBenefit(body: PlusVipLevelBenefitForm): PlusApiResultPlusVipLevelBenefitVO? {
        return client.put(ApiPaths.backendPath("/vip/level/benefit"), body) as? PlusApiResultPlusVipLevelBenefitVO
    }

    /** Create a new VIP level benefit */
    suspend fun createBenefit(body: PlusVipLevelBenefitForm): PlusApiResultPlusVipLevelBenefitVO? {
        return client.post(ApiPaths.backendPath("/vip/level/benefit"), body) as? PlusApiResultPlusVipLevelBenefitVO
    }

    /** Update an existing VIP benefit */
    suspend fun updateBenefit2(body: PlusVipBenefitForm): PlusApiResultPlusVipBenefitVO? {
        return client.put(ApiPaths.backendPath("/vip/benefit"), body) as? PlusApiResultPlusVipBenefitVO
    }

    /** Create a new VIP benefit */
    suspend fun createBenefit2(body: PlusVipBenefitForm): PlusApiResultPlusVipBenefitVO? {
        return client.post(ApiPaths.backendPath("/vip/benefit"), body) as? PlusApiResultPlusVipBenefitVO
    }

    /** Update an existing VIP benefit usage record */
    suspend fun updateUsage(body: PlusVipBenefitUsageForm): PlusApiResultPlusVipBenefitUsageVO? {
        return client.put(ApiPaths.backendPath("/vip/benefit/usage"), body) as? PlusApiResultPlusVipBenefitUsageVO
    }

    /** Create a new VIP benefit usage record */
    suspend fun createUsage(body: PlusVipBenefitUsageForm): PlusApiResultPlusVipBenefitUsageVO? {
        return client.post(ApiPaths.backendPath("/vip/benefit/usage"), body) as? PlusApiResultPlusVipBenefitUsageVO
    }

    /** Get VIP users by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipUserVO? {
        return client.post(ApiPaths.backendPath("/vip/user/list"), body, params) as? PlusApiResultPagePlusVipUserVO
    }

    /** Get all VIP users */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusVipUserVO? {
        return client.post(ApiPaths.backendPath("/vip/user/list/all"), body) as? PlusApiResultListPlusVipUserVO
    }

    /** Get a VIP user by ID */
    suspend fun getCurrentUser(): PlusApiResultPlusVipUserVO? {
        return client.post(ApiPaths.backendPath("/vip/user/get_current_user"), null) as? PlusApiResultPlusVipUserVO
    }

    /** Get VIP recharge packages by page */
    suspend fun createListByPagePack(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipRechargePackVO? {
        return client.post(ApiPaths.backendPath("/vip/recharge/pack/list"), body, params) as? PlusApiResultPagePlusVipRechargePackVO
    }

    /** Get all VIP recharge packages */
    suspend fun createListAllEntitiesPack(body: QueryListForm? = null): PlusApiResultListPlusVipRechargePackVO? {
        return client.post(ApiPaths.backendPath("/vip/recharge/pack/list/all"), body) as? PlusApiResultListPlusVipRechargePackVO
    }

    /** Get VIP recharge records by page */
    suspend fun createListByPageRecharge(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipRechargeVO? {
        return client.post(ApiPaths.backendPath("/vip/recharge/list"), body, params) as? PlusApiResultPagePlusVipRechargeVO
    }

    /** Get all VIP recharge records */
    suspend fun createListAllEntitiesRecharge(body: QueryListForm? = null): PlusApiResultListPlusVipRechargeVO? {
        return client.post(ApiPaths.backendPath("/vip/recharge/list/all"), body) as? PlusApiResultListPlusVipRechargeVO
    }

    /** Get VIP point change records by page */
    suspend fun createListByPageChange(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipPointChangeVO? {
        return client.post(ApiPaths.backendPath("/vip/point/change/list"), body, params) as? PlusApiResultPagePlusVipPointChangeVO
    }

    /** Get all VIP point change records */
    suspend fun createListAllEntitiesChange(body: QueryListForm? = null): PlusApiResultListPlusVipPointChangeVO? {
        return client.post(ApiPaths.backendPath("/vip/point/change/list/all"), body) as? PlusApiResultListPlusVipPointChangeVO
    }

    /** List public */
    suspend fun listPublic(body: PlusVipPackGroupQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipPackGroupVO? {
        return client.post(ApiPaths.backendPath("/vip/pack_group/list_public"), body, params) as? PlusApiResultPagePlusVipPackGroupVO
    }

    /** Get VIP package groups by page */
    suspend fun createListByPagePackGroup(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipPackGroupVO? {
        return client.post(ApiPaths.backendPath("/vip/pack_group/list"), body, params) as? PlusApiResultPagePlusVipPackGroupVO
    }

    /** Get all VIP package groups */
    suspend fun createListAllEntitiesPackGroup(body: QueryListForm? = null): PlusApiResultListPlusVipPackGroupVO? {
        return client.post(ApiPaths.backendPath("/vip/pack_group/list/all"), body) as? PlusApiResultListPlusVipPackGroupVO
    }

    /** Get VIP Packages by Page */
    suspend fun createListByPagePack2(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipPackVO? {
        return client.post(ApiPaths.backendPath("/vip/pack/list"), body, params) as? PlusApiResultPagePlusVipPackVO
    }

    /** Get All VIP Packages */
    suspend fun createListAllEntitiesPack2(body: QueryListForm? = null): PlusApiResultListPlusVipPackVO? {
        return client.post(ApiPaths.backendPath("/vip/pack/list/all"), body) as? PlusApiResultListPlusVipPackVO
    }

    /** Get VIP levels by page */
    suspend fun createListByPageLevel(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipLevelVO? {
        return client.post(ApiPaths.backendPath("/vip/level/list"), body, params) as? PlusApiResultPagePlusVipLevelVO
    }

    /** Get all VIP levels */
    suspend fun createListAllEntitiesLevel(body: QueryListForm? = null): PlusApiResultListPlusVipLevelVO? {
        return client.post(ApiPaths.backendPath("/vip/level/list/all"), body) as? PlusApiResultListPlusVipLevelVO
    }

    /** Get VIP level benefits by page */
    suspend fun createListByPageBenefit(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipLevelBenefitVO? {
        return client.post(ApiPaths.backendPath("/vip/level/benefit/list"), body, params) as? PlusApiResultPagePlusVipLevelBenefitVO
    }

    /** Get all VIP level benefits */
    suspend fun createListAllEntitiesBenefit(body: QueryListForm? = null): PlusApiResultListPlusVipLevelBenefitVO? {
        return client.post(ApiPaths.backendPath("/vip/level/benefit/list/all"), body) as? PlusApiResultListPlusVipLevelBenefitVO
    }

    /** Get VIP benefit usage records by page */
    suspend fun createListByPageUsage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipBenefitUsageVO? {
        return client.post(ApiPaths.backendPath("/vip/benefit/usage/list"), body, params) as? PlusApiResultPagePlusVipBenefitUsageVO
    }

    /** Get all VIP benefit usage records */
    suspend fun createListAllEntitiesUsage(body: QueryListForm? = null): PlusApiResultListPlusVipBenefitUsageVO? {
        return client.post(ApiPaths.backendPath("/vip/benefit/usage/list/all"), body) as? PlusApiResultListPlusVipBenefitUsageVO
    }

    /** Get VIP benefits by page */
    suspend fun createListByPageBenefit2(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipBenefitVO? {
        return client.post(ApiPaths.backendPath("/vip/benefit/list"), body, params) as? PlusApiResultPagePlusVipBenefitVO
    }

    /** Get all VIP benefits */
    suspend fun createListAllEntitiesBenefit2(body: QueryListForm? = null): PlusApiResultListPlusVipBenefitVO? {
        return client.post(ApiPaths.backendPath("/vip/benefit/list/all"), body) as? PlusApiResultListPlusVipBenefitVO
    }

    /** Get a VIP user by ID */
    suspend fun getById(id: String): PlusApiResultPlusVipUserVO? {
        return client.get(ApiPaths.backendPath("/vip/user/$id")) as? PlusApiResultPlusVipUserVO
    }

    /** Delete a VIP user */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/user/$id")) as? PlusApiResultBoolean
    }

    /** Get a VIP recharge record by ID */
    suspend fun getByIdRecharge(id: String): PlusApiResultPlusVipRechargeVO? {
        return client.get(ApiPaths.backendPath("/vip/recharge/$id")) as? PlusApiResultPlusVipRechargeVO
    }

    /** Delete a VIP recharge record */
    suspend fun deleteRecharge(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/recharge/$id")) as? PlusApiResultBoolean
    }

    /** Get a VIP recharge package by ID */
    suspend fun getByIdPack(id: String): PlusApiResultPlusVipRechargePackVO? {
        return client.get(ApiPaths.backendPath("/vip/recharge/pack/$id")) as? PlusApiResultPlusVipRechargePackVO
    }

    /** Delete a VIP recharge package */
    suspend fun deletePack(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/recharge/pack/$id")) as? PlusApiResultBoolean
    }

    /** Get a VIP point change record by ID */
    suspend fun getByIdChange(id: String): PlusApiResultPlusVipPointChangeVO? {
        return client.get(ApiPaths.backendPath("/vip/point/change/$id")) as? PlusApiResultPlusVipPointChangeVO
    }

    /** Delete a VIP point change record */
    suspend fun deleteChange(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/point/change/$id")) as? PlusApiResultBoolean
    }

    /** Get a VIP package group by ID */
    suspend fun getByIdPackGroup(id: String): PlusApiResultPlusVipPackGroupVO? {
        return client.get(ApiPaths.backendPath("/vip/pack_group/$id")) as? PlusApiResultPlusVipPackGroupVO
    }

    /** Delete a VIP package group */
    suspend fun deletePackGroup(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/pack_group/$id")) as? PlusApiResultBoolean
    }

    /** Get VIP Package by ID */
    suspend fun getByIdPack2(id: String): PlusApiResultPlusVipPackVO? {
        return client.get(ApiPaths.backendPath("/vip/pack/$id")) as? PlusApiResultPlusVipPackVO
    }

    /** Delete VIP Package */
    suspend fun deletePack2(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/pack/$id")) as? PlusApiResultBoolean
    }

    /** Get a VIP level by ID */
    suspend fun getByIdLevel(id: String): PlusApiResultPlusVipLevelVO? {
        return client.get(ApiPaths.backendPath("/vip/level/$id")) as? PlusApiResultPlusVipLevelVO
    }

    /** Delete a VIP level */
    suspend fun deleteLevel(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/level/$id")) as? PlusApiResultBoolean
    }

    /** Get a VIP level benefit by ID */
    suspend fun getByIdBenefit(id: String): PlusApiResultPlusVipLevelBenefitVO? {
        return client.get(ApiPaths.backendPath("/vip/level/benefit/$id")) as? PlusApiResultPlusVipLevelBenefitVO
    }

    /** Delete a VIP level benefit */
    suspend fun deleteBenefit(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/level/benefit/$id")) as? PlusApiResultBoolean
    }

    /** Get a VIP benefit by ID */
    suspend fun getByIdBenefit2(id: String): PlusApiResultPlusVipBenefitVO? {
        return client.get(ApiPaths.backendPath("/vip/benefit/$id")) as? PlusApiResultPlusVipBenefitVO
    }

    /** Delete a VIP benefit */
    suspend fun deleteBenefit2(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/benefit/$id")) as? PlusApiResultBoolean
    }

    /** Get a VIP benefit usage record by ID */
    suspend fun getByIdUsage(id: String): PlusApiResultPlusVipBenefitUsageVO? {
        return client.get(ApiPaths.backendPath("/vip/benefit/usage/$id")) as? PlusApiResultPlusVipBenefitUsageVO
    }

    /** Delete a VIP benefit usage record */
    suspend fun deleteUsage(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/benefit/usage/$id")) as? PlusApiResultBoolean
    }
}
