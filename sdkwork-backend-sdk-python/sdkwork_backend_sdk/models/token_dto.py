from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TokenDTO:
    token: str = None
    refresh_token: str = None
    expires_in: int = None
    refresh_expires_in: int = None
    user_id: int = None
    im: Dict[str, Any] = None
