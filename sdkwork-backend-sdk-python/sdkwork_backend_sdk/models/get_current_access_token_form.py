from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GetCurrentAccessTokenForm:
    """鑾峰彇褰撳墠绉熸埛/缁勭粐璁块棶浠ょ墝璇锋眰"""
    app_id: int
    platform: str
