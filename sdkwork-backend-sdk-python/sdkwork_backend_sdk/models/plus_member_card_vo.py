from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusMemberCardVO:
    """会员卡扩展表VO，存储会员卡专属属性"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    card_id: int = None
    supply_bonus: bool = None
    supply_balance: bool = None
    bonus_name: str = None
    balance_name: str = None
    prerogative: str = None
    auto_activate: bool = None
    wx_activate: bool = None
    cost_money_unit: int = None
    increase_bonus: int = None
    init_increase_bonus: int = None
    max_increase_bonus: int = None
    cost_bonus_unit: int = None
    reduce_money: int = None
    least_money_to_use_bonus: int = None
    max_reduce_bonus: int = None
