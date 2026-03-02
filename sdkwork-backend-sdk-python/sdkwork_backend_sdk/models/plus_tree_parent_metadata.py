from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusTreeParentMetadata:
    parent_ids: List[int] = None
