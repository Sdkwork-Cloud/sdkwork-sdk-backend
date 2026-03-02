using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class LogProbInfo
    {
        public List<string>? Tokens { get; set; }
        public List<double>? TokenLogprobs { get; set; }
        public List<int>? TextOffset { get; set; }
    }
}
