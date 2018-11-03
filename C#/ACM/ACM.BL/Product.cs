﻿using System;
namespace ACM.BL
{
    public class Product
    {
        public Product()
        {
        }

        public Product(int productId) 
        {
            this.ProductId = productId;
        }

        public Decimal? CurrentPrice { get; set; }
        public int ProductId { get; private set; }
        public string ProductDescription { get; set; }
        public string ProductName { get; set; }

        public Product Retrieve(int productId) 
        {
            return new Product();
        }

        public bool Save() 
        {
            return true;
        }

        public bool Validate() 
        {
            var isValid = true;

            if (string.IsNullOrWhiteSpace(ProductName)) isValid = false;
            if (CurrentPrice == null) isValid = false;

            return isValid;
        }
    }
}
