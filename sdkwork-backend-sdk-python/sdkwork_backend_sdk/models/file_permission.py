from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FilePermission:
    permissions: List[str] = None
    read_only: bool = None
    permission_set: List[str] = None
