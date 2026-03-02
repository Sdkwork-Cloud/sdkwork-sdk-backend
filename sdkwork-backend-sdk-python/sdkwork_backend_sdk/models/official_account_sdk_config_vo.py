from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OfficialAccountSdkConfigVO:
    """微信公众号JS-SDK配置"""
    debug: bool = None
    app_id: str = None
    timestamp: str = None
    nonce_str: str = None
    signature: str = None
    js_api_list: List[str] = None
