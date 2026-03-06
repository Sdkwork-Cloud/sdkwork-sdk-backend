from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiKeySelfCreateForm:
    """开发者自助创建API Key请求"""
    name: str
    type: str = None
    expire_time: str = None
    description: str = None
