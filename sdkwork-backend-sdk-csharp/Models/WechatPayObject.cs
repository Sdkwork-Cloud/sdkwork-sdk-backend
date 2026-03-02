using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class WechatPayObject
    {
        public string? PrepayId { get; set; }
        public string? MwebUrl { get; set; }
        public string? CodeUrl { get; set; }
        public string? TimeStamp { get; set; }
        public string? NonceStr { get; set; }
        public string? SignType { get; set; }
        public string? PaySign { get; set; }
        public string? OutTradeNo { get; set; }
        public string? TradeType { get; set; }
    }
}
