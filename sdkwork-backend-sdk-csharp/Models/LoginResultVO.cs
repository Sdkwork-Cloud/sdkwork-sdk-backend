using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class LoginResultVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Token { get; set; }
        public string? RefreshToken { get; set; }
        public int? ExpiresIn { get; set; }
        public int? RefreshExpiresIn { get; set; }
        public int? UserId { get; set; }
        public UserVO? User { get; set; }
    }
}
