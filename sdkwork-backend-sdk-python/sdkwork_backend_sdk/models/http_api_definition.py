from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class HttpApiDefinition:
    api_name: str = None
    description: str = None
    base_url: str = None
    path: str = None
    method: str = None
    headers: Dict[str, str] = None
    parameters: Dict[str, Any] = None
    request_format: str = None
    response_format: str = None
    authenticated: bool = None
    timeout_millis: int = None
    request_body_format: str = None
    request_body: Dict[str, Any] = None
    auth_type: str = None
    auth_params: Dict[str, Any] = None
