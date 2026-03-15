from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusVipBenefitUsageVO, PlusApiResultListPlusVipBenefitVO, PlusApiResultListPlusVipLevelBenefitVO, PlusApiResultListPlusVipLevelVO, PlusApiResultListPlusVipPackGroupVO, PlusApiResultListPlusVipPackVO, PlusApiResultListPlusVipPointChangeVO, PlusApiResultListPlusVipRechargePackVO, PlusApiResultListPlusVipRechargeVO, PlusApiResultListPlusVipUserVO, PlusApiResultPagePlusVipBenefitUsageVO, PlusApiResultPagePlusVipBenefitVO, PlusApiResultPagePlusVipLevelBenefitVO, PlusApiResultPagePlusVipLevelVO, PlusApiResultPagePlusVipPackGroupVO, PlusApiResultPagePlusVipPackVO, PlusApiResultPagePlusVipPointChangeVO, PlusApiResultPagePlusVipRechargePackVO, PlusApiResultPagePlusVipRechargeVO, PlusApiResultPagePlusVipUserVO, PlusApiResultPlusVipBenefitUsageVO, PlusApiResultPlusVipBenefitVO, PlusApiResultPlusVipLevelBenefitVO, PlusApiResultPlusVipLevelVO, PlusApiResultPlusVipPackGroupVO, PlusApiResultPlusVipPackVO, PlusApiResultPlusVipPointChangeVO, PlusApiResultPlusVipRechargePackVO, PlusApiResultPlusVipRechargeVO, PlusApiResultPlusVipUserVO, PlusVipBenefitForm, PlusVipBenefitUsageForm, PlusVipLevelBenefitForm, PlusVipLevelForm, PlusVipPackForm, PlusVipPackGroupForm, PlusVipPackGroupQueryForm, PlusVipPointChangeForm, PlusVipRechargeForm, PlusVipRechargePackForm, PlusVipUserForm, QueryListForm

