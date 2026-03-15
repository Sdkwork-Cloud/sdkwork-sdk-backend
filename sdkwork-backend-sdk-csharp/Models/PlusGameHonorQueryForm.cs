using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameHonorQueryForm
    {
        public int? UserId { get; set; }
        public string? SeasonKey { get; set; }
    }
}
