using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class OfficialAccountSdkConfigVO
    {
        public bool? Debug { get; set; }
        public string? AppId { get; set; }
        public string? Timestamp { get; set; }
        public string? NonceStr { get; set; }
        public string? Signature { get; set; }
        public List<string>? JsApiList { get; set; }
    }
}
