from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PagePlusCardTemplateVO:
    total_pages: int = None
    total_elements: int = None
    size: int = None
    content: List[PlusCardTemplateVO] = None
    number: int = None
    sort: SortObject = None
    first: bool = None
    last: bool = None
    number_of_elements: int = None
    pageable: PageableObject = None
    empty: bool = None
