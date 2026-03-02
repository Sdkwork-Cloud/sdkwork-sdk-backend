using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AlipayObject
    {
        public string? PayUrl { get; set; }
        public string? Sign { get; set; }
        public string? OutTradeNo { get; set; }
        public string? TradeNo { get; set; }
        public string? AppId { get; set; }
        public string? Method { get; set; }
        public string? QrCode { get; set; }
    }
}
