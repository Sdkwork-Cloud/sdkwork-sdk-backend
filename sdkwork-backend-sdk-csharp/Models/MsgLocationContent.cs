using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class MsgLocationContent
    {
        public string? Content { get; set; }
        public GeoPoint? Location { get; set; }
        public string? Address { get; set; }
        public string? Name { get; set; }
        public double? Radius { get; set; }
    }
}
