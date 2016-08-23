private void SimpleWriting()
{
    XmlWriter writer;

    //create the xml writer
    writer = XmlWriter.Create("Samples/employees.xml");
    //write a start element (Root)
    writer.WriteStartElement("Employees");
    //write a start element (Parent)
    writer.WriteStartElement("Employee");

    //write a start element (Child)
    writer.WriteStartElement("id");
    //write the value
    writer.WriteString("1");
    //write the end element
    writer.WriteEndElement();
    .
    .
    .

    //write the end element (Parent)
    writer.WriteEndElement();
    //write the end element (Root)
    writer.WriteEndElement();
    //close the writer
    writer.Close();

    valueLabel.Text = File.ReadAllText("Samples/employees.xml");
}

private void WriteAttributes()
{
    XmlWriter writer;

    writer = XmlWriter.Create("Samples/employees.xml");
    writer.WriteStartElement("Employees");
    writer.WriteStartElement("Employee");
    //write an attribute
    writer.WriteAttributeString("id", "1");
    writer.WriteStartElement("FirstName");
    writer.WriteString("Bruce");
    writer.WriteEndElement();
    .
    .
    .
    writer.WriteEndElement();
    writer.WriteEndElement();
    writer.Close();

    valueLabel.Text = File.ReadAllText("Samples/employees.xml");
}

private void FormattingSample()
{
    XmlWriter writer;
    XmlWriterSettings settings = new XmlWriterSettings();

    //set the format options
    settings.Encoding = Encoding.UTF8;
    settings.Indent = true;

    //create an xml file using the format options
    writer = XmlWriter.Create("Samples/employees.xml");

    writer.WriteStartElement("Employees");
    writer.WriteStartElement("Employee");
    writer.WriteStartElement("FirstName");
    writer.WriteString("Bruce");
    writer.WriteEndElement();
    .
    .
    .
    writer.WriteEndElement();
    writer.WriteEndElement();
    writer.Close();

    valueLabel.Text = File.ReadAllText("Samples/employees.xml");
}

private void WriteStringBuilder()
{
    XmlWriter writer;
    StringBuilder sb = new StringBuilder();
    XmlWriterSettings settings = new XmlWriterSettings();

    //set the format options
    settings.Encoding = Encoding.UTF8;
    settings.Indent = true;

    //create into a StringBuilder
    writer = XmlWriter.Create(sb, settings);

    writer.WriteStartElement("Employees");
    writer.WriteStartElement("Employee");
    writer.WriteStartElement("FirstName");
    writer.WriteString("Bruce");
    writer.WriteEndElement();
    .
    .
    .
    writer.WriteEndElement();
    writer.WriteEndElement();
    writer.Close();

    valueLabel.Text = sb.ToString();
}