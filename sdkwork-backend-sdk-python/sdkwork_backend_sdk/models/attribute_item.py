from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AttributeItem:
    id: int = None
    name: str = None
    values: List[str] = None
