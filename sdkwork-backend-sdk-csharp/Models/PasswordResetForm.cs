using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PasswordResetForm
    {
        public string? Token { get; set; }
        public string? NewPassword { get; set; }
    }
}
