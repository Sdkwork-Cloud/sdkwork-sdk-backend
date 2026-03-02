from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VerificationVO:
    """验证响应视图对象"""
    created_at: str = None
    updated_at: str = None
    success: bool = None
    message: str = None
    token: str = None
