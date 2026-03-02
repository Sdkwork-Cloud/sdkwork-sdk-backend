using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class LinkedInInfo
    {
        public string? UserId { get; set; }
        public string? Username { get; set; }
        public string? FullName { get; set; }
        public string? ProfilePictureUrl { get; set; }
        public string? Headline { get; set; }
        public string? Position { get; set; }
        public string? Company { get; set; }
        public string? Industry { get; set; }
        public string? Education { get; set; }
        public string? Location { get; set; }
    }
}
