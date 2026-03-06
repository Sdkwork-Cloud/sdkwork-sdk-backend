from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContentWorkVO:
    """Content Work VO"""
    id: int = None
    uuid: str = None
    title: str = None
    type: str = None
    type_desc: str = None
    description: str = None
    cover_url: str = None
    path: str = None
    created_at: str = None
    updated_at: str = None
