from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PhoneVerificationForm:
    """Phone verification request form"""
    phone: str
    code: str
    type: str
