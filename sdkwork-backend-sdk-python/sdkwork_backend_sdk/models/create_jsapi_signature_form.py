from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CreateJsapiSignatureForm:
    """创建JSAPI签名表单"""
    url: str
