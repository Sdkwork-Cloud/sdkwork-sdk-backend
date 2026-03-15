from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PasswordResetRequestForm:
    """瀵嗙爜閲嶇疆璇锋眰琛ㄥ崟"""
    email: str
