from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OAuthLoginResponse:
    provider: str = None
    auth_url: str = None
    state: str = None
    expires_in: int = None
