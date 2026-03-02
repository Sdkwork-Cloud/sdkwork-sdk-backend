using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class InstagramInfo
    {
        public string? UserId { get; set; }
        public string? Username { get; set; }
        public string? FullName { get; set; }
        public string? ProfilePictureUrl { get; set; }
        public string? Bio { get; set; }
        public string? Website { get; set; }
        public bool? IsBusinessAccount { get; set; }
    }
}
