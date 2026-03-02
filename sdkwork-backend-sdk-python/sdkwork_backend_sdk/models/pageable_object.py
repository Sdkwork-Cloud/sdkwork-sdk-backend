from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PageableObject:
    offset: int = None
    sort: SortObject = None
    paged: bool = None
    page_number: int = None
    page_size: int = None
    unpaged: bool = None
