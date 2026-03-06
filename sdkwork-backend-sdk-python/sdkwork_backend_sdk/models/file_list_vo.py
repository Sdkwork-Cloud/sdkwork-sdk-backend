from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileListVO:
    """File list view object"""
    data: List[FileItemVO] = None
    object: str = None
