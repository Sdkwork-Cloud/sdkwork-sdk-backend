from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusShoppingCartForm:
    """Shopping cart creation form"""
    owner: str
    owner_id: int
    name: str = None
    description: str = None
    group_list: CartGroupList = None
    status: str
