<%@ Page Language="C#" Inherits="XML_Processing.Default" %>
<!DOCTYPE html>
<html>
<head runat="server">
	<title>Default</title>
</head>
<body>
	<form id="form1" runat="server">
		<fieldset>
				<legend>XDocument & XPath</legend>
				<asp:Button runat="server" Text="Read Employee nodes" OnClick="ReadNodes"/>
				<br />
				<asp:Button runat="server" Text="Read all nodes" OnClick="ReadAllNodes"/>
				<br />
				<asp:Button runat="server" Text="Get attributes" OnClick="GetAttributes"/>
				<br />
				<asp:Button runat="server" Text="Find by attribute" OnClick="FindByAttribute"/>
				<br />
				<asp:Label runat="server" id="lblResult"/>
		</fieldset>
	</form>
</body>
</html>
