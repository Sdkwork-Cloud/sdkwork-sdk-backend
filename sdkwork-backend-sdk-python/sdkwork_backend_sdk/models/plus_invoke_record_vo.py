from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusInvokeRecordVO:
    """Invocation record VO (records API calls, function calls, and other invocation behaviors)"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    type: str = None
    api_endpoint: str = None
    function_name: str = None
    request_params: Dict[str, Any] = None
    headers: Dict[str, Any] = None
    status: str = None
    duration: int = None
    error_msg: str = None
    user_id: int = None
    client_ip: str = None
    client_location: str = None
    user_agent: str = None
    browser_info: str = None
    client_id: str = None
