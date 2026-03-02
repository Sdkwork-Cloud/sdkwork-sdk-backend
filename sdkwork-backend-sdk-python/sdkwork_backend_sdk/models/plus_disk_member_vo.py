from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusDiskMemberVO:
    """磁盘成员VO，封装磁盘成员的核心信息"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    v: int = None
    disk_id: int = None
    user_id: int = None
    permission: DiskPermission = None
    remark: str = None
    is_owner: bool = None
