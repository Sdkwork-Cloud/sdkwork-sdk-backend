using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class TelegramInfo
    {
        public int? UserId { get; set; }
        public string? Username { get; set; }
        public string? FullName { get; set; }
        public string? PhoneNumber { get; set; }
        public string? LanguageCode { get; set; }
    }
}
