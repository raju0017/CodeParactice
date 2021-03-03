<jsp:useBean id="id1" class="com.jsp.DB_bean">
<jsp:setProperty property="*" name="id1"/>
</jsp:useBean>
<%@page import="java.util.*"%>
<%
int k = id1.bm();
if ( k!=-10)
{
	out.print("reow updated: "+k);
}
if(k==-100)
{
	ArrayList al = id1.getData();
	Iterator itr =al.iterator();
	while(itr.hasNext())
	{
		Object obj = itr.next();
		out.print(obj.toString()+"<br>");
	}
}


%>