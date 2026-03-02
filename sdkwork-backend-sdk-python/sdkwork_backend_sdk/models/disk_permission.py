from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DiskPermission:
    permissions: List[str] = None
    permission_set: List[str] = None
