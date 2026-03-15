package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/backend-sdk/types"
    sdkhttp "github.com/sdkwork/backend-sdk/http"
)

type VipApi struct {
    client *sdkhttp.Client
}

func NewVipApi(client *sdkhttp.Client) *VipApi {
    return &VipApi{client: client}
}

// Update an existing VIP user
func (a *VipApi) Update(body sdktypes.PlusVipUserForm) (sdktypes.PlusApiResultPlusVipUserVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/user"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipUserVO](raw)
}

// Create a new VIP user
func (a *VipApi) Create(body sdktypes.PlusVipUserForm) (sdktypes.PlusApiResultPlusVipUserVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/user"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipUserVO](raw)
}

// Update an existing VIP recharge record
func (a *VipApi) UpdateRecharge(body sdktypes.PlusVipRechargeForm) (sdktypes.PlusApiResultPlusVipRechargeVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/recharge"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipRechargeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipRechargeVO](raw)
}

// Create a new VIP recharge record
func (a *VipApi) CreateRecharge(body sdktypes.PlusVipRechargeForm) (sdktypes.PlusApiResultPlusVipRechargeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/recharge"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipRechargeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipRechargeVO](raw)
}

// Update an existing VIP recharge package
func (a *VipApi) UpdatePack(body sdktypes.PlusVipRechargePackForm) (sdktypes.PlusApiResultPlusVipRechargePackVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/recharge/pack"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipRechargePackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipRechargePackVO](raw)
}

// Create a new VIP recharge package
func (a *VipApi) CreatePack(body sdktypes.PlusVipRechargePackForm) (sdktypes.PlusApiResultPlusVipRechargePackVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/recharge/pack"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipRechargePackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipRechargePackVO](raw)
}

// Update an existing VIP point change record
func (a *VipApi) UpdateChange(body sdktypes.PlusVipPointChangeForm) (sdktypes.PlusApiResultPlusVipPointChangeVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/point/change"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPointChangeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPointChangeVO](raw)
}

// Create a new VIP point change record
func (a *VipApi) CreateChange(body sdktypes.PlusVipPointChangeForm) (sdktypes.PlusApiResultPlusVipPointChangeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/point/change"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPointChangeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPointChangeVO](raw)
}

// Update an existing VIP package group
func (a *VipApi) UpdatePackGroup(body sdktypes.PlusVipPackGroupForm) (sdktypes.PlusApiResultPlusVipPackGroupVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/pack_group"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPackGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPackGroupVO](raw)
}

// Create a new VIP package group
func (a *VipApi) CreatePackGroup(body sdktypes.PlusVipPackGroupForm) (sdktypes.PlusApiResultPlusVipPackGroupVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/pack_group"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPackGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPackGroupVO](raw)
}

// Update VIP Package
func (a *VipApi) UpdatePack2(body sdktypes.PlusVipPackForm) (sdktypes.PlusApiResultPlusVipPackVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/pack"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPackVO](raw)
}

// Create VIP Package
func (a *VipApi) CreatePack2(body sdktypes.PlusVipPackForm) (sdktypes.PlusApiResultPlusVipPackVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/pack"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPackVO](raw)
}

// Update an existing VIP level
func (a *VipApi) UpdateLevel(body sdktypes.PlusVipLevelForm) (sdktypes.PlusApiResultPlusVipLevelVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/level"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipLevelVO](raw)
}

// Create a new VIP level
func (a *VipApi) CreateLevel(body sdktypes.PlusVipLevelForm) (sdktypes.PlusApiResultPlusVipLevelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/level"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipLevelVO](raw)
}

// Update an existing VIP level benefit
func (a *VipApi) UpdateBenefit(body sdktypes.PlusVipLevelBenefitForm) (sdktypes.PlusApiResultPlusVipLevelBenefitVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/level/benefit"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipLevelBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipLevelBenefitVO](raw)
}

// Create a new VIP level benefit
func (a *VipApi) CreateBenefit(body sdktypes.PlusVipLevelBenefitForm) (sdktypes.PlusApiResultPlusVipLevelBenefitVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/level/benefit"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipLevelBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipLevelBenefitVO](raw)
}

