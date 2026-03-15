from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PagePlusTenantVO:
    total_elements: int = None
    total_pages: int = None
    size: int = None
    content: List[PlusTenantVO] = None
    number: int = None
    number_of_elements: int = None
    sort: SortObject = None
    pageable: PageableObject = None
    first: bool = None
    last: bool = None
    empty: bool = None
