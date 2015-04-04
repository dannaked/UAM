<%@page import="sun.nio.fs.GnomeFileTypeDetector"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<%@page import="Modelo.*"%>
<%@page import="ModeloDeAplicacion.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ManejadorDeDatos.*"%>

	
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Noticias UAM</title>

</head>
<body>
<s:property/>

<h1>Noticias UAM</h1>
	<%
	
	
	GeneradorNoticia GN = new GeneradorNoticia();
	
	GeneradorListaNoticias gl = new GeneradorListaNoticias();
	ListaNoticias ln = gl.listaNoticiasAleatoria();
	
	String HTML = new String();
	for( int i = 0; i < 8; i++ ){
	
		HTML = HTML + ln.getHTMLNoticia(i);
	}
	
	Noticia n1 = GN.noticiaAleatoria();
	Noticia n2 = GN.noticiaAleatoria();
	Noticia n3 = GN.noticiaAleatoria();
	
	

	
	
	%>
	
	<h2>Noticias</h2>
	
	<ul>
		<%= HTML
		%>
	</ul>
		<h3><%=	n1.getTituloNoticia()%></h3>
		<p><%= n1.getAutorNoticia()%></p>
	
	
	<br>
	<h3><%=	n2.getTituloNoticia()%></h3>
	<p><%= n2.getAutorNoticia()%></p>
	<br>
	<h3><%=	n3.getTituloNoticia()%></h3>
	<p><%= n3.getAutorNoticia()%></p>
	
	
	
</body>
</html>