from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusUserAddressVO, PlusApiResultListPlusUserCardVO, PlusApiResultListPlusUserCouponVO, PlusApiResultListPlusUserOAuthAccountVO, PlusApiResultListPlusUserVO, PlusApiResultPagePlusUserAddressVO, PlusApiResultPagePlusUserCardVO, PlusApiResultPagePlusUserCouponVO, PlusApiResultPagePlusUserOAuthAccountVO, PlusApiResultPagePlusUserVO, PlusApiResultPlusUserAddressVO, PlusApiResultPlusUserCardVO, PlusApiResultPlusUserCouponVO, PlusApiResultPlusUserOAuthAccountVO, PlusApiResultPlusUserProfileVO, PlusApiResultPlusUserVO, PlusUserAddressForm, PlusUserCardForm, PlusUserCouponForm, PlusUserForm, PlusUserOAuthAccountForm, QueryListForm

class UserApi:
    """user API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusUserForm) -> PlusApiResultPlusUserVO:
        """Update an existing user"""
        return self._client.put(f"/backend/v3/api/user", json=body)

    def create(self, body: PlusUserForm) -> PlusApiResultPlusUserVO:
        """Create a new user"""
        return self._client.post(f"/backend/v3/api/user", json=body)

    def update_account(self, body: PlusUserOAuthAccountForm) -> PlusApiResultPlusUserOAuthAccountVO:
        """Update user OAuth account"""
        return self._client.put(f"/backend/v3/api/user/oauth/account", json=body)

    def create_account(self, body: PlusUserOAuthAccountForm) -> PlusApiResultPlusUserOAuthAccountVO:
        """Create user OAuth account"""
        return self._client.post(f"/backend/v3/api/user/oauth/account", json=body)

    def update_coupon(self, body: PlusUserCouponForm) -> PlusApiResultPlusUserCouponVO:
        """Update an existing user coupon"""
        return self._client.put(f"/backend/v3/api/user/coupon", json=body)

    def create_coupon(self, body: PlusUserCouponForm) -> PlusApiResultPlusUserCouponVO:
        """Create a new user coupon"""
        return self._client.post(f"/backend/v3/api/user/coupon", json=body)

    def update_card(self, body: PlusUserCardForm) -> PlusApiResultPlusUserCardVO:
        """Update user-card binding"""
        return self._client.put(f"/backend/v3/api/user/card", json=body)

    def create_card(self, body: PlusUserCardForm) -> PlusApiResultPlusUserCardVO:
        """Create user-card binding"""
        return self._client.post(f"/backend/v3/api/user/card", json=body)

    def update_address(self, body: PlusUserAddressForm) -> PlusApiResultPlusUserAddressVO:
        """Update an existing user address"""
        return self._client.put(f"/backend/v3/api/user/address", json=body)

    def create_address(self, body: PlusUserAddressForm) -> PlusApiResultPlusUserAddressVO:
        """Create a new user address"""
        return self._client.post(f"/backend/v3/api/user/address", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusUserOAuthAccountVO:
        """Get user OAuth accounts by page"""
        return self._client.post(f"/backend/v3/api/user/oauth/account/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusUserOAuthAccountVO:
        """Get all user OAuth accounts"""
        return self._client.post(f"/backend/v3/api/user/oauth/account/list/all", json=body)

    def create_list_by_page_user(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusUserVO:
        """Get users by page"""
        return self._client.post(f"/backend/v3/api/user/list", json=body, params=params)

    def create_list_all_entities_user(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusUserVO:
        """Get all users"""
        return self._client.post(f"/backend/v3/api/user/list/all", json=body)

    def create_list_by_page_coupon(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusUserCouponVO:
        """Get user coupons by page"""
        return self._client.post(f"/backend/v3/api/user/coupon/list", json=body, params=params)

    def create_list_all_entities_coupon(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusUserCouponVO:
        """Get all user coupons"""
        return self._client.post(f"/backend/v3/api/user/coupon/list/all", json=body)

    def create_list_by_page_card(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusUserCardVO:
        """Get user-card bindings by page"""
        return self._client.post(f"/backend/v3/api/user/card/list", json=body, params=params)

    def create_list_all_entities_card(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusUserCardVO:
        """Get all user-card bindings"""
        return self._client.post(f"/backend/v3/api/user/card/list/all", json=body)

    def create_list_by_page_address(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusUserAddressVO:
        """Get addresses by page"""
        return self._client.post(f"/backend/v3/api/user/address/list", json=body, params=params)

    def create_list_all_entities_address(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusUserAddressVO:
        """Get all user addresses"""
        return self._client.post(f"/backend/v3/api/user/address/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusUserVO:
        """Get a user by ID"""
        return self._client.get(f"/backend/v3/api/user/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a user"""
        return self._client.delete(f"/backend/v3/api/user/{id}")

    def get_profile(self) -> PlusApiResultPlusUserProfileVO:
        """Get current user profile"""
        return self._client.get(f"/backend/v3/api/user/profile")

    def get_by_id_account(self, id: str) -> PlusApiResultPlusUserOAuthAccountVO:
        """Get user OAuth account by ID"""
        return self._client.get(f"/backend/v3/api/user/oauth/account/{id}")

    def delete_account(self, id: str) -> PlusApiResultBoolean:
        """Delete user OAuth account"""
        return self._client.delete(f"/backend/v3/api/user/oauth/account/{id}")

    def get_by_id_coupon(self, id: str) -> PlusApiResultPlusUserCouponVO:
        """Get a user coupon by ID"""
        return self._client.get(f"/backend/v3/api/user/coupon/{id}")

    def delete_coupon(self, id: str) -> PlusApiResultBoolean:
        """Delete a user coupon"""
        return self._client.delete(f"/backend/v3/api/user/coupon/{id}")

    def get_by_id_card(self, id: str) -> PlusApiResultPlusUserCardVO:
        """Get user-card binding by ID"""
        return self._client.get(f"/backend/v3/api/user/card/{id}")

    def delete_card(self, id: str) -> PlusApiResultBoolean:
        """Delete user-card binding"""
        return self._client.delete(f"/backend/v3/api/user/card/{id}")

    def get_by_id_address(self, id: str) -> PlusApiResultPlusUserAddressVO:
        """Get address by ID"""
        return self._client.get(f"/backend/v3/api/user/address/{id}")

    def delete_address(self, id: str) -> PlusApiResultBoolean:
        """Delete a user address"""
        return self._client.delete(f"/backend/v3/api/user/address/{id}")
