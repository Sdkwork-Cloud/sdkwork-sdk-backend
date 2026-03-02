using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class RefreshTokenForm
    {
        public string? RefreshToken { get; set; }
    }
}
