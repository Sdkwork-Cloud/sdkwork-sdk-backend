using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class DnsRecordValue
    {
        public List<string>? Values { get; set; }
        public bool? Empty { get; set; }
        public string? FirstValue { get; set; }
    }
}
