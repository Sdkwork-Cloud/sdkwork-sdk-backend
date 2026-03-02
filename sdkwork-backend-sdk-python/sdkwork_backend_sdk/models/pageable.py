from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class Pageable:
    page: int = None
    size: int = None
    sort: List[str] = None
