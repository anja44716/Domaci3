
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        <style>
        table, th, td {
        border: 1px solid black;
        }
</style>
    </head>
    <body style="background-color:lightgrey">
     
    <h3 style="color:darkblue;">OSNOVNI PODACI O POSLOVNOM PARTNERU: </h3>

    <form action="PoslovniPartneri" method="GET">
    
 <table style="width:80%">
  <tr>
    <td style="color:darkblue;"><i>Ime</i></td>
    <td><input type="text" name="ime" size="50" style="background-color:lightgoldenrodyellow"></td>
  </tr>
  <tr>
    <td style="color:darkblue;"><i>Adresa</i></td>
    <td><input type="text" name="adresa" size="80"></td>
  </tr>
  <tr>
    <td style="color:darkblue;"><i>E-mail</i></td>
    <td><input type="email" name="email" ></td>
  </tr>
  <tr>
    <td style="color:darkblue;"><i>Telefon</i></td>
    <td><input type="tel" name="telefon" ></td>
  </tr>
  <tr>
    <td style="color:darkblue;"><i>Zanimanje</i></td>
    <td>
        <select name="zanimanje">
            <option value="programer1">Programer1</option>
            <option value="programer2">Programer2</option>
            <option value="programer3">Programer3</option>
        </select>
    </td>
  </tr>
 </table>
    <h3 style="color:darkblue;"><i> Predznanje Jave</i> </h3>
    <h4 style="color:darkblue;"> <input type="radio" name="radio" value="nema"><i>Nema 
        <input type="radio" name="radio" value="malo">Malo 
        <input type="radio" name="radio" value="srednje">Srednje
        <input type="radio" name="radio" value="visoko">Visoko</i></h4>
    <h4 style="color:darkblue;"><i> Napomena </i></h4>
    <h4 style="color:darkblue;"> <textarea name="napomena" rows="4" cols="25"></textarea> </h4>
    <h4 style="color:darkblue;"> <input type="checkBox" name="cuvanje" value="cuvanje"> <i>Da li zelite da budete sacuvani u bazi?</i> </h4> 
    <input type="submit" value="Obradi partnera">
    <input type="reset" value="Obrisi formu">
    </form>
</body>
</html>
