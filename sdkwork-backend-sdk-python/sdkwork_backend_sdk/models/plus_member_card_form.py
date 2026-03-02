from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusMemberCardForm:
    """Member card creation form"""
    card: PlusCard
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
