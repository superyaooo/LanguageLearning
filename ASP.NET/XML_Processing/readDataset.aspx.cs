private void SimpleDataSet()
{
    DataSet ds = new DataSet();
    StringBuilder sb = new StringBuilder();

    ds.ReadXML("App_Data/employees.xml");

    foreach (DataRow dr in ds.Tables[0].Rows)
    {
        sb.AppendFormat("id={0}", dr["id"]);
        sb.AppendFormat("FirstName={0}", dr["FirstName"]);
    }
}

private void SelectMethod()
{
    DataSet ds = new DataSet();
    StringBuilder sb = new StringBuilder();
    DataRow[] rows;

    ds.ReadXML("App_Data/employees.xml");

    rows = ds.Tables[0].Select("LastName LIKE 's%'");

    foreach(DataRow dr in rows)
    {
        sb.AppendFormat("id={0}", dr["id"]);
        sb.AppendFormat("FirstName={0}", dr["FirstName"]);
    }
}

private void ReadSchema()
{
    DataSet ds = new DataSet();
    StringBuilder sb = new StringBuilder();

    // Read Schema file first
    ds.ReadXmlSchema("schema file path");
    ds.ReadXML("App_Data/employees.xml");
}

private void ReadSchemaBad()
{
    DataSet ds = new DataSet();
    StringBuilder sb = new StringBuilder();

    try
    {
        // Read Schema file first
        ds.ReadXmlSchema("schema file path");
        ds.ReadXML("App_Data/employees.xml");

        foreach (DataRow dr in ds.Tables[0].Rows)
        {
            sb.AppendFormat("id={0}", dr["id"]);
            sb.AppendFormat("FirstName={0}", dr["FirstName"]);
        }
    }
    catch (Exception ex)
    {
        // do something
    }
}

