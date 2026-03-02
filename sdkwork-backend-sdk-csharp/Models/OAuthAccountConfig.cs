using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class OAuthAccountConfig
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
        public string? AuthProvider { get; set; }
        public string? AppId { get; set; }
        public string? AppSecret { get; set; }
        public string? Token { get; set; }
        public string? RedirectUri { get; set; }
        public string? Scope { get; set; }
        public bool? IsServiceAccount { get; set; }
        public string? TeamId { get; set; }
        public string? KeyId { get; set; }
        public string? PrivateKey { get; set; }
        public string? PublicKey { get; set; }
        public string? EncodingAESKey { get; set; }
    }
}
