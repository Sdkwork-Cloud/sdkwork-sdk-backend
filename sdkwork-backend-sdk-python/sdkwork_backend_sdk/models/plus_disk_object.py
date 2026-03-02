from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusDiskObject:
    id: int = None
    uuid: str = None
    owner: str = None
    owner_id: int = None
    name: str = None
    type: str = None
    description: str = None
    disk_size: int = None
    used_size: int = None
