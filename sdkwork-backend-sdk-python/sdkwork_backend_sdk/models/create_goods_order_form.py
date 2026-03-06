from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CreateGoodsOrderForm:
    """Create goods order form"""
    items: List[CartItem] = None
    expire_time: str = None
