from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MsgFileContent:
    """IM文件消息内容类"""
    content: str = None
    resource: FileMediaResource = None
