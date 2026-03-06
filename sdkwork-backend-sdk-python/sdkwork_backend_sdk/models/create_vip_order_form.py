from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CreateVipOrderForm:
    """Create VIP order form"""
    items: List[OrderContentItem] = None
    expire_time: str = None
