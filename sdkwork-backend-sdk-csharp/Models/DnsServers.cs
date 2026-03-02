using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class DnsServers
    {
        public List<DnsServer>? Servers { get; set; }
        public bool? Empty { get; set; }
    }
}
