using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VipApi
    {
        private readonly HttpClient _client;

        public VipApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing VIP user
        /// </summary>
        public async Task<PlusApiResultPlusVipUserVO?> UpdateAsync(PlusVipUserForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipUserVO>(ApiPaths.BackendPath("/vip/user"), body);
        }

        /// <summary>
        /// Create a new VIP user
        /// </summary>
        public async Task<PlusApiResultPlusVipUserVO?> CreateAsync(PlusVipUserForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipUserVO>(ApiPaths.BackendPath("/vip/user"), body);
        }

        /// <summary>
        /// Update an existing VIP recharge record
        /// </summary>
        public async Task<PlusApiResultPlusVipRechargeVO?> UpdateRechargeAsync(PlusVipRechargeForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipRechargeVO>(ApiPaths.BackendPath("/vip/recharge"), body);
        }

        /// <summary>
        /// Create a new VIP recharge record
        /// </summary>
        public async Task<PlusApiResultPlusVipRechargeVO?> CreateRechargeAsync(PlusVipRechargeForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipRechargeVO>(ApiPaths.BackendPath("/vip/recharge"), body);
        }

        /// <summary>
        /// Update an existing VIP recharge package
        /// </summary>
        public async Task<PlusApiResultPlusVipRechargePackVO?> UpdatePackAsync(PlusVipRechargePackForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipRechargePackVO>(ApiPaths.BackendPath("/vip/recharge/pack"), body);
        }

        /// <summary>
        /// Create a new VIP recharge package
        /// </summary>
        public async Task<PlusApiResultPlusVipRechargePackVO?> CreatePackAsync(PlusVipRechargePackForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipRechargePackVO>(ApiPaths.BackendPath("/vip/recharge/pack"), body);
        }

        /// <summary>
        /// Update an existing VIP point change record
        /// </summary>
        public async Task<PlusApiResultPlusVipPointChangeVO?> UpdateChangeAsync(PlusVipPointChangeForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipPointChangeVO>(ApiPaths.BackendPath("/vip/point/change"), body);
        }

        /// <summary>
        /// Create a new VIP point change record
        /// </summary>
        public async Task<PlusApiResultPlusVipPointChangeVO?> CreateChangeAsync(PlusVipPointChangeForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipPointChangeVO>(ApiPaths.BackendPath("/vip/point/change"), body);
        }

        /// <summary>
        /// Update an existing VIP package group
        /// </summary>
        public async Task<PlusApiResultPlusVipPackGroupVO?> UpdatePackGroupAsync(PlusVipPackGroupForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipPackGroupVO>(ApiPaths.BackendPath("/vip/pack_group"), body);
        }

        /// <summary>
        /// Create a new VIP package group
        /// </summary>
        public async Task<PlusApiResultPlusVipPackGroupVO?> CreatePackGroupAsync(PlusVipPackGroupForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipPackGroupVO>(ApiPaths.BackendPath("/vip/pack_group"), body);
        }

        /// <summary>
        /// Update VIP Package
        /// </summary>
        public async Task<PlusApiResultPlusVipPackVO?> UpdatePack2Async(PlusVipPackForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipPackVO>(ApiPaths.BackendPath("/vip/pack"), body);
        }

        /// <summary>
        /// Create VIP Package
        /// </summary>
        public async Task<PlusApiResultPlusVipPackVO?> CreatePack2Async(PlusVipPackForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipPackVO>(ApiPaths.BackendPath("/vip/pack"), body);
        }

        /// <summary>
        /// Update an existing VIP level
        /// </summary>
        public async Task<PlusApiResultPlusVipLevelVO?> UpdateLevelAsync(PlusVipLevelForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipLevelVO>(ApiPaths.BackendPath("/vip/level"), body);
        }

        /// <summary>
        /// Create a new VIP level
        /// </summary>
        public async Task<PlusApiResultPlusVipLevelVO?> CreateLevelAsync(PlusVipLevelForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipLevelVO>(ApiPaths.BackendPath("/vip/level"), body);
        }

        /// <summary>
        /// Update an existing VIP level benefit
        /// </summary>
        public async Task<PlusApiResultPlusVipLevelBenefitVO?> UpdateBenefitAsync(PlusVipLevelBenefitForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipLevelBenefitVO>(ApiPaths.BackendPath("/vip/level/benefit"), body);
        }

        /// <summary>
        /// Create a new VIP level benefit
        /// </summary>
        public async Task<PlusApiResultPlusVipLevelBenefitVO?> CreateBenefitAsync(PlusVipLevelBenefitForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipLevelBenefitVO>(ApiPaths.BackendPath("/vip/level/benefit"), body);
        }

        /// <summary>
        /// Update an existing VIP benefit
        /// </summary>
        public async Task<PlusApiResultPlusVipBenefitVO?> UpdateBenefit2Async(PlusVipBenefitForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipBenefitVO>(ApiPaths.BackendPath("/vip/benefit"), body);
        }

        /// <summary>
        /// Create a new VIP benefit
        /// </summary>
        public async Task<PlusApiResultPlusVipBenefitVO?> CreateBenefit2Async(PlusVipBenefitForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipBenefitVO>(ApiPaths.BackendPath("/vip/benefit"), body);
        }

        /// <summary>
        /// Update an existing VIP benefit usage record
        /// </summary>
        public async Task<PlusApiResultPlusVipBenefitUsageVO?> UpdateUsageAsync(PlusVipBenefitUsageForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVipBenefitUsageVO>(ApiPaths.BackendPath("/vip/benefit/usage"), body);
        }

        /// <summary>
        /// Create a new VIP benefit usage record
        /// </summary>
        public async Task<PlusApiResultPlusVipBenefitUsageVO?> CreateUsageAsync(PlusVipBenefitUsageForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVipBenefitUsageVO>(ApiPaths.BackendPath("/vip/benefit/usage"), body);
        }

        /// <summary>
        /// Get VIP users by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipUserVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipUserVO>(ApiPaths.BackendPath("/vip/user/list"), body, query);
        }

        /// <summary>
        /// Get all VIP users
        /// </summary>
        public async Task<PlusApiResultListPlusVipUserVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipUserVO>(ApiPaths.BackendPath("/vip/user/list/all"), body);
        }

        /// <summary>
        /// Get a VIP user by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipUserVO?> GetCurrentUserAsync()
        {
            return await _client.PostAsync<PlusApiResultPlusVipUserVO>(ApiPaths.BackendPath("/vip/user/get_current_user"), null);
        }

        /// <summary>
        /// Get VIP recharge packages by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipRechargePackVO?> CreateListByPagePackAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipRechargePackVO>(ApiPaths.BackendPath("/vip/recharge/pack/list"), body, query);
        }

        /// <summary>
        /// Get all VIP recharge packages
        /// </summary>
        public async Task<PlusApiResultListPlusVipRechargePackVO?> CreateListAllEntitiesPackAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipRechargePackVO>(ApiPaths.BackendPath("/vip/recharge/pack/list/all"), body);
        }

        /// <summary>
        /// Get VIP recharge records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipRechargeVO?> CreateListByPageRechargeAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipRechargeVO>(ApiPaths.BackendPath("/vip/recharge/list"), body, query);
        }

        /// <summary>
        /// Get all VIP recharge records
        /// </summary>
        public async Task<PlusApiResultListPlusVipRechargeVO?> CreateListAllEntitiesRechargeAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipRechargeVO>(ApiPaths.BackendPath("/vip/recharge/list/all"), body);
        }

        /// <summary>
        /// Get VIP point change records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipPointChangeVO?> CreateListByPageChangeAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipPointChangeVO>(ApiPaths.BackendPath("/vip/point/change/list"), body, query);
        }

        /// <summary>
        /// Get all VIP point change records
        /// </summary>
        public async Task<PlusApiResultListPlusVipPointChangeVO?> CreateListAllEntitiesChangeAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipPointChangeVO>(ApiPaths.BackendPath("/vip/point/change/list/all"), body);
        }

        /// <summary>
        /// List public
        /// </summary>
        public async Task<PlusApiResultPagePlusVipPackGroupVO?> ListPublicAsync(PlusVipPackGroupQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipPackGroupVO>(ApiPaths.BackendPath("/vip/pack_group/list_public"), body, query);
        }

        /// <summary>
        /// Get VIP package groups by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipPackGroupVO?> CreateListByPagePackGroupAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipPackGroupVO>(ApiPaths.BackendPath("/vip/pack_group/list"), body, query);
        }

        /// <summary>
        /// Get all VIP package groups
        /// </summary>
        public async Task<PlusApiResultListPlusVipPackGroupVO?> CreateListAllEntitiesPackGroupAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipPackGroupVO>(ApiPaths.BackendPath("/vip/pack_group/list/all"), body);
        }

        /// <summary>
        /// Get VIP Packages by Page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipPackVO?> CreateListByPagePack2Async(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipPackVO>(ApiPaths.BackendPath("/vip/pack/list"), body, query);
        }

        /// <summary>
        /// Get All VIP Packages
        /// </summary>
        public async Task<PlusApiResultListPlusVipPackVO?> CreateListAllEntitiesPack2Async(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipPackVO>(ApiPaths.BackendPath("/vip/pack/list/all"), body);
        }

        /// <summary>
        /// Get VIP levels by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipLevelVO?> CreateListByPageLevelAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipLevelVO>(ApiPaths.BackendPath("/vip/level/list"), body, query);
        }

        /// <summary>
        /// Get all VIP levels
        /// </summary>
        public async Task<PlusApiResultListPlusVipLevelVO?> CreateListAllEntitiesLevelAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipLevelVO>(ApiPaths.BackendPath("/vip/level/list/all"), body);
        }

        /// <summary>
        /// Get VIP level benefits by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipLevelBenefitVO?> CreateListByPageBenefitAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipLevelBenefitVO>(ApiPaths.BackendPath("/vip/level/benefit/list"), body, query);
        }

        /// <summary>
        /// Get all VIP level benefits
        /// </summary>
        public async Task<PlusApiResultListPlusVipLevelBenefitVO?> CreateListAllEntitiesBenefitAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipLevelBenefitVO>(ApiPaths.BackendPath("/vip/level/benefit/list/all"), body);
        }

        /// <summary>
        /// Get VIP benefit usage records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipBenefitUsageVO?> CreateListByPageUsageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipBenefitUsageVO>(ApiPaths.BackendPath("/vip/benefit/usage/list"), body, query);
        }

        /// <summary>
        /// Get all VIP benefit usage records
        /// </summary>
        public async Task<PlusApiResultListPlusVipBenefitUsageVO?> CreateListAllEntitiesUsageAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipBenefitUsageVO>(ApiPaths.BackendPath("/vip/benefit/usage/list/all"), body);
        }

        /// <summary>
        /// Get VIP benefits by page
        /// </summary>
        public async Task<PlusApiResultPagePlusVipBenefitVO?> CreateListByPageBenefit2Async(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVipBenefitVO>(ApiPaths.BackendPath("/vip/benefit/list"), body, query);
        }

        /// <summary>
        /// Get all VIP benefits
        /// </summary>
        public async Task<PlusApiResultListPlusVipBenefitVO?> CreateListAllEntitiesBenefit2Async(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVipBenefitVO>(ApiPaths.BackendPath("/vip/benefit/list/all"), body);
        }

        /// <summary>
        /// Get a VIP user by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipUserVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipUserVO>(ApiPaths.BackendPath($"/vip/user/{id}"));
        }

        /// <summary>
        /// Delete a VIP user
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/user/{id}"));
        }

        /// <summary>
        /// Get a VIP recharge record by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipRechargeVO?> GetByIdRechargeAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipRechargeVO>(ApiPaths.BackendPath($"/vip/recharge/{id}"));
        }

        /// <summary>
        /// Delete a VIP recharge record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteRechargeAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/recharge/{id}"));
        }

        /// <summary>
        /// Get a VIP recharge package by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipRechargePackVO?> GetByIdPackAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipRechargePackVO>(ApiPaths.BackendPath($"/vip/recharge/pack/{id}"));
        }

        /// <summary>
        /// Delete a VIP recharge package
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeletePackAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/recharge/pack/{id}"));
        }

        /// <summary>
        /// Get a VIP point change record by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipPointChangeVO?> GetByIdChangeAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipPointChangeVO>(ApiPaths.BackendPath($"/vip/point/change/{id}"));
        }

        /// <summary>
        /// Delete a VIP point change record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteChangeAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/point/change/{id}"));
        }

        /// <summary>
        /// Get a VIP package group by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipPackGroupVO?> GetByIdPackGroupAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipPackGroupVO>(ApiPaths.BackendPath($"/vip/pack_group/{id}"));
        }

        /// <summary>
        /// Delete a VIP package group
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeletePackGroupAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/pack_group/{id}"));
        }

        /// <summary>
        /// Get VIP Package by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipPackVO?> GetByIdPack2Async(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipPackVO>(ApiPaths.BackendPath($"/vip/pack/{id}"));
        }

        /// <summary>
        /// Delete VIP Package
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeletePack2Async(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/pack/{id}"));
        }

        /// <summary>
        /// Get a VIP level by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipLevelVO?> GetByIdLevelAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipLevelVO>(ApiPaths.BackendPath($"/vip/level/{id}"));
        }

        /// <summary>
        /// Delete a VIP level
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteLevelAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/level/{id}"));
        }

        /// <summary>
        /// Get a VIP level benefit by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipLevelBenefitVO?> GetByIdBenefitAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipLevelBenefitVO>(ApiPaths.BackendPath($"/vip/level/benefit/{id}"));
        }

        /// <summary>
        /// Delete a VIP level benefit
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteBenefitAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/level/benefit/{id}"));
        }

        /// <summary>
        /// Get a VIP benefit by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipBenefitVO?> GetByIdBenefit2Async(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipBenefitVO>(ApiPaths.BackendPath($"/vip/benefit/{id}"));
        }

        /// <summary>
        /// Delete a VIP benefit
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteBenefit2Async(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/benefit/{id}"));
        }

        /// <summary>
        /// Get a VIP benefit usage record by ID
        /// </summary>
        public async Task<PlusApiResultPlusVipBenefitUsageVO?> GetByIdUsageAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVipBenefitUsageVO>(ApiPaths.BackendPath($"/vip/benefit/usage/{id}"));
        }

        /// <summary>
        /// Delete a VIP benefit usage record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteUsageAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vip/benefit/usage/{id}"));
        }
    }
}
