from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileListVO:
    """文件列表视图对象"""
    data: List[FileItemVO] = None
    object: str = None
