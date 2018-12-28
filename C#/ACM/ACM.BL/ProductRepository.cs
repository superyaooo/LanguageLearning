using System;
namespace ACM.BL
{
    public class ProductRepository
    {
        public Product Retrieve(int productId)
        {
            Product product = new Product(productId);

            if(productId == 2) 
            {
                product.ProductName = "Sunflowers";
                product.ProductDescription = "Assorted Size";
                product.CurrentPrice = 15.96M;
            }

            return product;
        }

        public bool Save(Product product)
        {
            var success = true;

            if(product.HasChanges && product.IsValid)
            {
                if (product.IsNew)
                {
                    // call Insert Stored Procedure
                }
                else
                {
                    // call Update Stored Procedure
                }
            }

            return success;
        }

    }
}
