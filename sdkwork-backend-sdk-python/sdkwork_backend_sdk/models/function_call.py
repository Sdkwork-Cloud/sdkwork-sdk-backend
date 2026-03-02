from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FunctionCall:
    """函数调用信息，当模型决定需要调用工具函数时返回"""
    name: str
    arguments: Dict[str, Any]
