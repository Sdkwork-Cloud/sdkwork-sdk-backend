from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AlipayObject:
    """支付宝支付创建订单返回对象"""
    pay_url: str = None
    sign: str = None
    out_trade_no: str = None
    trade_no: str = None
    app_id: str = None
    method: str = None
    qr_code: str = None
