using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GeoPoint
    {
        public double? Longitude { get; set; }
        public double? Latitude { get; set; }
        public bool? Valid { get; set; }
    }
}
