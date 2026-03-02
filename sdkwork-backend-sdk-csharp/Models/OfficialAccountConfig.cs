using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class OfficialAccountConfig
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
        public string? Secret { get; set; }
        public string? AesKey { get; set; }
        public string? QrCodeUrl { get; set; }
        public string? OriginalId { get; set; }
        public string? NotifyUrl { get; set; }
        public bool? SecurityModeEnabled { get; set; }
        public string? AccessToken { get; set; }
        public int? AccessTokenExpiresIn { get; set; }
        public int? AccessTokenFetchTime { get; set; }
        public bool? JsSdkEnabled { get; set; }
        public string? JsApiDomain { get; set; }
        public string? EncodingAESKey { get; set; }
    }
}
