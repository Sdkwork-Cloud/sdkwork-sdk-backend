from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiModelInfoQueryListForm:
    """AI model list query form"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    keyword: str = None
    channel: str = None
    model_type: str = None
    status: str = None
    family: str = None
    open_source: bool = None
