from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusSystemInvoiceApplyForm:
    """System invoice application form"""
    title: str
    tax_id: str = None
    type: str
    amount: float
    content: str
    email: str = None
    address: str = None