class VipApi:
    """vip API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusVipUserForm) -> PlusApiResultPlusVipUserVO:
        """Update an existing VIP user"""
        return self._client.put(f"/backend/v3/api/vip/user", json=body)

    def create(self, body: PlusVipUserForm) -> PlusApiResultPlusVipUserVO:
        """Create a new VIP user"""
        return self._client.post(f"/backend/v3/api/vip/user", json=body)

    def update_recharge(self, body: PlusVipRechargeForm) -> PlusApiResultPlusVipRechargeVO:
        """Update an existing VIP recharge record"""
        return self._client.put(f"/backend/v3/api/vip/recharge", json=body)

    def create_recharge(self, body: PlusVipRechargeForm) -> PlusApiResultPlusVipRechargeVO:
        """Create a new VIP recharge record"""
        return self._client.post(f"/backend/v3/api/vip/recharge", json=body)

    def update_pack(self, body: PlusVipRechargePackForm) -> PlusApiResultPlusVipRechargePackVO:
        """Update an existing VIP recharge package"""
        return self._client.put(f"/backend/v3/api/vip/recharge/pack", json=body)

    def create_pack(self, body: PlusVipRechargePackForm) -> PlusApiResultPlusVipRechargePackVO:
        """Create a new VIP recharge package"""
        return self._client.post(f"/backend/v3/api/vip/recharge/pack", json=body)

    def update_change(self, body: PlusVipPointChangeForm) -> PlusApiResultPlusVipPointChangeVO:
        """Update an existing VIP point change record"""
        return self._client.put(f"/backend/v3/api/vip/point/change", json=body)

    def create_change(self, body: PlusVipPointChangeForm) -> PlusApiResultPlusVipPointChangeVO:
        """Create a new VIP point change record"""
        return self._client.post(f"/backend/v3/api/vip/point/change", json=body)

    def update_pack_group(self, body: PlusVipPackGroupForm) -> PlusApiResultPlusVipPackGroupVO:
        """Update an existing VIP package group"""
        return self._client.put(f"/backend/v3/api/vip/pack_group", json=body)

    def create_pack_group(self, body: PlusVipPackGroupForm) -> PlusApiResultPlusVipPackGroupVO:
        """Create a new VIP package group"""
        return self._client.post(f"/backend/v3/api/vip/pack_group", json=body)

    def update_pack2(self, body: PlusVipPackForm) -> PlusApiResultPlusVipPackVO:
        """Update VIP Package"""
        return self._client.put(f"/backend/v3/api/vip/pack", json=body)

    def create_pack2(self, body: PlusVipPackForm) -> PlusApiResultPlusVipPackVO:
        """Create VIP Package"""
        return self._client.post(f"/backend/v3/api/vip/pack", json=body)

    def update_level(self, body: PlusVipLevelForm) -> PlusApiResultPlusVipLevelVO:
        """Update an existing VIP level"""
        return self._client.put(f"/backend/v3/api/vip/level", json=body)

    def create_level(self, body: PlusVipLevelForm) -> PlusApiResultPlusVipLevelVO:
        """Create a new VIP level"""
        return self._client.post(f"/backend/v3/api/vip/level", json=body)

    def update_benefit(self, body: PlusVipLevelBenefitForm) -> PlusApiResultPlusVipLevelBenefitVO:
        """Update an existing VIP level benefit"""
        return self._client.put(f"/backend/v3/api/vip/level/benefit", json=body)

    def create_benefit(self, body: PlusVipLevelBenefitForm) -> PlusApiResultPlusVipLevelBenefitVO:
        """Create a new VIP level benefit"""
        return self._client.post(f"/backend/v3/api/vip/level/benefit", json=body)

    def update_benefit2(self, body: PlusVipBenefitForm) -> PlusApiResultPlusVipBenefitVO:
        """Update an existing VIP benefit"""
        return self._client.put(f"/backend/v3/api/vip/benefit", json=body)

    def create_benefit2(self, body: PlusVipBenefitForm) -> PlusApiResultPlusVipBenefitVO:
        """Create a new VIP benefit"""
        return self._client.post(f"/backend/v3/api/vip/benefit", json=body)

    def update_usage(self, body: PlusVipBenefitUsageForm) -> PlusApiResultPlusVipBenefitUsageVO:
        """Update an existing VIP benefit usage record"""
        return self._client.put(f"/backend/v3/api/vip/benefit/usage", json=body)

    def create_usage(self, body: PlusVipBenefitUsageForm) -> PlusApiResultPlusVipBenefitUsageVO:
        """Create a new VIP benefit usage record"""
        return self._client.post(f"/backend/v3/api/vip/benefit/usage", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipUserVO:
        """Get VIP users by page"""
        return self._client.post(f"/backend/v3/api/vip/user/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipUserVO:
        """Get all VIP users"""
        return self._client.post(f"/backend/v3/api/vip/user/list/all", json=body)

    def get_current_user(self) -> PlusApiResultPlusVipUserVO:
        """Get a VIP user by ID"""
        return self._client.post(f"/backend/v3/api/vip/user/get_current_user")

    def create_list_by_page_pack(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipRechargePackVO:
        """Get VIP recharge packages by page"""
        return self._client.post(f"/backend/v3/api/vip/recharge/pack/list", json=body, params=params)

    def create_list_all_entities_pack(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipRechargePackVO:
        """Get all VIP recharge packages"""
        return self._client.post(f"/backend/v3/api/vip/recharge/pack/list/all", json=body)

    def create_list_by_page_recharge(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipRechargeVO:
        """Get VIP recharge records by page"""
        return self._client.post(f"/backend/v3/api/vip/recharge/list", json=body, params=params)

    def create_list_all_entities_recharge(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipRechargeVO:
        """Get all VIP recharge records"""
        return self._client.post(f"/backend/v3/api/vip/recharge/list/all", json=body)

    def create_list_by_page_change(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipPointChangeVO:
        """Get VIP point change records by page"""
        return self._client.post(f"/backend/v3/api/vip/point/change/list", json=body, params=params)

    def create_list_all_entities_change(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipPointChangeVO:
        """Get all VIP point change records"""
        return self._client.post(f"/backend/v3/api/vip/point/change/list/all", json=body)

    def list_public(self, body: Optional[PlusVipPackGroupQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipPackGroupVO:
        """List public"""
        return self._client.post(f"/backend/v3/api/vip/pack_group/list_public", json=body, params=params)

    def create_list_by_page_pack_group(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipPackGroupVO:
        """Get VIP package groups by page"""
        return self._client.post(f"/backend/v3/api/vip/pack_group/list", json=body, params=params)

    def create_list_all_entities_pack_group(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipPackGroupVO:
        """Get all VIP package groups"""
        return self._client.post(f"/backend/v3/api/vip/pack_group/list/all", json=body)

    def create_list_by_page_pack2(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipPackVO:
        """Get VIP Packages by Page"""
        return self._client.post(f"/backend/v3/api/vip/pack/list", json=body, params=params)

    def create_list_all_entities_pack2(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipPackVO:
        """Get All VIP Packages"""
        return self._client.post(f"/backend/v3/api/vip/pack/list/all", json=body)

    def create_list_by_page_level(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipLevelVO:
        """Get VIP levels by page"""
        return self._client.post(f"/backend/v3/api/vip/level/list", json=body, params=params)

    def create_list_all_entities_level(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipLevelVO:
        """Get all VIP levels"""
        return self._client.post(f"/backend/v3/api/vip/level/list/all", json=body)

    def create_list_by_page_benefit(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipLevelBenefitVO:
        """Get VIP level benefits by page"""
        return self._client.post(f"/backend/v3/api/vip/level/benefit/list", json=body, params=params)

    def create_list_all_entities_benefit(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipLevelBenefitVO:
        """Get all VIP level benefits"""
        return self._client.post(f"/backend/v3/api/vip/level/benefit/list/all", json=body)

    def create_list_by_page_usage(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipBenefitUsageVO:
        """Get VIP benefit usage records by page"""
        return self._client.post(f"/backend/v3/api/vip/benefit/usage/list", json=body, params=params)

    def create_list_all_entities_usage(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipBenefitUsageVO:
        """Get all VIP benefit usage records"""
        return self._client.post(f"/backend/v3/api/vip/benefit/usage/list/all", json=body)

    def create_list_by_page_benefit2(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipBenefitVO:
        """Get VIP benefits by page"""
        return self._client.post(f"/backend/v3/api/vip/benefit/list", json=body, params=params)

    def create_list_all_entities_benefit2(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipBenefitVO:
        """Get all VIP benefits"""
        return self._client.post(f"/backend/v3/api/vip/benefit/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusVipUserVO:
        """Get a VIP user by ID"""
        return self._client.get(f"/backend/v3/api/vip/user/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP user"""
        return self._client.delete(f"/backend/v3/api/vip/user/{id}")

    def get_by_id_recharge(self, id: str) -> PlusApiResultPlusVipRechargeVO:
        """Get a VIP recharge record by ID"""
        return self._client.get(f"/backend/v3/api/vip/recharge/{id}")

    def delete_recharge(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP recharge record"""
        return self._client.delete(f"/backend/v3/api/vip/recharge/{id}")

    def get_by_id_pack(self, id: str) -> PlusApiResultPlusVipRechargePackVO:
        """Get a VIP recharge package by ID"""
        return self._client.get(f"/backend/v3/api/vip/recharge/pack/{id}")

    def delete_pack(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP recharge package"""
        return self._client.delete(f"/backend/v3/api/vip/recharge/pack/{id}")

    def get_by_id_change(self, id: str) -> PlusApiResultPlusVipPointChangeVO:
        """Get a VIP point change record by ID"""
        return self._client.get(f"/backend/v3/api/vip/point/change/{id}")

    def delete_change(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP point change record"""
        return self._client.delete(f"/backend/v3/api/vip/point/change/{id}")

    def get_by_id_pack_group(self, id: str) -> PlusApiResultPlusVipPackGroupVO:
        """Get a VIP package group by ID"""
        return self._client.get(f"/backend/v3/api/vip/pack_group/{id}")

    def delete_pack_group(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP package group"""
        return self._client.delete(f"/backend/v3/api/vip/pack_group/{id}")

    def get_by_id_pack2(self, id: str) -> PlusApiResultPlusVipPackVO:
        """Get VIP Package by ID"""
        return self._client.get(f"/backend/v3/api/vip/pack/{id}")

    def delete_pack2(self, id: str) -> PlusApiResultBoolean:
        """Delete VIP Package"""
        return self._client.delete(f"/backend/v3/api/vip/pack/{id}")

    def get_by_id_level(self, id: str) -> PlusApiResultPlusVipLevelVO:
        """Get a VIP level by ID"""
        return self._client.get(f"/backend/v3/api/vip/level/{id}")

    def delete_level(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP level"""
        return self._client.delete(f"/backend/v3/api/vip/level/{id}")

    def get_by_id_benefit(self, id: str) -> PlusApiResultPlusVipLevelBenefitVO:
        """Get a VIP level benefit by ID"""
        return self._client.get(f"/backend/v3/api/vip/level/benefit/{id}")

    def delete_benefit(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP level benefit"""
        return self._client.delete(f"/backend/v3/api/vip/level/benefit/{id}")

    def get_by_id_benefit2(self, id: str) -> PlusApiResultPlusVipBenefitVO:
        """Get a VIP benefit by ID"""
        return self._client.get(f"/backend/v3/api/vip/benefit/{id}")

    def delete_benefit2(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP benefit"""
        return self._client.delete(f"/backend/v3/api/vip/benefit/{id}")

    def get_by_id_usage(self, id: str) -> PlusApiResultPlusVipBenefitUsageVO:
        """Get a VIP benefit usage record by ID"""
        return self._client.get(f"/backend/v3/api/vip/benefit/usage/{id}")

    def delete_usage(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP benefit usage record"""
        return self._client.delete(f"/backend/v3/api/vip/benefit/usage/{id}")
