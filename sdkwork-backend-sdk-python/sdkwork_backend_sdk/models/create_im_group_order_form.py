from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CreateImGroupOrderForm:
    """Create IM group order form"""
    items: List[OrderContentItem] = None
    expire_time: str = None
