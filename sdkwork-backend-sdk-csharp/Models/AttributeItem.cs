using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AttributeItem
    {
        public int? Id { get; set; }
        public string? Name { get; set; }
        public List<string>? Values { get; set; }
    }
}
