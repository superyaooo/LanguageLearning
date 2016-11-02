private void writeFromDatabase()
{
    DataSet ds = new DataSet("Customers");   // sets the root
    SqlDataAdapter da;

    da = new SqlDataAdapter("SELECT * FROM SalesLT.Customer", "App_Data/Customers.xml");

    da.Fill(ds);
    ds.Tables[0].TableName = "Customers";   // Set the element names

    ds.WriteXml("App_Data/Customers.xml");

    System.Diagnostics.Process.Start("App_Data/Customers.xml");
}