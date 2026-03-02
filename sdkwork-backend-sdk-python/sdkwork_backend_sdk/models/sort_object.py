from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SortObject:
    empty: bool = None
    sorted: bool = None
    unsorted: bool = None
