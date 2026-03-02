from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusDiskVO:
    """文件存储盘信息VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    name: str = None
    owner: str = None
    owner_id: int = None
    disk_size: int = None
    used_size: int = None
    description: str = None
    remaining_size: int = None
    usage_rate: float = None
