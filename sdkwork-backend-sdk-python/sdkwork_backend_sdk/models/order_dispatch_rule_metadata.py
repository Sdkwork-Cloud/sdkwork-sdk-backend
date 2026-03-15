from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderDispatchRuleMetadata:
    rating_concurrent_limits: Dict[str, int] = None
    allowed_rating_levels: List[str] = None
