using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class MobileAppSdkConfigVO
    {
        public string? PackageName { get; set; }
        public string? Version { get; set; }
        public string? AppKey { get; set; }
        public string? PushToken { get; set; }
    }
}
