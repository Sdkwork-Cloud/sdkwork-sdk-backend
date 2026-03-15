package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class VipApi {
    private final HttpClient client;
    
    public VipApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing VIP user */
    public PlusApiResultPlusVipUserVO update(PlusVipUserForm body) throws Exception {
        return (PlusApiResultPlusVipUserVO) client.put(ApiPaths.backendPath("/vip/user"), body);
    }

    /** Create a new VIP user */
    public PlusApiResultPlusVipUserVO create(PlusVipUserForm body) throws Exception {
        return (PlusApiResultPlusVipUserVO) client.post(ApiPaths.backendPath("/vip/user"), body);
    }

    /** Update an existing VIP recharge record */
    public PlusApiResultPlusVipRechargeVO updateRecharge(PlusVipRechargeForm body) throws Exception {
        return (PlusApiResultPlusVipRechargeVO) client.put(ApiPaths.backendPath("/vip/recharge"), body);
    }

    /** Create a new VIP recharge record */
    public PlusApiResultPlusVipRechargeVO createRecharge(PlusVipRechargeForm body) throws Exception {
        return (PlusApiResultPlusVipRechargeVO) client.post(ApiPaths.backendPath("/vip/recharge"), body);
    }

    /** Update an existing VIP recharge package */
    public PlusApiResultPlusVipRechargePackVO updatePack(PlusVipRechargePackForm body) throws Exception {
        return (PlusApiResultPlusVipRechargePackVO) client.put(ApiPaths.backendPath("/vip/recharge/pack"), body);
    }

    /** Create a new VIP recharge package */
    public PlusApiResultPlusVipRechargePackVO createPack(PlusVipRechargePackForm body) throws Exception {
        return (PlusApiResultPlusVipRechargePackVO) client.post(ApiPaths.backendPath("/vip/recharge/pack"), body);
    }

    /** Update an existing VIP point change record */
    public PlusApiResultPlusVipPointChangeVO updateChange(PlusVipPointChangeForm body) throws Exception {
        return (PlusApiResultPlusVipPointChangeVO) client.put(ApiPaths.backendPath("/vip/point/change"), body);
    }

    /** Create a new VIP point change record */
    public PlusApiResultPlusVipPointChangeVO createChange(PlusVipPointChangeForm body) throws Exception {
        return (PlusApiResultPlusVipPointChangeVO) client.post(ApiPaths.backendPath("/vip/point/change"), body);
    }

    /** Update an existing VIP package group */
    public PlusApiResultPlusVipPackGroupVO updatePackGroup(PlusVipPackGroupForm body) throws Exception {
        return (PlusApiResultPlusVipPackGroupVO) client.put(ApiPaths.backendPath("/vip/pack_group"), body);
    }

    /** Create a new VIP package group */
    public PlusApiResultPlusVipPackGroupVO createPackGroup(PlusVipPackGroupForm body) throws Exception {
        return (PlusApiResultPlusVipPackGroupVO) client.post(ApiPaths.backendPath("/vip/pack_group"), body);
    }

    /** Update VIP Package */
    public PlusApiResultPlusVipPackVO updatePack2(PlusVipPackForm body) throws Exception {
        return (PlusApiResultPlusVipPackVO) client.put(ApiPaths.backendPath("/vip/pack"), body);
    }

    /** Create VIP Package */
    public PlusApiResultPlusVipPackVO createPack2(PlusVipPackForm body) throws Exception {
        return (PlusApiResultPlusVipPackVO) client.post(ApiPaths.backendPath("/vip/pack"), body);
    }

    /** Update an existing VIP level */
    public PlusApiResultPlusVipLevelVO updateLevel(PlusVipLevelForm body) throws Exception {
        return (PlusApiResultPlusVipLevelVO) client.put(ApiPaths.backendPath("/vip/level"), body);
    }

    /** Create a new VIP level */
    public PlusApiResultPlusVipLevelVO createLevel(PlusVipLevelForm body) throws Exception {
        return (PlusApiResultPlusVipLevelVO) client.post(ApiPaths.backendPath("/vip/level"), body);
    }

    /** Update an existing VIP level benefit */
    public PlusApiResultPlusVipLevelBenefitVO updateBenefit(PlusVipLevelBenefitForm body) throws Exception {
        return (PlusApiResultPlusVipLevelBenefitVO) client.put(ApiPaths.backendPath("/vip/level/benefit"), body);
    }

    /** Create a new VIP level benefit */
    public PlusApiResultPlusVipLevelBenefitVO createBenefit(PlusVipLevelBenefitForm body) throws Exception {
        return (PlusApiResultPlusVipLevelBenefitVO) client.post(ApiPaths.backendPath("/vip/level/benefit"), body);
    }

    /** Update an existing VIP benefit */
    public PlusApiResultPlusVipBenefitVO updateBenefit2(PlusVipBenefitForm body) throws Exception {
        return (PlusApiResultPlusVipBenefitVO) client.put(ApiPaths.backendPath("/vip/benefit"), body);
    }

    /** Create a new VIP benefit */
    public PlusApiResultPlusVipBenefitVO createBenefit2(PlusVipBenefitForm body) throws Exception {
        return (PlusApiResultPlusVipBenefitVO) client.post(ApiPaths.backendPath("/vip/benefit"), body);
    }

    /** Update an existing VIP benefit usage record */
    public PlusApiResultPlusVipBenefitUsageVO updateUsage(PlusVipBenefitUsageForm body) throws Exception {
        return (PlusApiResultPlusVipBenefitUsageVO) client.put(ApiPaths.backendPath("/vip/benefit/usage"), body);
    }

    /** Create a new VIP benefit usage record */
    public PlusApiResultPlusVipBenefitUsageVO createUsage(PlusVipBenefitUsageForm body) throws Exception {
        return (PlusApiResultPlusVipBenefitUsageVO) client.post(ApiPaths.backendPath("/vip/benefit/usage"), body);
    }

    /** Get VIP users by page */
    public PlusApiResultPagePlusVipUserVO createListByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipUserVO) client.post(ApiPaths.backendPath("/vip/user/list"), body, params);
    }

    /** Get all VIP users */
    public PlusApiResultListPlusVipUserVO createListAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipUserVO) client.post(ApiPaths.backendPath("/vip/user/list/all"), body);
    }

    /** Get a VIP user by ID */
    public PlusApiResultPlusVipUserVO getCurrentUser() throws Exception {
        return (PlusApiResultPlusVipUserVO) client.post(ApiPaths.backendPath("/vip/user/get_current_user"), null);
    }

    /** Get VIP recharge packages by page */
    public PlusApiResultPagePlusVipRechargePackVO createListByPagePack(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipRechargePackVO) client.post(ApiPaths.backendPath("/vip/recharge/pack/list"), body, params);
    }

    /** Get all VIP recharge packages */
    public PlusApiResultListPlusVipRechargePackVO createListAllEntitiesPack(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipRechargePackVO) client.post(ApiPaths.backendPath("/vip/recharge/pack/list/all"), body);
    }

    /** Get VIP recharge records by page */
    public PlusApiResultPagePlusVipRechargeVO createListByPageRecharge(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipRechargeVO) client.post(ApiPaths.backendPath("/vip/recharge/list"), body, params);
    }

    /** Get all VIP recharge records */
    public PlusApiResultListPlusVipRechargeVO createListAllEntitiesRecharge(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipRechargeVO) client.post(ApiPaths.backendPath("/vip/recharge/list/all"), body);
    }

    /** Get VIP point change records by page */
    public PlusApiResultPagePlusVipPointChangeVO createListByPageChange(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipPointChangeVO) client.post(ApiPaths.backendPath("/vip/point/change/list"), body, params);
    }

    /** Get all VIP point change records */
    public PlusApiResultListPlusVipPointChangeVO createListAllEntitiesChange(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipPointChangeVO) client.post(ApiPaths.backendPath("/vip/point/change/list/all"), body);
    }

    /** List public */
    public PlusApiResultPagePlusVipPackGroupVO listPublic(PlusVipPackGroupQueryForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipPackGroupVO) client.post(ApiPaths.backendPath("/vip/pack_group/list_public"), body, params);
    }

    /** Get VIP package groups by page */
    public PlusApiResultPagePlusVipPackGroupVO createListByPagePackGroup(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipPackGroupVO) client.post(ApiPaths.backendPath("/vip/pack_group/list"), body, params);
    }

    /** Get all VIP package groups */
    public PlusApiResultListPlusVipPackGroupVO createListAllEntitiesPackGroup(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipPackGroupVO) client.post(ApiPaths.backendPath("/vip/pack_group/list/all"), body);
    }

    /** Get VIP Packages by Page */
    public PlusApiResultPagePlusVipPackVO createListByPagePack2(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipPackVO) client.post(ApiPaths.backendPath("/vip/pack/list"), body, params);
    }

    /** Get All VIP Packages */
    public PlusApiResultListPlusVipPackVO createListAllEntitiesPack2(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipPackVO) client.post(ApiPaths.backendPath("/vip/pack/list/all"), body);
    }

    /** Get VIP levels by page */
    public PlusApiResultPagePlusVipLevelVO createListByPageLevel(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipLevelVO) client.post(ApiPaths.backendPath("/vip/level/list"), body, params);
    }

    /** Get all VIP levels */
    public PlusApiResultListPlusVipLevelVO createListAllEntitiesLevel(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipLevelVO) client.post(ApiPaths.backendPath("/vip/level/list/all"), body);
    }

    /** Get VIP level benefits by page */
    public PlusApiResultPagePlusVipLevelBenefitVO createListByPageBenefit(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipLevelBenefitVO) client.post(ApiPaths.backendPath("/vip/level/benefit/list"), body, params);
    }

    /** Get all VIP level benefits */
    public PlusApiResultListPlusVipLevelBenefitVO createListAllEntitiesBenefit(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipLevelBenefitVO) client.post(ApiPaths.backendPath("/vip/level/benefit/list/all"), body);
    }

    /** Get VIP benefit usage records by page */
    public PlusApiResultPagePlusVipBenefitUsageVO createListByPageUsage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipBenefitUsageVO) client.post(ApiPaths.backendPath("/vip/benefit/usage/list"), body, params);
    }

    /** Get all VIP benefit usage records */
    public PlusApiResultListPlusVipBenefitUsageVO createListAllEntitiesUsage(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipBenefitUsageVO) client.post(ApiPaths.backendPath("/vip/benefit/usage/list/all"), body);
    }

    /** Get VIP benefits by page */
    public PlusApiResultPagePlusVipBenefitVO createListByPageBenefit2(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusVipBenefitVO) client.post(ApiPaths.backendPath("/vip/benefit/list"), body, params);
    }

    /** Get all VIP benefits */
    public PlusApiResultListPlusVipBenefitVO createListAllEntitiesBenefit2(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusVipBenefitVO) client.post(ApiPaths.backendPath("/vip/benefit/list/all"), body);
    }

    /** Get a VIP user by ID */
    public PlusApiResultPlusVipUserVO getById(String id) throws Exception {
        return (PlusApiResultPlusVipUserVO) client.get(ApiPaths.backendPath("/vip/user/" + id + ""));
    }

    /** Delete a VIP user */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/user/" + id + ""));
    }

    /** Get a VIP recharge record by ID */
    public PlusApiResultPlusVipRechargeVO getByIdRecharge(String id) throws Exception {
        return (PlusApiResultPlusVipRechargeVO) client.get(ApiPaths.backendPath("/vip/recharge/" + id + ""));
    }

    /** Delete a VIP recharge record */
    public PlusApiResultBoolean deleteRecharge(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/recharge/" + id + ""));
    }

    /** Get a VIP recharge package by ID */
    public PlusApiResultPlusVipRechargePackVO getByIdPack(String id) throws Exception {
        return (PlusApiResultPlusVipRechargePackVO) client.get(ApiPaths.backendPath("/vip/recharge/pack/" + id + ""));
    }

    /** Delete a VIP recharge package */
    public PlusApiResultBoolean deletePack(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/recharge/pack/" + id + ""));
    }

    /** Get a VIP point change record by ID */
    public PlusApiResultPlusVipPointChangeVO getByIdChange(String id) throws Exception {
        return (PlusApiResultPlusVipPointChangeVO) client.get(ApiPaths.backendPath("/vip/point/change/" + id + ""));
    }

    /** Delete a VIP point change record */
    public PlusApiResultBoolean deleteChange(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/point/change/" + id + ""));
    }

    /** Get a VIP package group by ID */
    public PlusApiResultPlusVipPackGroupVO getByIdPackGroup(String id) throws Exception {
        return (PlusApiResultPlusVipPackGroupVO) client.get(ApiPaths.backendPath("/vip/pack_group/" + id + ""));
    }

    /** Delete a VIP package group */
    public PlusApiResultBoolean deletePackGroup(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/pack_group/" + id + ""));
    }

    /** Get VIP Package by ID */
    public PlusApiResultPlusVipPackVO getByIdPack2(String id) throws Exception {
        return (PlusApiResultPlusVipPackVO) client.get(ApiPaths.backendPath("/vip/pack/" + id + ""));
    }

    /** Delete VIP Package */
    public PlusApiResultBoolean deletePack2(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/pack/" + id + ""));
    }

    /** Get a VIP level by ID */
    public PlusApiResultPlusVipLevelVO getByIdLevel(String id) throws Exception {
        return (PlusApiResultPlusVipLevelVO) client.get(ApiPaths.backendPath("/vip/level/" + id + ""));
    }

    /** Delete a VIP level */
    public PlusApiResultBoolean deleteLevel(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/level/" + id + ""));
    }

    /** Get a VIP level benefit by ID */
    public PlusApiResultPlusVipLevelBenefitVO getByIdBenefit(String id) throws Exception {
        return (PlusApiResultPlusVipLevelBenefitVO) client.get(ApiPaths.backendPath("/vip/level/benefit/" + id + ""));
    }

    /** Delete a VIP level benefit */
    public PlusApiResultBoolean deleteBenefit(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/level/benefit/" + id + ""));
    }

    /** Get a VIP benefit by ID */
    public PlusApiResultPlusVipBenefitVO getByIdBenefit2(String id) throws Exception {
        return (PlusApiResultPlusVipBenefitVO) client.get(ApiPaths.backendPath("/vip/benefit/" + id + ""));
    }

    /** Delete a VIP benefit */
    public PlusApiResultBoolean deleteBenefit2(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/benefit/" + id + ""));
    }

    /** Get a VIP benefit usage record by ID */
    public PlusApiResultPlusVipBenefitUsageVO getByIdUsage(String id) throws Exception {
        return (PlusApiResultPlusVipBenefitUsageVO) client.get(ApiPaths.backendPath("/vip/benefit/usage/" + id + ""));
    }

    /** Delete a VIP benefit usage record */
    public PlusApiResultBoolean deleteUsage(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/vip/benefit/usage/" + id + ""));
    }
}
