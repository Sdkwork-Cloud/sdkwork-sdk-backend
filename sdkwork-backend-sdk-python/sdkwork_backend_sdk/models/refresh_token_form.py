from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RefreshTokenForm:
    """鍒锋柊浠ょ墝璇锋眰琛ㄥ崟"""
    refresh_token: str
