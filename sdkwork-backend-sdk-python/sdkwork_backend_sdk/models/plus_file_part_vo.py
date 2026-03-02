from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusFilePartVO:
    """文件分片VO对象"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    file_id: int = None
    chunk_index: int = None
    chunk_size: int = None
    total_size: int = None
    checksum: str = None
    status: int = None
    storage_path: str = None
