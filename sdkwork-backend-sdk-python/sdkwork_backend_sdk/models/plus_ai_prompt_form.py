from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiPromptForm:
    """Prompt creation form"""
    title: str
    content: str
    description: str = None
    category_id: int = None
    enabled: bool
    sort: int = None
    parameters: Dict[str, Any] = None
    creator: str = None
    model: str = None
    tags: TagsContent = None
    usage_count: int = None
    avg_response_time: int = None
