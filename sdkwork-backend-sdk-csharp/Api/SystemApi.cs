using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class SystemApi
    {
        private readonly HttpClient _client;

        public SystemApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Apply invoice
        /// </summary>
        public async Task<PlusApiResultPlusSystemInvoiceVO?> ApplyAsync(PlusSystemInvoiceApplyForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusSystemInvoiceVO>(ApiPaths.BackendPath("/system/invoice/apply"), body);
        }

        /// <summary>
        /// Query invoice page
        /// </summary>
        public async Task<PlusApiResultPagePlusSystemInvoiceVO?> ListByPageAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePlusSystemInvoiceVO>(ApiPaths.BackendPath("/system/invoice/page"), query);
        }
    }
}
