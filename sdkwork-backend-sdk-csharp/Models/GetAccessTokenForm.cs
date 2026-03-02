using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GetAccessTokenForm
    {
        public int? Id { get; set; }
        public List<string>? Platforms { get; set; }
    }
}
