using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ClientPayObjects
    {
        public WechatPayObject? Wechat { get; set; }
        public AlipayObject? Alipay { get; set; }
        public ApplePayObject? ApplePay { get; set; }
        public PaypalObject? Paypal { get; set; }
        public StripeObject? Stripe { get; set; }
        public UnionPayObject? UnionPay { get; set; }
    }
}
