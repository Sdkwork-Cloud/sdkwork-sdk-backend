using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class TokenDTO
    {
        public string? Token { get; set; }
        public string? RefreshToken { get; set; }
        public int? ExpiresIn { get; set; }
        public int? RefreshExpiresIn { get; set; }
        public int? UserId { get; set; }
        public Dictionary<string, object>? Im { get; set; }
    }
}
