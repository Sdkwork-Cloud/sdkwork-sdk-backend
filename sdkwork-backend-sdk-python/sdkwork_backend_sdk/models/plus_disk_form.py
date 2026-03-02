from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusDiskForm:
    """File disk creation form"""
    name: str
    owner: str
    owner_id: int
    disk_size: int
    used_size: int
    description: str = None
