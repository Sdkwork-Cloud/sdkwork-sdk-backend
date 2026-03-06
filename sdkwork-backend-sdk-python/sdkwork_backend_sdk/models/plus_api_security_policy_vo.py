from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusApiSecurityPolicyVO:
    """API安全策略VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    policy_code: str = None
    api_type: str = None
    path_pattern: str = None
    http_method: str = None
    match_mode: str = None
    auth_mode: str = None
    allow_anonymous: bool = None
    required_roles: str = None
    required_permissions: str = None
    priority: int = None
    enabled: bool = None
    description: str = None
