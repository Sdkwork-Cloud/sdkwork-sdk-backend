from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OAuthLoginRequestForm:
    """OAuth login request form"""
    provider: str = None
    redirect_uri: str = None
    scope: str = None
    state: str = None
