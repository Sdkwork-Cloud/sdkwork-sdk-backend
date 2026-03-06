from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusSystemInvoiceApplyForm:
    """系统发票申请表单"""
    title: str
    tax_id: str = None
    type: str
    amount: float
    content: str
    email: str = None
    address: str = None
