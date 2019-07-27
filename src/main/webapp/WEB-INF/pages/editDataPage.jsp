<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%--
  Created by IntelliJ IDEA.
  User: yansolo
  Date: 11.11.2018
  Time: 23:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Redactor</title>
    <link href="<c:url value="/WEB-INF/css/style.css"/>" type="text/css" rel="stylesheet">
    <link href="<c:url value="/WEB-INF/js/editDataPage.js"/>" type="text/javascript">

</head>
<body><div class="app">
    <h2 class="block-title">Таблицы из база данных</h2>

    <div class="dropBox" >
        <select class = "dropBoxSelectTable" name="table" >
            <option value="CompProduct">Computationy Product</option>
            <option value="ConfigProduct">Config Product</option>
            <option value="AllDay">AllDay</option>
        </select>
    </div>
    <div class="tableDiv">
        <table>
            <thead class="table-header">
            <tr>
                <th>Id</th>
                <th>All Mass</th>
                <th>Day Mass</th>
                <th>Night Mass</th>
                <th>All MassSV</th>
                <th>Day MassSV</th>
                <th>Night MassSV</th>
                <th>All MassWater</th>
                <th>Day MassWater</th>
                <th>Night MassWater</th>
                <th>Day RelationSV</th>
                <th>Night RelationSV</th>
                <th>All RelationSV</th>
                <th>Day SerovodorodDay</th>
                <th>All SerovodorodNight</th>
                <th>GPA</th>
                <th>Date</th>
                <th>1>Перейти к сырью</th>
            </tr>

            </thead>
            <tbody>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr class="trClass">
                <td name="id" class="row-id">Id</td>
                <td name="allMass" data-value={param}>{param}</td>
                <td name="dayMass">Day Mass</td>
                <td name="nightMass">Night Mass</td>
                <td name="allMassSV ">All MassSV</td>
                <td >Day MassSV</td>
                <td>Night MassSV</td>
                <td>All MassWater</td>
                <td>Day MassWater</td>
                <td>Night MassWater</td>
                <td>Day RelationSV</td>
                <td>Night RelationSV</td>
                <td>All RelationSV</td>
                <td>Day SerovodorodDay</td>
                <td>All SerovodorodNight</td>
                <td>GPA</td>
                <td>Date</td>
                <td>Перейти к сырью</td>
            </tr>
            <tr > </tr>
            </tbody>
        </table>
    </div>

</div>
</body>
</html>
