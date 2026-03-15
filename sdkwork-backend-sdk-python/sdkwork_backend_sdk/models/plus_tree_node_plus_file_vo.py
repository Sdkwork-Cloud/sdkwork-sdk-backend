from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusTreeNodePlusFileVO:
    data: PlusFileVO = None
    parent: PlusTreeNodePlusFileVO = None
    children: List[PlusTreeNodePlusFileVO] = None
    index: int = None
    root: bool = None
    leaf: bool = None
    children_count: int = None
    depth: int = None
