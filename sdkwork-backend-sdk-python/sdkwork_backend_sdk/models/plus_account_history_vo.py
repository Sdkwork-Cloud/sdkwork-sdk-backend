from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAccountHistoryVO:
    """账户流水VO(包含资金和积分)"""
    created_at: str = None
    updated_at: str = None
    asset_type: str = None
    account_id: int = None
    transaction_id: str = None
    transaction_type: str = None
    amount: float = None
    balance_before: float = None
    balance_after: float = None
    related_account_id: int = None
    points_change: int = None
    points_before: int = None
    points_after: int = None
    source_type: str = None
    source_id: str = None
    expired_at: str = None
    status: str = None
    remarks: str = None
