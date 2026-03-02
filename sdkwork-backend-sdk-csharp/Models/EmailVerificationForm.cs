using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class EmailVerificationForm
    {
        public string? Email { get; set; }
        public string? Code { get; set; }
        public string? Type { get; set; }
    }
}
