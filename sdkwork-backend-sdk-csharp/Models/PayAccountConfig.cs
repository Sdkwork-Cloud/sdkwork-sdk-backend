using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PayAccountConfig
    {
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Region { get; set; }
        public int? Weight { get; set; }
        public string? Channel { get; set; }
        public string? Product { get; set; }
        public List<string>? Functions { get; set; }
        public AccountConfigMetadata? Metadata { get; set; }
        public Dictionary<string, object>? Properties { get; set; }
        public string? MerchantId { get; set; }
        public string? AppId { get; set; }
        public string? PrivateKey { get; set; }
        public string? PublicKey { get; set; }
        public string? SecretKey { get; set; }
        public string? NotifyUrl { get; set; }
        public string? ReturnUrl { get; set; }
        public string? GatewayUrl { get; set; }
        public string? PayType { get; set; }
    }
}
