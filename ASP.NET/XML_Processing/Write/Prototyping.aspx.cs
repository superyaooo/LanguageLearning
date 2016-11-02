private void Window_Loaded(object sender, RoutedEventArgs e)
{
    DataSet ds = new DataSet();

    ds.ReadXml("App_Data/Employees.xml");

    lvEmps.View = PDSA.WPF.PDSAWPFListView.CreateGridViewColumns(ds.Tables[0]);
    lvEmps.DataContext = ds.Tables[0];
}