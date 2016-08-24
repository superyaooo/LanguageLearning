private void WriteSchema()
{
    DataSet ds = new DataSet();
    StringBuilder sb = new StringBuilder();

    ds.ReadXml("\App_Data\Employees.xml");

    ds.WriteXml("Samples\Employees.xml");
    ds.WriteXmlSchema("Samples\Employees.xsd");

    valueLabel.Text = File.ReadAllText("Samples\Employees.xsd");
}

private void StringToDataSet()
{
    DataSet ds = new DataSet();
    StringReader rdr;
    StringBuilder sb = new StringBuilder();

    sb.Append("<Products>");
    sb.Append("  <Product>");
    sb.Append("    <ProductID>1</ProductID>");
    sb.Append("    <ProductName>Chai</ProductName>");
    sb.Append("  </Product>");
    sb.Append("</Products>");

    rdr = new System.IO.StringReader(sb.ToString());

    ds = new DataSet();
    ds.ReadXml(rdr);
    ds.WriteXml("Samples\Products.xml");

    valueLabel.Text = File.ReadAllText("Samples\Products.xml");
}