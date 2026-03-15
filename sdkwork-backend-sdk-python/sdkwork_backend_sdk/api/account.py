from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import AccountExchangeRateUpdateForm, PlusAccountForm, PlusAccountHistoryForm, PlusApiResultAccountExchangeRateVO, PlusApiResultBoolean, PlusApiResultListPlusAccountHistoryVO, PlusApiResultListPlusAccountVO, PlusApiResultPagePlusAccountHistoryVO, PlusApiResultPagePlusAccountVO, PlusApiResultPlusAccountHistoryVO, PlusApiResultPlusAccountVO, PlusGetAccountForm, QueryListForm

class AccountApi:
    """account API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAccountForm) -> PlusApiResultPlusAccountVO:
        """Update an existing account"""
        return self._client.put(f"/backend/v3/api/account", json=body)

    def create(self, body: PlusAccountForm) -> PlusApiResultPlusAccountVO:
        """Create a new account"""
        return self._client.post(f"/backend/v3/api/account", json=body)

    def update_history(self, body: PlusAccountHistoryForm) -> PlusApiResultPlusAccountHistoryVO:
        """Update an existing account history record"""
        return self._client.put(f"/backend/v3/api/account/history", json=body)

    def create_history(self, body: PlusAccountHistoryForm) -> PlusApiResultPlusAccountHistoryVO:
        """Create a new account history record"""
        return self._client.post(f"/backend/v3/api/account/history", json=body)

    def get_points_to_cash_rate(self) -> PlusApiResultAccountExchangeRateVO:
        """Get points-to-cash rate"""
        return self._client.get(f"/backend/v3/api/account/exchange-config/points-cash-rate")

    def update_points_to_cash_rate(self, body: AccountExchangeRateUpdateForm) -> PlusApiResultAccountExchangeRateVO:
        """Update points-to-cash rate"""
        return self._client.put(f"/backend/v3/api/account/exchange-config/points-cash-rate", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAccountVO:
        """Get accounts by page"""
        return self._client.post(f"/backend/v3/api/account/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAccountVO:
        """Get all accounts"""
        return self._client.post(f"/backend/v3/api/account/list/all", json=body)

    def create_list_by_page_history(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAccountHistoryVO:
        """Get account history records by page"""
        return self._client.post(f"/backend/v3/api/account/history/list", json=body, params=params)

    def create_list_all_entities_history(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAccountHistoryVO:
        """Get all account history records"""
        return self._client.post(f"/backend/v3/api/account/history/list/all", json=body)

    def get_points(self, body: PlusGetAccountForm) -> PlusApiResultPlusAccountVO:
        """Get points account"""
        return self._client.post(f"/backend/v3/api/account/get_points", json=body)

    def get_cash(self, body: PlusGetAccountForm) -> PlusApiResultPlusAccountVO:
        """Get cash account"""
        return self._client.post(f"/backend/v3/api/account/get_cash", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusAccountVO:
        """Get an account by ID"""
        return self._client.get(f"/backend/v3/api/account/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an account"""
        return self._client.delete(f"/backend/v3/api/account/{id}")

    def get_by_id_history(self, id: str) -> PlusApiResultPlusAccountHistoryVO:
        """Get an account history record by ID"""
        return self._client.get(f"/backend/v3/api/account/history/{id}")

    def delete_history(self, id: str) -> PlusApiResultBoolean:
        """Delete an account history record"""
        return self._client.delete(f"/backend/v3/api/account/history/{id}")