// Update an existing VIP benefit
func (a *VipApi) UpdateBenefit2(body sdktypes.PlusVipBenefitForm) (sdktypes.PlusApiResultPlusVipBenefitVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/benefit"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipBenefitVO](raw)
}

// Create a new VIP benefit
func (a *VipApi) CreateBenefit2(body sdktypes.PlusVipBenefitForm) (sdktypes.PlusApiResultPlusVipBenefitVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/benefit"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipBenefitVO](raw)
}

// Update an existing VIP benefit usage record
func (a *VipApi) UpdateUsage(body sdktypes.PlusVipBenefitUsageForm) (sdktypes.PlusApiResultPlusVipBenefitUsageVO, error) {
    raw, err := a.client.Put(BackendApiPath("/vip/benefit/usage"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipBenefitUsageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipBenefitUsageVO](raw)
}

// Create a new VIP benefit usage record
func (a *VipApi) CreateUsage(body sdktypes.PlusVipBenefitUsageForm) (sdktypes.PlusApiResultPlusVipBenefitUsageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/benefit/usage"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipBenefitUsageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipBenefitUsageVO](raw)
}

// Get VIP users by page
func (a *VipApi) CreateListByPage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipUserVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/user/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipUserVO](raw)
}

// Get all VIP users
func (a *VipApi) CreateListAllEntities(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipUserVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/user/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipUserVO](raw)
}

// Get a VIP user by ID
func (a *VipApi) GetCurrentUser() (sdktypes.PlusApiResultPlusVipUserVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/user/get_current_user"), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipUserVO](raw)
}

// Get VIP recharge packages by page
func (a *VipApi) CreateListByPagePack(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipRechargePackVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/recharge/pack/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipRechargePackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipRechargePackVO](raw)
}

// Get all VIP recharge packages
func (a *VipApi) CreateListAllEntitiesPack(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipRechargePackVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/recharge/pack/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipRechargePackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipRechargePackVO](raw)
}

// Get VIP recharge records by page
func (a *VipApi) CreateListByPageRecharge(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipRechargeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/recharge/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipRechargeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipRechargeVO](raw)
}

// Get all VIP recharge records
func (a *VipApi) CreateListAllEntitiesRecharge(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipRechargeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/recharge/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipRechargeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipRechargeVO](raw)
}

// Get VIP point change records by page
func (a *VipApi) CreateListByPageChange(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipPointChangeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/point/change/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipPointChangeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipPointChangeVO](raw)
}

// Get all VIP point change records
func (a *VipApi) CreateListAllEntitiesChange(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipPointChangeVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/point/change/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipPointChangeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipPointChangeVO](raw)
}

// List public
func (a *VipApi) ListPublic(body *sdktypes.PlusVipPackGroupQueryForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipPackGroupVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/pack_group/list_public"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipPackGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipPackGroupVO](raw)
}

// Get VIP package groups by page
func (a *VipApi) CreateListByPagePackGroup(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipPackGroupVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/pack_group/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipPackGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipPackGroupVO](raw)
}

// Get all VIP package groups
func (a *VipApi) CreateListAllEntitiesPackGroup(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipPackGroupVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/pack_group/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipPackGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipPackGroupVO](raw)
}

// Get VIP Packages by Page
func (a *VipApi) CreateListByPagePack2(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipPackVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/pack/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipPackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipPackVO](raw)
}

// Get All VIP Packages
func (a *VipApi) CreateListAllEntitiesPack2(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipPackVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/pack/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipPackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipPackVO](raw)
}

// Get VIP levels by page
func (a *VipApi) CreateListByPageLevel(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipLevelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/level/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipLevelVO](raw)
}

// Get all VIP levels
func (a *VipApi) CreateListAllEntitiesLevel(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipLevelVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/level/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipLevelVO](raw)
}

// Get VIP level benefits by page
func (a *VipApi) CreateListByPageBenefit(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipLevelBenefitVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/level/benefit/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipLevelBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipLevelBenefitVO](raw)
}

// Get all VIP level benefits
func (a *VipApi) CreateListAllEntitiesBenefit(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipLevelBenefitVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/level/benefit/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipLevelBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipLevelBenefitVO](raw)
}

