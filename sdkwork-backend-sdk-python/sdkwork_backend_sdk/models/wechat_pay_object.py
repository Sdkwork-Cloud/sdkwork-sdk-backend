from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WechatPayObject:
    """微信支付创建订单返回对象"""
    prepay_id: str = None
    mweb_url: str = None
    code_url: str = None
    time_stamp: str = None
    nonce_str: str = None
    sign_type: str = None
    pay_sign: str = None
    out_trade_no: str = None
    trade_type: str = None
