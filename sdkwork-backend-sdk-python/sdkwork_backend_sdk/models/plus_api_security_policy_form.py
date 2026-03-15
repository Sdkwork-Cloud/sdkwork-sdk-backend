from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiSecurityPolicyForm:
    """API瀹夊叏绛栫暐琛ㄥ崟"""
    policy_code: str
    api_type: str
    path_pattern: str
    http_method: str = None
    match_mode: str
    auth_mode: str
    allow_anonymous: bool = None
    required_roles: str = None
    required_permissions: str = None
    priority: int = None
    enabled: bool = None
    description: str = None
