from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Attributes:
    items: List[AttributeItem] = None
