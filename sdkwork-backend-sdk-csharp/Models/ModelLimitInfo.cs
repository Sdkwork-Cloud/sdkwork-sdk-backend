using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ModelLimitInfo
    {
        public string? Unit { get; set; }
        public List<ModelLimitItem>? Items { get; set; }
    }
}
