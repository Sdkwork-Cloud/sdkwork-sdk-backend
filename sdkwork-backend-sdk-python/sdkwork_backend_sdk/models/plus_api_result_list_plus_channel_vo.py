from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiResultListPlusChannelVO:
    """API调用结果"""
    data: List[PlusChannelVO]
    code: str
    msg: str
    request_id: str
    ip: str = None
    hostname: str = None
    error_name: str
