from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusDiskForm:
    """File disk creation form"""
    name: str
    type: str
    owner: str
    owner_id: int
    disk_size: int
    used_size: int = None
    description: str = None
