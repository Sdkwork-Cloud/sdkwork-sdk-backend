using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class OAuthCallbackForm
    {
        public string? Provider { get; set; }
        public string? Code { get; set; }
        public string? State { get; set; }
    }
}
