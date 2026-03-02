from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusFilePartForm:
    """File part creation form"""
    file_id: int
    chunk_index: int
    chunk_size: int
    total_size: int
    checksum: str = None
    status: int
    storage_path: str = None
