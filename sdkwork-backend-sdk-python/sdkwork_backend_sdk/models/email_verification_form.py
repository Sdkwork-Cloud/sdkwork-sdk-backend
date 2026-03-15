from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class EmailVerificationForm:
    """閭楠岃瘉璇锋眰琛ㄥ崟"""
    email: str
    code: str
    type: str
