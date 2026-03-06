from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CreatePointsOrderForm:
    """Create points order form"""
    items: List[OrderContentItem] = None
    points_amount: int = None
    expire_time: str = None
