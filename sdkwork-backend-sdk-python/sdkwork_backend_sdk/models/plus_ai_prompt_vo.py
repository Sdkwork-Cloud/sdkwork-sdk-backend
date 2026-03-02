from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiPromptVO:
    """AI提示语Value Object"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    title: str = None
    content: str = None
    description: str = None
    category_id: int = None
    enabled: bool = None
    sort: int = None
    parameters: Dict[str, Any] = None
    creator: str = None
    model: str = None
    tags: TagsContent = None
    usage_count: int = None
    avg_response_time: int = None
