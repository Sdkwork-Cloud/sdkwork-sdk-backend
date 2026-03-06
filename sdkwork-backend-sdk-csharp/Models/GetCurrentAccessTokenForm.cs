using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GetCurrentAccessTokenForm
    {
        public int? AppId { get; set; }
        public string? Platform { get; set; }
    }
}
