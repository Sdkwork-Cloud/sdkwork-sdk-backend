using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class TokenResult
    {
        public string? Token { get; set; }
        public string? ExpiresInMs { get; set; }
        public string? CreatedAt { get; set; }
        public bool? Expired { get; set; }
    }
}
