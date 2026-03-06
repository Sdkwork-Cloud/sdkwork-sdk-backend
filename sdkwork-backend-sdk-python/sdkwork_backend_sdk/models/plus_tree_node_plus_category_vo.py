from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusTreeNodePlusCategoryVO:
    data: PlusCategoryVO = None
    parent: PlusTreeNodePlusCategoryVO = None
    children: List[PlusTreeNodePlusCategoryVO] = None
    index: int = None
    root: bool = None
    leaf: bool = None
    depth: int = None
    children_count: int = None
