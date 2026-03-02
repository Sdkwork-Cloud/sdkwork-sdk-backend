from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCardTemplateVO:
    """会员卡模板Value Object"""
    created_at: str = None
    updated_at: str = None
    name: str = None
    template_code: str = None
    card_type: str = None
    code_type: str = None
    title: str = None
    description: str = None
    brand_name: str = None
    logo_url: str = None
    notice: str = None
    color: str = None
    quantity: int = None
    get_limit: int = None
    can_share: bool = None
    can_give_friend: bool = None
    minimum_balance: float = None
    initial_balance: float = None
    discount_rate: float = None
    validity_type: str = None
    start_time: str = None
    end_time: str = None
    validity_days: int = None
    is_deleted: bool = None
