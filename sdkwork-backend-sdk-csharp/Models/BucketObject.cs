using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class BucketObject
    {
        public string? Name { get; set; }
        public string? Region { get; set; }
        public string? CreationDate { get; set; }
        public string? Arn { get; set; }
    }
}
