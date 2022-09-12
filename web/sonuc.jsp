<%-- 
    Document   : sonuc
    Created on : 9 Eyl 2022, 08:33:55
    Author     : ASUS PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sonuç Sayfası</title>
</head>
<body>
   <jsp:useBean id="hesapMakinesiBean" class="bean.veri"></jsp:useBean>
  <jsp:setProperty property="*" name="hesapMakinesiBean"/>
  <%
  try{
     hesapMakinesiBean.hesapla();
   }catch(Exception e){
      out.write(e.getMessage());
   }
   %>
  <br/>--------------------------------------<br/>
  Hesaplama sonucu:
  <jsp:getProperty property="sayi1" name="hesapMakinesiBean"/>
  <jsp:getProperty property="islem" name="hesapMakinesiBean"/>
  <jsp:getProperty property="sayi2" name="hesapMakinesiBean"/>
  =
  <jsp:getProperty property="sonuc" name="hesapMakinesiBean"/>
  <br/>--------------------------------------<br/>
  
  <br/>
</body>
</html>
