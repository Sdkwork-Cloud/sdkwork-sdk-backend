from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiKeyVO:
    """API密钥VO类，用于传输系统中API访问凭证信息"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    name: str = None
    key_value: str = None
    type: str = None
    status: str = None
    expire_time: str = None
    description: str = None
    last_used_time: str = None
