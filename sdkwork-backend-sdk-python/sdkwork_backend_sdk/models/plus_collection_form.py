from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCollectionForm:
    """Collection creation form"""
    name: str
    description: str = None
    type: str = None
    content_id: int = None
