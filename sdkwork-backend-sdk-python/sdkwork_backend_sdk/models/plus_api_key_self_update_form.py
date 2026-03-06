from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiKeySelfUpdateForm:
    """开发者自助更新API Key请求"""
    name: str = None
    expire_time: str = None
    clear_expire_time: bool = None
    description: str = None
