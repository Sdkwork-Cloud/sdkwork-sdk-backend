from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class QrCodeConfirmForm:
    """QR code confirmation form"""
    qr_key: str
    token: str
