from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OAuthCallbackForm:
    """OAuth callback form"""
    provider: str = None
    code: str = None
    state: str = None
