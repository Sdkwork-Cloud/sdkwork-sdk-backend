from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ClientPayObjects:
    """Client Payment Objects Container"""
    wechat: WechatPayObject = None
    alipay: AlipayObject = None
    apple_pay: ApplePayObject = None
    paypal: PaypalObject = None
    stripe: StripeObject = None
    union_pay: UnionPayObject = None
