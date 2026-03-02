using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class FacebookInfo
    {
        public string? UserId { get; set; }
        public string? Username { get; set; }
        public string? Name { get; set; }
        public string? AvatarUrl { get; set; }
        public string? Email { get; set; }
        public string? Gender { get; set; }
        public string? Country { get; set; }
        public string? City { get; set; }
    }
}
