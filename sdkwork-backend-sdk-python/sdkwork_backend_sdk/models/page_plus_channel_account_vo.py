from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PagePlusChannelAccountVO:
    total_elements: int = None
    total_pages: int = None
    size: int = None
    content: List[PlusChannelAccountVO] = None
    number: int = None
    first: bool = None
    last: bool = None
    number_of_elements: int = None
    sort: SortObject = None
    pageable: PageableObject = None
    empty: bool = None
