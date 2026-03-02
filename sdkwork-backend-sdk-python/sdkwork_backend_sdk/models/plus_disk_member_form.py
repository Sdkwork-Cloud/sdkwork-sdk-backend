from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusDiskMemberForm:
    """Disk member creation form"""
    disk_id: int
    user_id: int
    permission: DiskPermission
    remark: str = None
    is_owner: bool
