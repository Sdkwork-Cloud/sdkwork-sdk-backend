using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class OAuthLoginResponse
    {
        public string? Provider { get; set; }
        public string? AuthUrl { get; set; }
        public string? State { get; set; }
        public int? ExpiresIn { get; set; }
    }
}
