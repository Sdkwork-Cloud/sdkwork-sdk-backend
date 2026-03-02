from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusFileContentVO:
    """文件内容VO（与PlusFile一对一对应，存储文件的文本内容和编码信息）"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    file_id: int = None
    file_uuid: str = None
    prompt: str = None
    encoding: str = None
    content: FileContentObject = None
