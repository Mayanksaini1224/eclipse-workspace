<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP File</title>
</head>
<body>
<h1 style="color:green;text-align:center">This is  a JSP Page .</h1>
<%!
//declaretive tag
int a =10;
String name ="Mayank";
%>
<h2 style="color:red;text-align:center">
<%
//scriptlet tag 
out.print("this is Scriptlet tag Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length: a paragraph is a group of at least five sentences, a paragraph is half a page long, etc. In reality, though, the unity and coherence of ideas among sentences is what constitutes a paragraph. A paragraph is defined as “a group of sentences or a single sentence that forms a unit” (Lunsford and Connors 116). Length and appearance do not determine whether a section in a paper is a paragraph. For instance, in some styles of writing, particularly journalistic styles, a paragraph can be just one sentence long. Ultimately, a paragraph is a sentence or group of sentences that support one main idea. In this handout, we will refer to this as the “controlling idea,” because it controls what happens in the rest of the paragraph.");
out.print(a);
out.print(name);
response.sendRedirect("https://www.youtube.com/");
%></h2>

<%=
//Expression tag
"hiiii this is expression tag"
%>
<br>
<%=
name
%>
</body>
</html>