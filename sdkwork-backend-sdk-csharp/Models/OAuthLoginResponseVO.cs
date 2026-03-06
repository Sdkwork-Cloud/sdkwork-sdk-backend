using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class OAuthLoginResponseVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Provider { get; set; }
        public string? AuthUrl { get; set; }
        public string? QrCodeUrl { get; set; }
        public string? QrCodeContent { get; set; }
        public int? ExpiresIn { get; set; }
    }
}
