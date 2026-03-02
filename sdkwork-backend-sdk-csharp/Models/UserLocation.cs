using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class UserLocation
    {
        public string? Type { get; set; }
        public Approximate? Approximate { get; set; }
    }
}
