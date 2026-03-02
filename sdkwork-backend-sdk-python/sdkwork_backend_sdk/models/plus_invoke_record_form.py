from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusInvokeRecordForm:
    """Invocation record creation form"""
    type: str
    api_endpoint: str = None
    function_name: str = None
    request_params: Dict[str, Any] = None
    headers: Dict[str, Any] = None
    status: str
    duration: int = None
    error_msg: str = None
    user_id: int = None
    client_ip: str = None
    client_location: str = None
    user_agent: str = None
    browser_info: str = None
    client_id: str = None
