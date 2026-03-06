from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import AccountExchangeRateUpdateForm, PlusApiResultAccountExchangeRateVO

class AccountExchangeConfigApi:
    """account_exchange_config API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_points_to_cash_rate(self) -> PlusApiResultAccountExchangeRateVO:
        """Get points-to-cash rate"""
        return self._client.get(f"/backend/v3/api/account/exchange-config/points-cash-rate")

    def update_points_to_cash_rate(self, body: AccountExchangeRateUpdateForm) -> PlusApiResultAccountExchangeRateVO:
        """Update points-to-cash rate"""
        return self._client.put(f"/backend/v3/api/account/exchange-config/points-cash-rate", json=body)
