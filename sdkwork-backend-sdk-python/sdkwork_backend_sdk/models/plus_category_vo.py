from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCategoryVO:
    """AI分类VO，用于管理不同内容类型(如Agent、Tool、Prompt等)的分类"""
    parent_uuid: str = None
    parent_metadata: PlusTreeParentMetadata = None
    id: int = None
    uuid: str = None
    created_at: str = None
    updated_at: str = None
    name: str = None
    description: str = None
    type: str = None
    icon: str = None
    sort_weight: int = None
    parent_id: int = None
    path: List[str] = None
    visible: int = None
    status: str = None
    children: List[PlusCategoryVO] = None
    tags: TagsContent = None
    attribute_ids: List[int] = None
