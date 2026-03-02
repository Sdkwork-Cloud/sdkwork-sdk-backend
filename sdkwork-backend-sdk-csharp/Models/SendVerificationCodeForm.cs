using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class SendVerificationCodeForm
    {
        public string? Identifier { get; set; }
        public string? Method { get; set; }
        public string? Type { get; set; }
    }
}
