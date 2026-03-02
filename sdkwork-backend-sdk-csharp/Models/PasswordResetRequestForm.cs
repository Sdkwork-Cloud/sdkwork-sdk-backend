using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PasswordResetRequestForm
    {
        public string? Email { get; set; }
    }
}
