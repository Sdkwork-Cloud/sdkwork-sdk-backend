from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusShoppingCartVO:
    """购物车VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    owner: str = None
    owner_id: int = None
    name: str = None
    description: str = None
    group_list: CartGroupList = None
    status: str = None