// Get VIP benefit usage records by page
func (a *VipApi) CreateListByPageUsage(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipBenefitUsageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/benefit/usage/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipBenefitUsageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipBenefitUsageVO](raw)
}

// Get all VIP benefit usage records
func (a *VipApi) CreateListAllEntitiesUsage(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipBenefitUsageVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/benefit/usage/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipBenefitUsageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipBenefitUsageVO](raw)
}

// Get VIP benefits by page
func (a *VipApi) CreateListByPageBenefit2(body *sdktypes.QueryListForm, query map[string]interface{}) (sdktypes.PlusApiResultPagePlusVipBenefitVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/benefit/list"), body, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPagePlusVipBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePlusVipBenefitVO](raw)
}

// Get all VIP benefits
func (a *VipApi) CreateListAllEntitiesBenefit2(body *sdktypes.QueryListForm) (sdktypes.PlusApiResultListPlusVipBenefitVO, error) {
    raw, err := a.client.Post(BackendApiPath("/vip/benefit/list/all"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListPlusVipBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPlusVipBenefitVO](raw)
}

// Get a VIP user by ID
func (a *VipApi) GetById(id string) (sdktypes.PlusApiResultPlusVipUserVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/user/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipUserVO](raw)
}

// Delete a VIP user
func (a *VipApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/user/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a VIP recharge record by ID
func (a *VipApi) GetByIdRecharge(id string) (sdktypes.PlusApiResultPlusVipRechargeVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/recharge/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipRechargeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipRechargeVO](raw)
}

// Delete a VIP recharge record
func (a *VipApi) DeleteRecharge(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/recharge/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a VIP recharge package by ID
func (a *VipApi) GetByIdPack(id string) (sdktypes.PlusApiResultPlusVipRechargePackVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/recharge/pack/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipRechargePackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipRechargePackVO](raw)
}

// Delete a VIP recharge package
func (a *VipApi) DeletePack(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/recharge/pack/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a VIP point change record by ID
func (a *VipApi) GetByIdChange(id string) (sdktypes.PlusApiResultPlusVipPointChangeVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/point/change/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPointChangeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPointChangeVO](raw)
}

// Delete a VIP point change record
func (a *VipApi) DeleteChange(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/point/change/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a VIP package group by ID
func (a *VipApi) GetByIdPackGroup(id string) (sdktypes.PlusApiResultPlusVipPackGroupVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/pack_group/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPackGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPackGroupVO](raw)
}

// Delete a VIP package group
func (a *VipApi) DeletePackGroup(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/pack_group/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get VIP Package by ID
func (a *VipApi) GetByIdPack2(id string) (sdktypes.PlusApiResultPlusVipPackVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/pack/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipPackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipPackVO](raw)
}

// Delete VIP Package
func (a *VipApi) DeletePack2(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/pack/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a VIP level by ID
func (a *VipApi) GetByIdLevel(id string) (sdktypes.PlusApiResultPlusVipLevelVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/level/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipLevelVO](raw)
}

// Delete a VIP level
func (a *VipApi) DeleteLevel(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/level/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a VIP level benefit by ID
func (a *VipApi) GetByIdBenefit(id string) (sdktypes.PlusApiResultPlusVipLevelBenefitVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/level/benefit/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipLevelBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipLevelBenefitVO](raw)
}

// Delete a VIP level benefit
func (a *VipApi) DeleteBenefit(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/level/benefit/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a VIP benefit by ID
func (a *VipApi) GetByIdBenefit2(id string) (sdktypes.PlusApiResultPlusVipBenefitVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/benefit/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipBenefitVO](raw)
}

// Delete a VIP benefit
func (a *VipApi) DeleteBenefit2(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/benefit/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get a VIP benefit usage record by ID
func (a *VipApi) GetByIdUsage(id string) (sdktypes.PlusApiResultPlusVipBenefitUsageVO, error) {
    raw, err := a.client.Get(BackendApiPath(fmt.Sprintf("/vip/benefit/usage/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPlusVipBenefitUsageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPlusVipBenefitUsageVO](raw)
}

// Delete a VIP benefit usage record
func (a *VipApi) DeleteUsage(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(BackendApiPath(fmt.Sprintf("/vip/benefit/usage/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
