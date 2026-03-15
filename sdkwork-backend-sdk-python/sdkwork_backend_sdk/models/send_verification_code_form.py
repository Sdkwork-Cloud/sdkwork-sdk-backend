from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SendVerificationCodeForm:
    """鍙戦€侀獙璇佺爜璇锋眰琛ㄥ崟"""
    identifier: str
    method: str
    type: str
