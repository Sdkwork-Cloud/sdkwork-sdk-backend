using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class WhatsAppInfo
    {
        public string? UserId { get; set; }
        public string? PhoneNumber { get; set; }
        public string? DisplayName { get; set; }
        public string? ProfilePictureUrl { get; set; }
    }
}
